package com.solutionil.onebe.inb.controller;

import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.inb.dto.request.InboundRequest;
import com.solutionil.onebe.inb.service.InboundService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/inbound")
public class InboundController {

    private final InboundService inboundService;

    @PostMapping("/save")
    public ResponseEntity<BaseResponse> saveInbound(@RequestBody List<InboundRequest> request) {
        log.info("InboundRequest: {}", request);
        inboundService.saveInbound(request);
        return ResponseEntity.ok(BaseResponse.success());
    }

}
