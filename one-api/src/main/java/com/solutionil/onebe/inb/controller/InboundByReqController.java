package com.solutionil.onebe.inb.controller;

import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.inb.dto.request.InboundByReqSrchRequest;
import com.solutionil.onebe.inb.dto.response.InboundByReqMainGrid;
import com.solutionil.onebe.inb.dto.response.InboundReqItemResponse;
import com.solutionil.onebe.inb.service.InboundByReqService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/inbound-by-req")
public class InboundByReqController {

    private final InboundByReqService byReqService;

    @GetMapping("/main")
    public ResponseEntity<BaseResponse> findInboundByReqMainGrid(InboundByReqSrchRequest request) {
        log.info("InboundByReqSrchRequest ={}", request);
        List<InboundByReqMainGrid> inboundByReqMainGrid = byReqService.findInboundByReqMainGrid(request);
        return ResponseEntity.ok(BaseResponse.success(inboundByReqMainGrid));
    }
    @GetMapping("/{inboundReqId}")
    public ResponseEntity<BaseResponse> findInboundReqById(@PathVariable Long inboundReqId) {
        log.info("Request to get InboundReq with id: {}", inboundReqId);
        List<InboundReqItemResponse> inboundByReqDetailGrid = byReqService.findInboundByReqDetailGrid(inboundReqId);
        return ResponseEntity.ok(BaseResponse.success(inboundByReqDetailGrid));
    }
}
