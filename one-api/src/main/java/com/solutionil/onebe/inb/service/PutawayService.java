package com.solutionil.onebe.inb.service;

import com.solutionil.onebe.comm.service.StockService;
import com.solutionil.onebe.inb.dto.request.InboundRequest;
import com.solutionil.onebe.inb.dto.request.PutawayRequest;
import com.solutionil.onebe.inb.dto.request.PutawaySrchRequest;
import com.solutionil.onebe.inb.dto.response.PutawayGrid;
import com.solutionil.onebe.inb.mapper.PutawayMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class PutawayService {
    private final PutawayMapper putawayMapper;
    private final StockService stockService;  // StockService로 교체

    @Transactional
    public synchronized void processPutaway(List<PutawayRequest> requests) {

        for (PutawayRequest request : requests) {
            // 재고 충분성 체크
            if (!stockService.isStockSufficient(request)) {
                throw new IllegalStateException("입고 대기존에 충분한 재고가 없습니다.");
            }

            int sumPutawayQty = putawayMapper.getPutawayQtyByInboundId(request.getInboundId());

            if(sumPutawayQty  + request.getTotalQty() >= request.getInboundTotalQty())
                putawayMapper.updateInboundStatus(request.getInboundId());

            // 입고 로케이션에서 재고 차감
            stockService.reservedStock(request);

            // 적치 데이터 저장 및 적치 로케이션에 재고 추가
            putawayMapper.savePutaway(request);

        }
    }

    public List<PutawayGrid> findPutawayTargets(PutawaySrchRequest request){
        return putawayMapper.findPutawayTargets(request);
    }
}
