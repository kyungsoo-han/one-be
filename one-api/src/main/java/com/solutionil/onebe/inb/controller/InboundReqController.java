package com.solutionil.onebe.inb.controller;

import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.inb.dto.request.InboundReqRequest;
import com.solutionil.onebe.inb.dto.request.InboundReqSrchRequest;
import com.solutionil.onebe.inb.dto.response.InboundReqGrid;
import com.solutionil.onebe.inb.dto.response.InboundReqResponse;
import com.solutionil.onebe.inb.service.InboundReqService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/inbound-req")
public class InboundReqController {

    private final InboundReqService inboundReqService;

    @PostMapping
    public ResponseEntity<BaseResponse> insertInboundReq(@RequestBody InboundReqRequest request) {
        log.info("Request to insert InboundReq: {}", request);
        inboundReqService.insertInboundReq(request);
        return ResponseEntity.ok(BaseResponse.success(request));
    }
/*

    @PutMapping
    public ResponseEntity<BaseResponse> updateInboundReq(@RequestBody InboundReq request) {
        log.info("Request to update InboundReq: {}", request);
        purchaseOrderService.updateInboundReq(request);
        return ResponseEntity.ok(BaseResponse.success());
    }
*/

    @DeleteMapping("/{inboundReqId}")
    public ResponseEntity<BaseResponse> deleteInboundReq(@PathVariable Long inboundReqId) {
        log.info("Request to delete InboundReq with id: {}", inboundReqId);
        inboundReqService.deleteInboundReq(inboundReqId);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @GetMapping("/{inboundReqId}")
    public ResponseEntity<BaseResponse> findInboundReqById(@PathVariable Long inboundReqId) {
        log.info("Request to get InboundReq with id: {}", inboundReqId);
        InboundReqResponse purchaseOrder = inboundReqService.findInboundReqById(inboundReqId);
        return ResponseEntity.ok(BaseResponse.success(purchaseOrder));
    }

    @GetMapping("/list")
    public ResponseEntity<BaseResponse> findInboundReqs(InboundReqSrchRequest request) {
        log.info("InboundReqSrchRequest ={}", request);
        List<InboundReqGrid> purchaseOrders = inboundReqService.findInboundReqs(request);
        return ResponseEntity.ok(BaseResponse.success(purchaseOrders));
    }
}
