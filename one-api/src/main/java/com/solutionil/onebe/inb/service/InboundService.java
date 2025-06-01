package com.solutionil.onebe.inb.service;

import com.solutionil.onebe.comm.service.StockService;
import com.solutionil.onebe.inb.dto.request.InboundRequest;
import com.solutionil.onebe.inb.mapper.InboundMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Transactional
@Service
public class InboundService {
    private final InboundMapper inboundMapper;
    private final StockService stockService;  // StockService로 교체

    @Transactional
    public synchronized void saveInbound(List<InboundRequest> requests) {
        Map<String, Object> rcvZone = new HashMap<>();
        for (InboundRequest request : requests) {
            // Lot 번호 생성
            int nextLotNoSeq = extractNextLotNoSeq(request.getInboundDate());

            // LocationId, ZoneId, WarehouseId 설정
            request.setLocId(Integer.parseInt(rcvZone.get("loc_id").toString()));
            request.setZoneId(Integer.parseInt(rcvZone.get("zone_id").toString()));
            request.setWhId(Integer.parseInt(rcvZone.get("wh_id").toString()));

            // 각 InboundRequest에 Lot 번호 할당
            assignLotNoToChildren(request, nextLotNoSeq);

            // Inbound 저장
            inboundMapper.saveInbound(request);

            // StockService로 재고 처리
            stockService.insertStock(request);

            request.setIoType("I");
            request.setWorkType("INBOUND");

            stockService.insertStockHistory(request);
        }
    }

    private int extractNextLotNoSeq(String inboundDate) {
        String maxLotNo = inboundMapper.findMaxInboundLotNoByDate(inboundDate);
        if (maxLotNo != null && maxLotNo.length() >= 8) {
            String lastSeqStr = maxLotNo.substring(maxLotNo.length() - 8);
            return Integer.parseInt(lastSeqStr) + 1;
        }
        return 1;  // 기본값
    }

    private void assignLotNoToChildren(InboundRequest request, int nextLotNoSeq) {
        String newLotNo = generateLotNo(request.getInboundDate(), nextLotNoSeq);
        request.setLotNo(newLotNo);
    }

    private String generateLotNo(String inboundDate, int lotSeq) {
        return "I" + inboundDate.replace("-", "") + String.format("%08d", lotSeq);
    }
}
