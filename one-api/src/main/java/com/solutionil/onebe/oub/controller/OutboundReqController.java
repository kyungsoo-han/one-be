package com.solutionil.onebe.oub.controller;

import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.oub.dto.request.OutboundReqRequest;
import com.solutionil.onebe.oub.dto.request.OutboundReqSrchRequest;
import com.solutionil.onebe.oub.dto.response.OutboundReqGrid;
import com.solutionil.onebe.oub.dto.response.OutboundReqResponse;
import com.solutionil.onebe.oub.service.OutboundReqService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/outbound-req")
public class OutboundReqController {

    private final OutboundReqService outboundReqService;

    @PostMapping
    public ResponseEntity<BaseResponse> insertOutboundReq(@RequestBody OutboundReqRequest request) {
        log.info("Request to insert OutboundReq: {}", request);
        outboundReqService.insertOutboundReq(request);
        return ResponseEntity.ok(BaseResponse.success(request));
    }
/*

    @PutMapping
    public ResponseEntity<BaseResponse> updateOutboundReq(@RequestBody OutboundReq request) {
        log.info("Request to update OutboundReq: {}", request);
        purchaseOrderService.updateOutboundReq(request);
        return ResponseEntity.ok(BaseResponse.success());
    }
*/

    @DeleteMapping("/{outboundReqId}")
    public ResponseEntity<BaseResponse> deleteOutboundReq(@PathVariable Long outboundReqId) {
        log.info("Request to delete OutboundReq with id: {}", outboundReqId);
        outboundReqService.deleteOutboundReq(outboundReqId);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @GetMapping("/{outboundReqId}")
    public ResponseEntity<BaseResponse> findOutboundReqById(@PathVariable Long outboundReqId) {
        log.info("Request to get OutboundReq with id: {}", outboundReqId);
        OutboundReqResponse purchaseOrder = outboundReqService.findOutboundReqById(outboundReqId);
        return ResponseEntity.ok(BaseResponse.success(purchaseOrder));
    }

    @GetMapping("/list")
    public ResponseEntity<BaseResponse> findOutboundReqs(OutboundReqSrchRequest request) {
        log.info("OutboundReqSrchRequest ={}", request);
        List<OutboundReqGrid> purchaseOrders = outboundReqService.findOutboundReqs(request);
        return ResponseEntity.ok(BaseResponse.success(purchaseOrders));
    }
}
