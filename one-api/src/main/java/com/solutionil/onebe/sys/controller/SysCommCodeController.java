package com.solutionil.onebe.sys.controller;


import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.sys.dto.request.SysCommCodeDetailRequest;
import com.solutionil.onebe.sys.dto.request.SysCommCodeMainRequest;
import com.solutionil.onebe.sys.dto.response.SysCommCodeDetailResponse;
import com.solutionil.onebe.sys.dto.response.SysCommCodeMainResponse;
import com.solutionil.onebe.sys.service.SysCommCodeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/sys-commcode")
public class SysCommCodeController {

    private final SysCommCodeService commCodeService;

    @GetMapping("/main/list")
    public ResponseEntity<BaseResponse> selectSysCommCodeMainList(@RequestParam(value = "commGbn", required = false) String commGbn,
                                                          @RequestParam(value = "commNm", required = false) String commNm) {
        List<SysCommCodeMainResponse> commCodeMainResponses = commCodeService.selectSysCommCodeMainList(commGbn, commNm);
        return ResponseEntity.ok(BaseResponse.success(commCodeMainResponses));
    }

    @GetMapping("/detail/list")
    public ResponseEntity<BaseResponse> selectSysCommCodeDetailList(@RequestParam(value = "commGbn") String commGbn) {
        List<SysCommCodeDetailResponse> commCodeDetailResponses = commCodeService.selectSysCommCodeDetailList(commGbn);
        return ResponseEntity.ok(BaseResponse.success(commCodeDetailResponses));
    }

    @PostMapping("/main/save")
    public ResponseEntity<BaseResponse> saveSysCommCodeMain(@RequestBody SysCommCodeMainRequest request){
        commCodeService.saveSysCommCodeMain(request);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @PostMapping("/detail/save")
    public ResponseEntity<BaseResponse> saveSysCommCodeDetail(@RequestBody SysCommCodeDetailRequest request){
        commCodeService.saveSysCommCodeDetail(request);
        return ResponseEntity.ok(BaseResponse.success());
    }

}
