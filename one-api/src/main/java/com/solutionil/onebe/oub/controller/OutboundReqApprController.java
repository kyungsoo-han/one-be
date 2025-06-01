package com.solutionil.onebe.oub.controller;

import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.oub.dto.request.OutboundReqApprRequest;
import com.solutionil.onebe.oub.dto.request.OutboundReqApprSrchRequest;
import com.solutionil.onebe.oub.dto.response.OutboundReqApprMainGrid;
import com.solutionil.onebe.oub.dto.response.OutboundReqItemResponse;
import com.solutionil.onebe.oub.service.OutboundReqApprService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/outbound-req-appr")
public class OutboundReqApprController {

    private final OutboundReqApprService reqApprService;

    @GetMapping("/main")
    public ResponseEntity<BaseResponse> findOutboundReqApprMainGrid(OutboundReqApprSrchRequest request) {
        log.info("OutboundReqApprSrchRequest ={}", request);
        List<OutboundReqApprMainGrid> inboundByReqMainGrid = reqApprService.findOutboundReqApprMainGrid(request);
        return ResponseEntity.ok(BaseResponse.success(inboundByReqMainGrid));
    }
    @GetMapping("/{outboundReqId}")
    public ResponseEntity<BaseResponse> findOutboundReqApprDetailGrid(@PathVariable Long outboundReqId) {
        log.info("Request id: {}", outboundReqId);
        List<OutboundReqItemResponse> inboundByReqDetailGrid = reqApprService.findOutboundReqApprDetailGrid(outboundReqId);
        return ResponseEntity.ok(BaseResponse.success(inboundByReqDetailGrid));
    }

    @PostMapping("/updateStatus")
    public ResponseEntity<BaseResponse> updateOutboundReqStatus(@RequestBody OutboundReqApprRequest request) {
        log.info("OutboundReqApprRequest: {}", request);
        reqApprService.updateOutboundReqStatus(request);
        return ResponseEntity.ok(BaseResponse.success());
    }

}
