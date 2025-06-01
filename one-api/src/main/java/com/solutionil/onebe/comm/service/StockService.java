package com.solutionil.onebe.comm.service;

import com.solutionil.onebe.comm.dto.DeductType;
import com.solutionil.onebe.comm.dto.request.BaseOutStockRequest;
import com.solutionil.onebe.comm.dto.request.BaseStockRequest;
import com.solutionil.onebe.comm.dto.response.BaseStockResponse;
import com.solutionil.onebe.comm.mapper.StockMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class StockService {
    private final StockMapper stockMapper;

    /**
     * 재고 조히
     */
    @Transactional(readOnly = true)
    public List<BaseStockResponse> findStocks(Integer compId, Integer bizId, Integer itemId) {
        return stockMapper.findStocks( compId,  bizId,  itemId);
    }

    /**
     * 재고 추가
     */
    public <T extends BaseStockRequest> void insertStock(T request) {
        stockMapper.insertStock(request);
    }

    /**
     * 재고 차감
     */
    public <T extends BaseStockRequest> void deductStock(T request) {
        stockMapper.deductStock(request);
    }

    /**
     * 재고 차감
     */
    public <T extends BaseStockRequest> void reservedStock(T request) {
        stockMapper.reservedStock(request);
    }

    /**
     * 재고 충분성 체크
     */
    public <T extends BaseStockRequest> boolean isStockSufficient(T request) {
        int availableStock = stockMapper.getAvailableStock(request);
        return availableStock >= request.getTotalQty();
    }

    /**
     * 재고 이력 기록
     */
    public <T extends BaseStockRequest> void insertStockHistory(T request) {
        stockMapper.insertStockHistory(request);
    }

    /**
     * 재고 이력 기록
     */
    public <T extends BaseStockRequest> void deleteStockHistory(T request) {
        stockMapper.deleteStockHistory(request);
    }

    public static BaseOutStockRequest calculateQty(int outboundPlannedQty, int stockQty, int itemsPerPallet, int itemsPerBox, int itemsPerCase) {
        int remainingQty = Math.min(outboundPlannedQty, stockQty); // 재고와 출고 수량 중 작은 값 사용

        int palletCount = remainingQty / itemsPerPallet; // 팔레트 개수 계산
        int remainingAfterPallets = remainingQty % itemsPerPallet; // 팔레트 계산 후 남은 수량

        int boxCount = remainingAfterPallets / itemsPerBox; // 박스 개수 계산
        int remainingAfterBoxes = remainingAfterPallets % itemsPerBox; // 박스 계산 후 남은 수량

        int caseCount = remainingAfterBoxes / itemsPerCase; // 케이스 개수 계산
        int remainingItems = remainingAfterBoxes % itemsPerCase; // 케이스 계산 후 남은 낱개 수량

        // 결과 출력
        System.out.println("출고 예정 수량: " + outboundPlannedQty);
        System.out.println("팔레트당 수량: " + itemsPerPallet);
        System.out.println("박스당 수량: " + itemsPerBox);
        System.out.println("케이스당 수량: " + itemsPerCase);
        System.out.println("피킹해야 할 팔레트 수량: " + palletCount);
        System.out.println("피킹해야 할 박스 수량: " + boxCount);
        System.out.println("피킹해야 할 케이스 수량: " + caseCount);
        System.out.println("남은 낱개 수량: " + remainingItems);

        BaseOutStockRequest outStockRequest = new BaseOutStockRequest();
        outStockRequest.setPalletQty(palletCount);
        outStockRequest.setBoxQty(boxCount);
        outStockRequest.setCaseQty(caseCount);
        outStockRequest.setEaQty(remainingItems);
        outStockRequest.setTotalQty(outboundPlannedQty);

        return outStockRequest;
    }


    /*public static BaseOutStockRequest calculateQty(int outboundPlannedQty, int stockQty, int itemsPerBox, int itemsPerCase) {
        int remainingQty = Math.min(outboundPlannedQty, stockQty); // 재고와 출고 수량 중 작은 값을 사용
        int boxCount = remainingQty / itemsPerBox; // 박스 개수 계산
        int remainingAfterBoxes = remainingQty % itemsPerBox; // 박스 계산 후 남은 수량

        int caseCount = remainingAfterBoxes / itemsPerCase; // 케이스 개수 계산
        int remainingItems = remainingAfterBoxes % itemsPerCase; // 케이스 계산 후 남은 낱개 수량

        // 결과 출력
        System.out.println("출고 예정 수량: " + outboundPlannedQty);
        System.out.println("박스당 수량: " + itemsPerBox);
        System.out.println("케이스당 수량: " + itemsPerCase);
        System.out.println("피킹해야 할 박스 수량: " + boxCount);
        System.out.println("피킹해야 할 케이스 수량: " + caseCount);
        System.out.println("남은 낱개 수량: " + remainingItems);

        BaseOutStockRequest outStockRequest = new BaseOutStockRequest();
        outStockRequest.setBoxQty(boxCount);
        outStockRequest.setCaseQty(caseCount);
        outStockRequest.setEaQty(remainingQty);
        outStockRequest.setTotalQty(outboundPlannedQty);

        return outStockRequest;
    }*/
}
