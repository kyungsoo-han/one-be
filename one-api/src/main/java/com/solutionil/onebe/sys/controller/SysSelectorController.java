package com.solutionil.onebe.sys.controller;


import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.sys.dto.SelectorType;
import com.solutionil.onebe.sys.dto.entity.SysSelectorHeader;
import com.solutionil.onebe.sys.dto.request.SelectorSrchRequest;
import com.solutionil.onebe.sys.dto.request.SysSelectorDetailRequest;
import com.solutionil.onebe.sys.dto.request.SysSelectorMainRequest;
import com.solutionil.onebe.sys.dto.response.SysSelectorDetailGrid;
import com.solutionil.onebe.sys.dto.response.SysSelectorMainGrid;
import com.solutionil.onebe.sys.service.SysSelectorService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/sys-selector")
public class SysSelectorController {

    private final SysSelectorService selectorService;

    @GetMapping("/header")
    public ResponseEntity<BaseResponse> getSelectorHeader() {
        List<SysSelectorHeader> sysSelectorHeaders = selectorService.getSelectorHeader();
        return ResponseEntity.ok(BaseResponse.success(sysSelectorHeaders));
 }

    @GetMapping("/data/{selectorType}")
    public ResponseEntity<BaseResponse> getSelectorData(@PathVariable String selectorType, @ModelAttribute SelectorSrchRequest request) {
        log.info("selectorType: {}", selectorType);
        log.info("SelectorSrchRequest: {}", request);
        SelectorType type = SelectorType.fromString(selectorType);
        Object data = selectorService.getSelectorData(request, type);
        return ResponseEntity.ok(BaseResponse.success(data));
    }

    @PostMapping("/main/save")
    public ResponseEntity<BaseResponse> saveSelectorMain(@RequestBody SysSelectorMainRequest request) {
        selectorService.saveSelectorMain(request);
        return ResponseEntity.ok(BaseResponse.success(request));
    }

    @PostMapping("/detail/save")
    public ResponseEntity<BaseResponse> saveSelectorDetail(@RequestBody SysSelectorDetailRequest request) {
        selectorService.saveSelectorDetail(request);
        return ResponseEntity.ok(BaseResponse.success(request));
    }

    @DeleteMapping("/main/delete")
    public ResponseEntity<BaseResponse> saveSelectorMain(@RequestBody deleteSelectorMainRequest request) {
        selectorService.deleteSysSelectorMain(request.selectorGbn);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @DeleteMapping("/detail/delete")
    public ResponseEntity<BaseResponse> saveSelectorDetail(@RequestBody deleteSelectorDetailRequest request) {
        log.info("request={}", request);
        selectorService.deleteSysSelectorDetail(request.selectorGbn, request.fieldNm);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @GetMapping("/main/list")
    public ResponseEntity<BaseResponse> selectSysSelectorMainList(@RequestParam(required = false) String selectorGbn, @RequestParam(required = false) String selectorNm){
        List<SysSelectorMainGrid> sysSelectorMainResponses = selectorService.selectSysSelectorMainList(selectorGbn, selectorNm);
        return ResponseEntity.ok(BaseResponse.success(sysSelectorMainResponses));
    }
    @GetMapping("/detail/list/{selectorGbn}")
    public ResponseEntity<BaseResponse> selectSysSelectorDetailList(@PathVariable String selectorGbn){
        List<SysSelectorDetailGrid> sysSelectorDetailResponses = selectorService.selectSysSelectorDetailList(selectorGbn);
        return ResponseEntity.ok(BaseResponse.success(sysSelectorDetailResponses));
    }

    @Data
    static class deleteSelectorMainRequest{
        private String selectorGbn ;

    }
    @Data
    static class deleteSelectorDetailRequest{
        private String selectorGbn ;
        private String fieldNm ;

    }

}
