package com.solutionil.onebe.mst.controller;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.mst.dto.entity.Fac;
import com.solutionil.onebe.mst.service.FacService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/fac")
public class FacController {

    private final FacService facService;

    @PostMapping
    public ResponseEntity insertFac(@RequestBody Fac request) {
        log.info("request = {}", request);
        facService.insertFac(request);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @PutMapping
    public ResponseEntity updateFac(@RequestBody Fac request) {
        facService.updateFac(request);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @DeleteMapping("/{facId}")
    public ResponseEntity deleteFac(@PathVariable Integer facId) {
        facService.deleteFac(facId);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @GetMapping("/{facId}")
    public ResponseEntity findFacById(@PathVariable Integer facId) {
        return ResponseEntity.ok(BaseResponse.success(facService.findFacById(facId)));
    }

    @GetMapping("/list")
    public ResponseEntity findFacs(BaseSrchRequest request) {
        log.info("request ={}", request);
        return ResponseEntity.ok(BaseResponse.success(facService.findFacs(request)));
    }
}
