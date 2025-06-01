package com.solutionil.onebe.buy.controller;

import com.solutionil.onebe.buy.dto.request.PurchaseOrderApprSrchRequest;
import com.solutionil.onebe.buy.dto.request.PurchaseOrderRequest;
import com.solutionil.onebe.buy.dto.request.PurchaseOrderSrchRequest;
import com.solutionil.onebe.buy.dto.response.PurchaseOrderApprResponse;
import com.solutionil.onebe.buy.dto.response.PurchaseOrderResponse;
import com.solutionil.onebe.buy.service.PurchaseOrderApprService;
import com.solutionil.onebe.comm.dto.response.BaseResponse;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/po-appr")
public class PurchaseOrderApprController {
    private final PurchaseOrderApprService purchaseOrderApprService;
    @Operation(summary = "구매 발주 승인", description = "구매 발주 승인 대상조회")
    @GetMapping("/list")
    public ResponseEntity<BaseResponse<List<PurchaseOrderApprResponse.POApprGrid>>> findPurchaseOrderMainGrid(PurchaseOrderApprSrchRequest.POApprGrid request) {
        log.info("PurchaseOrderApprSrchRequest.POApprGrid:{}", request);
        List<PurchaseOrderApprResponse.POApprGrid> purchaseOrderMainGrid = purchaseOrderApprService.findPurchaseOrderApproval(request);
        return ResponseEntity.ok(BaseResponse.success(purchaseOrderMainGrid));
    }

    @Operation(summary = "구매 발주 승인", description = "구매 발주 승인")
    @PostMapping
    public ResponseEntity<BaseResponse<?>> approvalPurchaseOrder(@RequestBody List<PurchaseOrderRequest.Approval> request) {
        log.info("PurchaseOrderRequest.Approval:{}", request);
        purchaseOrderApprService.approvalPurchaseOrder(request);
        return ResponseEntity.ok(BaseResponse.success());
    }


}
