package com.solutionil.onebe.mst.controller;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.mst.dto.entity.ProdLine;
import com.solutionil.onebe.mst.service.ProdLineService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/prod-line")
public class ProdLineController {

    private final ProdLineService prodLineService;

    @PostMapping
    public ResponseEntity insertProdLine(@RequestBody ProdLine request) {
        log.info("request = {}", request);
        prodLineService.insertProdLine(request);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @PutMapping
    public ResponseEntity updateProdLine(@RequestBody ProdLine request) {
        prodLineService.updateProdLine(request);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @DeleteMapping("/{prodLineId}")
    public ResponseEntity deleteProdLine(@PathVariable Integer prodLineId) {
        prodLineService.deleteProdLine(prodLineId);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @GetMapping("/{prodLineId}")
    public ResponseEntity selectProdLineById(@PathVariable Integer prodLineId) {
        return ResponseEntity.ok(BaseResponse.success(prodLineService.selectProdLineById(prodLineId)));
    }

    @GetMapping("/list")
    public ResponseEntity selectProdLineList(BaseSrchRequest request) {
        log.info("request ={}", request);
        return ResponseEntity.ok(BaseResponse.success(prodLineService.selectProdLineList(request)));
    }
}
