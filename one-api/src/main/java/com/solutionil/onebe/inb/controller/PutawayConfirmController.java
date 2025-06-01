package com.solutionil.onebe.inb.controller;

import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.inb.dto.request.PutawayRequest;
import com.solutionil.onebe.inb.dto.request.PutawaySrchRequest;
import com.solutionil.onebe.inb.dto.response.PutawayConfirmGrid;
import com.solutionil.onebe.inb.dto.response.PutawayGrid;
import com.solutionil.onebe.inb.service.PutawayConfirmService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/putaway-confirm")
public class PutawayConfirmController {

    private final PutawayConfirmService service;


    @GetMapping("/list")
    public ResponseEntity<BaseResponse> findPutaways(PutawaySrchRequest request) {
        log.info("PutawaySrchRequest ={}", request);

        return ResponseEntity.ok(BaseResponse.success(service.findPutaways(request)));
    }

    @PostMapping("/confirm")
    public ResponseEntity<BaseResponse> confirmPutaways(@RequestBody List<PutawayRequest> request) {
        log.info("PutawayRequest ={}", request);
        service.confirmPutaway(request);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @DeleteMapping("/delete")
    public ResponseEntity<BaseResponse> deletePutaways(@RequestBody List<PutawayRequest> request) {
        log.info("PutawayRequest ={}", request);
        service.deletePutaway(request);
        return ResponseEntity.ok(BaseResponse.success());
    }
}
