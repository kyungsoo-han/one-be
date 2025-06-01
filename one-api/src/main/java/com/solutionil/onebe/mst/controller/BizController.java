package com.solutionil.onebe.mst.controller;

import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.mst.dto.request.BizRequest;
import com.solutionil.onebe.mst.dto.request.srch.BizSrchRequest;
import com.solutionil.onebe.mst.service.BizService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/biz")
public class BizController {

    private final BizService bizService;

    @PostMapping
    public ResponseEntity saveBiz(@RequestBody BizRequest request){
        log.info("BizRequest = {}", request);
        bizService.saveBiz(request);
        return ResponseEntity.ok(BaseResponse.success(request));
    }

    @DeleteMapping("/{bizCd}")
    public ResponseEntity saveBiz(@PathVariable String bizCd){
        bizService.deleteBiz(bizCd);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @GetMapping("/detail/{bizCd}")
    public ResponseEntity findBizById(@PathVariable String bizCd){
        return ResponseEntity.ok(BaseResponse.success(bizService.findBizById(bizCd)));
    }

    @GetMapping("/list")
    public ResponseEntity findBizs(BizSrchRequest request){
        log.info("request ={}", request);
        return ResponseEntity.ok(BaseResponse.success(bizService.findBizs(request)));
    }
}
