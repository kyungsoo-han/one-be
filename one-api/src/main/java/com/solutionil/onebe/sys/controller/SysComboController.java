package com.solutionil.onebe.sys.controller;


import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.sys.dto.ComboData;
import com.solutionil.onebe.sys.dto.SysCommCodeDetail;
import com.solutionil.onebe.sys.dto.request.ComboSrchRequest;
import com.solutionil.onebe.sys.service.SysComboService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/sys-combo")
public class SysComboController {

    private final SysComboService comboService;

    @GetMapping("/system")
    public ResponseEntity<BaseResponse> getComboData() {
        List<ComboData> comboData = comboService.getComboData();
        return ResponseEntity.ok(BaseResponse.success(comboData));
    }

    @GetMapping("/table/{tableGbn}")
    public ResponseEntity<BaseResponse> getComboDataFromTables(@PathVariable String tableGbn, ComboSrchRequest request) {
        log.info("request: {}", request);
        List<ComboData> comboData = comboService.getComboDataFromTable(tableGbn,request);
        return ResponseEntity.ok(BaseResponse.success(comboData));
    }


}
