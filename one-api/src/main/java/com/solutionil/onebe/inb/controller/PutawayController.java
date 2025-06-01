package com.solutionil.onebe.inb.controller;

import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.inb.dto.request.InboundReqSrchRequest;
import com.solutionil.onebe.inb.dto.request.InboundRequest;
import com.solutionil.onebe.inb.dto.request.PutawayRequest;
import com.solutionil.onebe.inb.dto.request.PutawaySrchRequest;
import com.solutionil.onebe.inb.dto.response.InboundReqGrid;
import com.solutionil.onebe.inb.dto.response.PutawayGrid;
import com.solutionil.onebe.inb.service.InboundService;
import com.solutionil.onebe.inb.service.PutawayService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/putaway")
public class PutawayController {

    private final PutawayService putawayService;


    @GetMapping("/list")
    public ResponseEntity<BaseResponse> findInboundReqs(PutawaySrchRequest request) {
        log.info("PutawaySrchRequest ={}", request);
        List<PutawayGrid> putawayGridList = putawayService.findPutawayTargets(request);
        return ResponseEntity.ok(BaseResponse.success(putawayGridList));
    }

    @PostMapping("/save")
    public ResponseEntity<BaseResponse> saveInboundReqs(@RequestBody List<PutawayRequest> request) {
        log.info("PutawayRequest ={}", request);
        putawayService.processPutaway(request);
        return ResponseEntity.ok(BaseResponse.success());
    }
}
