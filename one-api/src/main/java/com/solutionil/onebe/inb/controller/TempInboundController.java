package com.solutionil.onebe.inb.controller;

import com.solutionil.onebe.buy.dto.response.PurchaseOrderApprResponse;
import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.inb.service.TempInboundService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/tempInbound")
public class TempInboundController {
    private final TempInboundService tempInboundService;

    @GetMapping("/popupPOList")
    public ResponseEntity<BaseResponse<List<PurchaseOrderApprResponse.POApprGrid>>> popupPOList() {
        List<PurchaseOrderApprResponse.POApprGrid> poApprGrids = tempInboundService.popupPOList();
        return ResponseEntity.ok(BaseResponse.success(poApprGrids));
    }
}
