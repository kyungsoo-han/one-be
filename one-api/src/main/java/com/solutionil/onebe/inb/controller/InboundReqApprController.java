package com.solutionil.onebe.inb.controller;

import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.inb.dto.request.InboundReqApprRequest;
import com.solutionil.onebe.inb.dto.request.InboundReqApprSrchRequest;
import com.solutionil.onebe.inb.dto.response.InboundReqApprMainGrid;
import com.solutionil.onebe.inb.dto.response.InboundReqItemResponse;
import com.solutionil.onebe.inb.service.InboundReqApprService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/inbound-req-appr")
public class InboundReqApprController {

    private final InboundReqApprService reqApprService;

    @GetMapping("/main")
    public ResponseEntity<BaseResponse> findInboundReqApprMainGrid(InboundReqApprSrchRequest request) {
        log.info("InboundReqApprSrchRequest ={}", request);
        List<InboundReqApprMainGrid> inboundByReqMainGrid = reqApprService.findInboundReqApprMainGrid(request);
        return ResponseEntity.ok(BaseResponse.success(inboundByReqMainGrid));
    }
    @GetMapping("/{inboundReqId}")
    public ResponseEntity<BaseResponse> findInboundReqApprDetailGrid(@PathVariable Long inboundReqId) {
        log.info("Request id: {}", inboundReqId);
        List<InboundReqItemResponse> inboundByReqDetailGrid = reqApprService.findInboundReqApprDetailGrid(inboundReqId);
        return ResponseEntity.ok(BaseResponse.success(inboundByReqDetailGrid));
    }

    @PostMapping("/updateStatus")
    public ResponseEntity<BaseResponse> updateInboundReqStatus(@RequestBody InboundReqApprRequest request) {
        log.info("InboundReqApprRequest: {}", request);
        reqApprService.updateInboundReqStatus(request);
        return ResponseEntity.ok(BaseResponse.success());
    }

}
