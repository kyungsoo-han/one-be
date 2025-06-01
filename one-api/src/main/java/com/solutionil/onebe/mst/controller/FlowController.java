package com.solutionil.onebe.mst.controller;

import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.mst.dto.request.FlowMstRequest;
import com.solutionil.onebe.mst.dto.request.srch.FlowSrchRequest;
import com.solutionil.onebe.mst.dto.response.FlowResponse;
import com.solutionil.onebe.mst.dto.response.grid.FlowMainGrid;
import com.solutionil.onebe.mst.service.FlowService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/flow")
public class FlowController {

    private final FlowService flowService;

    @PostMapping
    public ResponseEntity<BaseResponse> InsertFlowMst(@RequestBody FlowMstRequest request){

        switch (request.getFlag()) {
            case "IN" :
                flowService.InsertFlowMst(request);
                break;
            case "UP" :
                flowService.UpdateFlowMst(request);
                break;
            default:
                break;
        }
        // ===============================================================
        // Success Return
        return ResponseEntity.ok(BaseResponse.success(request));
    }

    @GetMapping("/list")
    public ResponseEntity<BaseResponse> SelectFlowMainGrid(FlowSrchRequest request){
        // ===============================================================
        // Write Log
        log.info("SelectFlowMainGrid ={}", request);

        // ===============================================================
        // SELECT Service Call
        List<FlowMainGrid> flowMainGrid = flowService.SelectFlowMainGrid(request);

        return ResponseEntity.ok(BaseResponse.success(flowMainGrid));
    }

    @GetMapping("/detail/{flowCd}")
    public ResponseEntity<BaseResponse> SelectFlowDetailControl(@PathVariable String flowCd, FlowSrchRequest request){
        // ===============================================================
        // URL Param Set
        request.setFlowCd(flowCd);
        // ===============================================================
        // Write Log
        log.info("SelectFlowDetailControl ={}", request);

        // ===============================================================
        // SELECT Service Call
        FlowResponse flowResponse = flowService.SelectFlowDetailControl(request);


        return ResponseEntity.ok(BaseResponse.success(flowResponse));
    }
}
