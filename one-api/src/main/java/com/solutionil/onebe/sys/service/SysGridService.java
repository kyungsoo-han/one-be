package com.solutionil.onebe.sys.service;

import com.solutionil.onebe.sys.dto.request.UpdateColumnWidthRequest;
import com.solutionil.onebe.sys.dto.response.GridColumnInfoResponse;
import com.solutionil.onebe.sys.dto.entity.SysGridMain;
import com.solutionil.onebe.sys.dto.request.SysGridDetailRequest;
import com.solutionil.onebe.sys.dto.request.SysGridMainRequest;
import com.solutionil.onebe.sys.dto.response.SysGridDetailResponse;
import com.solutionil.onebe.sys.dto.response.SysGridMainResponse;
import com.solutionil.onebe.sys.mapper.SysGridMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class SysGridService {

    private final SysGridMapper sysGridMapper;

    @Transactional
    public void insertSysGridMain(SysGridMainRequest sysGrid) {
        sysGridMapper.insertSysGridMain(sysGrid);
    }

    @Transactional
    public void insertSysGridDetail(SysGridDetailRequest request) {
        sysGridMapper.insertSysGridDetail(request);
    }

    @Transactional
    public void updateGridColsWidth(List<UpdateColumnWidthRequest> request) {
        sysGridMapper.updateGridColsWidth(request);
    }

    @Transactional
    public void updateSysGridM(SysGridMain sysGrid) {
        sysGridMapper.updateSysGridM(sysGrid);
    }

    @Transactional
    public void deleteSysGridMain(Integer menuId, String gridNm) {
        sysGridMapper.deleteSysGridMain(menuId, gridNm);
    }

    @Transactional
    public void deleteSysGridDetail(Integer columnId) {
        sysGridMapper.deleteSysGridDetail(columnId);
    }

    public List<SysGridMainResponse> selectSysGridMain(String menuNm, String classId, String gridNm) {
        return sysGridMapper.selectSysGridMain(menuNm, classId, gridNm);
    }

    public List<SysGridDetailResponse> selectSysGridDetail(Integer menuId, String gridNm){
        return sysGridMapper.selectSysGridDetail(menuId, gridNm);
    }
    public List<GridColumnInfoResponse> selectGridColumnInfo(Integer menuId, String gridNm ){
        return sysGridMapper.selectGridColumnInfo(menuId, gridNm);
    }

}
