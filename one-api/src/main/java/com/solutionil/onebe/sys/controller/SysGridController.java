package com.solutionil.onebe.sys.controller;

import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.sys.dto.request.UpdateColumnWidthRequest;
import com.solutionil.onebe.sys.dto.response.GridColumnInfoResponse;
import com.solutionil.onebe.sys.dto.entity.SysGridMain;
import com.solutionil.onebe.sys.dto.request.SysGridDetailRequest;
import com.solutionil.onebe.sys.dto.request.SysGridMainRequest;
import com.solutionil.onebe.sys.dto.response.SysGridDetailResponse;
import com.solutionil.onebe.sys.dto.response.SysGridMainResponse;
import com.solutionil.onebe.sys.service.SysGridService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/sys-grid")
public class SysGridController {

    private final SysGridService sysGridService;

    @GetMapping("/main")
    public ResponseEntity<BaseResponse> selectSysGridMain(@RequestParam(value = "menuNm", required = false) String menuNm,
                                                          @RequestParam(value = "classId", required = false) String classId,
                                                           @RequestParam(value = "gridNm", required = false) String gridNm) {
        log.info("Request to list all SysGridMs");
        List<SysGridMainResponse> sysGrids = sysGridService.selectSysGridMain(menuNm, classId, gridNm);
        return ResponseEntity.ok(BaseResponse.success(sysGrids));
    }
    @GetMapping("/detail")
    private ResponseEntity<BaseResponse> selectSysGridDetail(@RequestParam(value = "menuId") Integer menuId,
                                                             @RequestParam(value = "gridNm") String gridNm) {
        List<SysGridDetailResponse> sysGridDetail = sysGridService.selectSysGridDetail(menuId, gridNm);
        return ResponseEntity.ok(BaseResponse.success(sysGridDetail));
    }

    @GetMapping("/setGridColumnInfo")
    public ResponseEntity<BaseResponse> selectGridColumnInfo(@RequestParam(value = "menuId") Integer menuId,
                                                           @RequestParam(value = "gridNm") String gridNm) {
            List<GridColumnInfoResponse> setGridColumnInfo = sysGridService.selectGridColumnInfo(menuId, gridNm);
            return ResponseEntity.ok(BaseResponse.success(setGridColumnInfo));
        }

    @PostMapping("insertMain")
    public ResponseEntity<BaseResponse> insertSysGridMain(@RequestBody SysGridMainRequest request) {
        log.info("SysGridM: {}", request);
        sysGridService.insertSysGridMain(request);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @PostMapping("insertDetail")
    public ResponseEntity<BaseResponse> insertSysGridDetail(@RequestBody SysGridDetailRequest request) {
        log.info("SysGridD: {}", request);
        sysGridService.insertSysGridDetail(request);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @PostMapping("updateGridColsWidth")
    public ResponseEntity<BaseResponse> updateGridColsWidth(@RequestBody List<UpdateColumnWidthRequest> request) {
        log.info("UpdateColumnWidthRequest: {}", request);
        sysGridService.updateGridColsWidth(request);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @PutMapping
    public ResponseEntity<BaseResponse> updateSysGridM(@RequestBody SysGridMain request) {
        log.info("Request to update SysGridM: {}", request);
        sysGridService.updateSysGridM(request);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @DeleteMapping("/main/{menuId}/{gridNm}")
    public ResponseEntity<BaseResponse> deleteSysGridM(@PathVariable Integer menuId, @PathVariable String gridNm) {
        log.info("Request to delete SysGridM with menuId: {}, gridNm: {}", menuId, gridNm);
        sysGridService.deleteSysGridMain(menuId, gridNm);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @DeleteMapping("/detail/{columnId}")
    public ResponseEntity<BaseResponse> deleteSysGridDetail(@PathVariable Integer columnId) {
        log.info("Request to delete SysGridDetail with columnId: {}", columnId);
        sysGridService.deleteSysGridDetail(columnId);
        return ResponseEntity.ok(BaseResponse.success());
    }


}
