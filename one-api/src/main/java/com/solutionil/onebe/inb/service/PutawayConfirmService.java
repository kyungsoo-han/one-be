package com.solutionil.onebe.inb.service;

import com.solutionil.onebe.comm.dto.DeductType;
import com.solutionil.onebe.comm.service.StockService;
import com.solutionil.onebe.inb.dto.request.PutawayRequest;
import com.solutionil.onebe.inb.dto.request.PutawaySrchRequest;
import com.solutionil.onebe.inb.dto.response.PutawayConfirmGrid;
import com.solutionil.onebe.inb.dto.response.PutawayGrid;
import com.solutionil.onebe.inb.mapper.PutawayConfirmMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class PutawayConfirmService {
    private final PutawayConfirmMapper mapper;
    private final StockService stockService;  // StockService로 교체

    public List<PutawayConfirmGrid> findPutaways(PutawaySrchRequest request){
        return mapper.findPutaways(request);
    }

    @Transactional
    public void confirmPutaway(List<PutawayRequest> requests){
        for(PutawayRequest request : requests){

            mapper.confirmPutaways(request.getPutawayId());

            stockService.deductStock(request);

            stockService.insertStock(request);

            request.setIoType("I");
            request.setWorkType("PUTAWAY");

            // 재고 이력 기록
            stockService.insertStockHistory(request);
        }

    }
    @Transactional
    public void deletePutaway(List<PutawayRequest> requests){
        for(PutawayRequest request : requests){

            mapper.deletePutaways(request.getPutawayId(), request.getInboundId());

            request.setTotalQty(-request.getTotalQty());

            // 입고 로케이션에서 예약재고 원복
            stockService.reservedStock(request);

            request.setIoType("I");
            request.setWorkType("PUTAWAY");

            // 재고 이력 기록 삭제
            stockService.deleteStockHistory(request);
        }

    }
}
