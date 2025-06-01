package com.solutionil.onebe.mst.controller;

import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.mst.dto.request.CustRequest;
import com.solutionil.onebe.mst.dto.request.srch.CustSrchRequest;
import com.solutionil.onebe.mst.service.CustService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/cust")
public class CustController {

    private final CustService custService;

    @PostMapping
    public ResponseEntity insertCust(@RequestBody CustRequest request){
        System.out.println("request = " + request);
        log.info("request = {}", request);
        custService.insertCust(request);
        return ResponseEntity.ok(BaseResponse.success(request));
    }

    @DeleteMapping("/{custId}")
    public ResponseEntity deleteCust(@PathVariable Integer custId){
        custService.deleteCust(custId);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @GetMapping("/detail/{custId}")
    public ResponseEntity findCustById(@PathVariable Integer custId){
        return ResponseEntity.ok(BaseResponse.success(custService.findCustById(custId)));
    }

    @GetMapping("/list")
    public ResponseEntity findCusts(CustSrchRequest request){
        log.info("request ={}", request);
        return ResponseEntity.ok(BaseResponse.success(custService.findCusts(request)));
    }
}
