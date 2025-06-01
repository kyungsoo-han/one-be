package com.solutionil.onebe.buy.controller;

import com.solutionil.onebe.buy.dto.request.PurchaseOrderRequest;
import com.solutionil.onebe.buy.dto.request.PurchaseOrderSrchRequest;
import com.solutionil.onebe.buy.dto.response.PurchaseOrderResponse;
import com.solutionil.onebe.buy.service.PurchaseOrderService;
import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.inb.dto.request.InboundRequest;
import com.solutionil.onebe.inb.service.InboundService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/po")
public class PurchaseOrderController {
    private final PurchaseOrderService purchaseOrderService;
    @Operation(summary = "PO 저장", description = "구매 발주 저장")
    @PostMapping("/save")
    public ResponseEntity<BaseResponse> savePO(@RequestBody PurchaseOrderRequest.Save request) {
        log.info("PurchaseOrderRequest.Save: {}", request);
        purchaseOrderService.save(request);
        return ResponseEntity.ok(BaseResponse.success(request));
    }
    @Operation(summary = "구매 발주 메인 그리드", description = "구매 발주 메인 그리드")
    @GetMapping("/list")
    public ResponseEntity<BaseResponse<List<PurchaseOrderResponse.MainGrid>>> findPurchaseOrderMainGrid(PurchaseOrderSrchRequest.MainGrid request) {
        log.info("PurchaseOrderSrchRequest.MainGrid:{}", request);
        List<PurchaseOrderResponse.MainGrid> purchaseOrderMainGrid = purchaseOrderService.findPurchaseOrderMainGrid(request);
        return ResponseEntity.ok(BaseResponse.success(purchaseOrderMainGrid));
    }

    @Operation(summary = "구매 발주 메인 상세내용", description = "구매 발주 상세내용")
    @GetMapping("/detail/{poId}")
    public ResponseEntity<?> findPurchaseOrderDetail(@PathVariable Long poId) {
        log.info("poId:{}", poId);
        PurchaseOrderResponse.Detail purchaseOrderDetail = purchaseOrderService.findPurchaseOrderDetail(poId);
        return ResponseEntity.ok(BaseResponse.success(purchaseOrderDetail));
    }

    @Operation(summary = "구매 발주 삭제", description = "구매 발주 삭제")
    @DeleteMapping("/delete")
    public ResponseEntity<BaseResponse<PurchaseOrderRequest.Delete>> deletePurchaseOrder(@RequestBody PurchaseOrderRequest.Delete request ) {
        log.info("PurchaseOrderRequest.Delete:{}", request);

        purchaseOrderService.deleteById(request.getPoId());
        return ResponseEntity.ok(BaseResponse.success(request));
    }

}
