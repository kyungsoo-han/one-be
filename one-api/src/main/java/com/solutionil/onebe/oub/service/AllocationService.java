package com.solutionil.onebe.oub.service;

import com.solutionil.onebe.comm.dto.request.BaseOutStockRequest;
import com.solutionil.onebe.comm.dto.request.BaseStockRequest;
import com.solutionil.onebe.comm.dto.response.BaseStockResponse;
import com.solutionil.onebe.comm.service.StockService;
import com.solutionil.onebe.oub.dto.request.AllocationRequest;
import com.solutionil.onebe.oub.dto.request.AutoAllocationRequest;
import com.solutionil.onebe.oub.dto.request.AutoAllocationSrchRequest;
import com.solutionil.onebe.oub.dto.request.AutoAllocationSubRequest;
import com.solutionil.onebe.oub.dto.response.*;
import com.solutionil.onebe.oub.mapper.AllocationMapper;
import lombok.RequiredArgsConstructor;
import lombok.Synchronized;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class AllocationService {

    private final OutboundReqService outboundReqService;
    private final AllocationMapper allocationMapper;
    private final StockService stockService;

    @Transactional
    public void saveAutoAllocation(List<AutoAllocationRequest> request){
        allocationMapper.saveAutoAllocation(request);
    }

    public List<AutoAllocationMainGrid> findAutoAllocations(AutoAllocationSrchRequest request){
        return allocationMapper.findAutoAllocations(request);
    }

    @Transactional
    public void saveAutoAllocationSub(List<AutoAllocationSubRequest> requests) {
        for(AutoAllocationSubRequest request : requests){
            allocationMapper.saveAutoAllocationSub(request);
        }
    }

    public List<AutoAllocationDetailGrid> findAutoAllocationSubs(Long autoAllocationId ){
        return allocationMapper.findAutoAllocationSubs(autoAllocationId);
    }

    @Transactional
    public void deleteAutoAllocation(Long autoAllocationId){
        allocationMapper.deleteAutoAllocation(autoAllocationId);
    }

    @Transactional
    public void deleteAutoAllocationSub(Long autoAllocationId, Long outboundReqId){
        allocationMapper.deleteAutoAllocationSub(autoAllocationId, outboundReqId);
    }

    @Synchronized
    @Transactional
    public void runAutoAllocation(AutoAllocationRequest request) {
        // 모든 출고 요청과 관련된 품목을 한 번에 가져옴
        List<AutoAllocationDetailGrid> autoAllocationSubs = allocationMapper.findAutoAllocationSubs(request.getAutoAllocationId());

        // 각 출고 요청의 모든 품목들을 한 번에 처리
        List<Long> outboundReqIds = autoAllocationSubs.stream()
                .map(AutoAllocationDetailGrid::getOutboundReqId)
                .distinct()
                .collect(Collectors.toList());

        List<OutboundReqItemSum> allOutboundItems = outboundReqService.findOutboundReqItemSumById(outboundReqIds);

        // 품목별로 재고를 그룹화하여 조회 (품목 ID와 재고 리스트를 맵핑)
        Map<Integer, List<BaseStockResponse>> stockMap = allOutboundItems.stream()
                .collect(Collectors.toMap(
                        OutboundReqItemSum::getItemId,
                        item -> stockService.findStocks(request.getCompId(), request.getBizId(), item.getItemId())
                ));

        for (OutboundReqItemSum outboundReqItem : allOutboundItems) {
            List<BaseStockResponse> stocks = stockMap.get(outboundReqItem.getItemId());  // 해당 품목의 재고 목록 가져오기

            // 재고가 없는 경우 해당 품목의 할당을 건너뜀
            if (stocks == null || stocks.isEmpty()) {
                log.warn("재고를 찾지 못해 품목 ID {}의 할당을 건너뜁니다.", outboundReqItem.getItemId());
                continue;  // 다음 품목으로 넘어감
            }

            int remainingReqQty = outboundReqItem.getReqQty();  // 출고 예정 수량

            for (BaseStockResponse stock : stocks) {
                if (remainingReqQty <= 0) break;

                int availableQty = stock.getAvailableQty();
                int pickingQty = Math.min(remainingReqQty, availableQty);  // 가용한 수량만큼 차감

                log.info("remainingReqQty ={}",remainingReqQty);
                log.info("availableQty ={}",availableQty);
                log.info("pickingQty ={}",pickingQty);
                BaseOutStockRequest baseOutStockRequest = StockService.calculateQty(pickingQty, availableQty, stock.getPalletUnitQty(), stock.getBoxUnitQty(), stock.getCaseUnitQty());
                log.info("baseOutStockRequest ={}",baseOutStockRequest);

                AllocationRequest allocationRequest = AllocationRequest.builder()
                        .compId(request.getCompId())
                        .lotNo(stock.getLotNo())
                        .expDate(stock.getExpDate())
                        .previousLocId(stock.getLocId())
                        .ioType("O")
                        .itemId(stock.getItemId())
                        .locId(stock.getLocId())
                        .bizId(stock.getBizId())
                        .makeDate(stock.getMakeDate())
                        .totalQty(pickingQty)
                        .eaQty(baseOutStockRequest.getEaQty())
                        .boxQty(baseOutStockRequest.getBoxQty())
                        .caseQty(baseOutStockRequest.getCaseQty())
                        .palletQty(baseOutStockRequest.getPalletQty())
                        .autoAllocationId(request.getAutoAllocationId())
                        .build();
                log.info("allocationRequest ={}",allocationRequest);

                stockService.reservedStock(allocationRequest);

                log.info("remainingReqQty={}",remainingReqQty);
                log.info("계산");
                remainingReqQty -= pickingQty;
                log.info("remainingReqQty={}",remainingReqQty);

                allocationMapper.applyAllocation(allocationRequest);
                log.info("계산끝");
            }

            // 남은 출고 수량이 있어도 다음 품목으로 넘어감
            if (remainingReqQty > 0) {
                log.warn("가용 재고가 부족하여 일부 출고가 처리되지 않았습니다. 남은 출고 수량: {}", remainingReqQty);
                continue;  // 다음 품목으로 넘어감
            }
        }
    }





}
