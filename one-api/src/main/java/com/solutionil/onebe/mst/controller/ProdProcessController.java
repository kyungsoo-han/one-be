package com.solutionil.onebe.mst.controller;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.mst.dto.entity.ProdProcess;
import com.solutionil.onebe.mst.service.ProdProcessService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/prod-process")
public class ProdProcessController {

    private final ProdProcessService prodProcessService;

    @PostMapping
    public ResponseEntity insertProdProcess(@RequestBody ProdProcess request) {
        log.info("request = {}", request);
        prodProcessService.insertProdProcess(request);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @PutMapping
    public ResponseEntity updateProdProcess(@RequestBody ProdProcess request) {
        prodProcessService.updateProdProcess(request);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @DeleteMapping("/{prodProcessId}")
    public ResponseEntity deleteProdProcess(@PathVariable Integer prodProcessId) {
        prodProcessService.deleteProdProcess(prodProcessId);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @GetMapping("/{prodProcessId}")
    public ResponseEntity selectProdProcessById(@PathVariable Integer prodProcessId) {
        return ResponseEntity.ok(BaseResponse.success(prodProcessService.selectProdProcessById(prodProcessId)));
    }

    @GetMapping("/list")
    public ResponseEntity selectProdProcessList(BaseSrchRequest request) {
        log.info("request ={}", request);
        return ResponseEntity.ok(BaseResponse.success(prodProcessService.selectProdProcessList(request)));
    }
}
