package com.solutionil.onebe.oub.controller;

import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.oub.dto.request.AutoAllocationRequest;
import com.solutionil.onebe.oub.dto.request.AutoAllocationSrchRequest;
import com.solutionil.onebe.oub.dto.request.AutoAllocationSubRequest;
import com.solutionil.onebe.oub.dto.request.OutboundReqRequest;
import com.solutionil.onebe.oub.dto.response.AutoAllocationMainGrid;
import com.solutionil.onebe.oub.service.AllocationService;
import com.solutionil.onebe.oub.service.OutboundReqService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/allocation")
public class AllocationController {

    private final AllocationService allocationService;

    @PostMapping("/run")
    public ResponseEntity<BaseResponse> runAutoAllocation(@RequestBody AutoAllocationRequest request) {
        log.info("AutoAllocationRequest: {}", request);
        allocationService.runAutoAllocation(request);
        return ResponseEntity.ok(BaseResponse.success(request));
    }

    @PostMapping
    public ResponseEntity<BaseResponse> saveAutoAllocation(@RequestBody List<AutoAllocationRequest> request) {
        log.info("AutoAllocationRequest: {}", request);
        allocationService.saveAutoAllocation(request);
        return ResponseEntity.ok(BaseResponse.success(request));
    }

    @PostMapping("/sub")
    public ResponseEntity<BaseResponse> saveAutoAllocationSub(@RequestBody List<AutoAllocationSubRequest> request) {
        log.info("AutoAllocationRequest: {}", request);
        allocationService.saveAutoAllocationSub(request);
        return ResponseEntity.ok(BaseResponse.success(request));
    }

    @GetMapping("/main")
    public ResponseEntity<BaseResponse> findAutoAllocations(AutoAllocationSrchRequest request) {
        log.info("AutoAllocationSrchRequest: {}", request);
        return ResponseEntity.ok(BaseResponse.success(allocationService.findAutoAllocations(request)));
    }

    @GetMapping("/sub/{autoAllocationId}")
    public ResponseEntity<BaseResponse> findAutoAllocationSubs(@PathVariable Long autoAllocationId) {
        log.info("autoAllocationId: {}", autoAllocationId);
        return ResponseEntity.ok(BaseResponse.success(allocationService.findAutoAllocationSubs(autoAllocationId)));
    }

    @DeleteMapping("/main/{autoAllocationId}")
    public ResponseEntity<BaseResponse> deleteAutoAllocation(@PathVariable Long autoAllocationId) {
        log.info("autoAllocationId: {}", autoAllocationId);
        allocationService.deleteAutoAllocation(autoAllocationId);
        return ResponseEntity.ok(BaseResponse.success());
    }


    @DeleteMapping("/sub/{autoAllocationId}/{outboundReqId}")
    public ResponseEntity<BaseResponse> deleteAutoAllocationSub(@PathVariable Long autoAllocationId, @PathVariable Long outboundReqId) {
        log.info("autoAllocationId: {}", autoAllocationId);
        log.info("outboundReqId: {}", outboundReqId);
        allocationService.deleteAutoAllocationSub(autoAllocationId, outboundReqId);
        return ResponseEntity.ok(BaseResponse.success());
    }

}
