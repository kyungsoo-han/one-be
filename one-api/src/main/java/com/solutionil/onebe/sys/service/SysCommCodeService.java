package com.solutionil.onebe.sys.service;

import com.solutionil.onebe.sys.dto.request.SysCommCodeDetailRequest;
import com.solutionil.onebe.sys.dto.request.SysCommCodeMainRequest;
import com.solutionil.onebe.sys.dto.response.SysCommCodeDetailResponse;
import com.solutionil.onebe.sys.dto.response.SysCommCodeMainResponse;
import com.solutionil.onebe.sys.mapper.SysCommCodeMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class SysCommCodeService {
    private final SysCommCodeMapper commCodeMapper;

    public List<SysCommCodeMainResponse> selectSysCommCodeMainList(String commGbn, String commNm){
        return commCodeMapper.selectSysCommCodeMainList(commGbn,commNm);}

    public List<SysCommCodeDetailResponse> selectSysCommCodeDetailList(String commGbn){
        return commCodeMapper.selectSysCommCodeDetailList(commGbn);}

    @Transactional
    public void saveSysCommCodeMain(SysCommCodeMainRequest request){
        commCodeMapper.saveSysCommCodeMain(request);
    }

    @Transactional
    public void saveSysCommCodeDetail(SysCommCodeDetailRequest request){
        commCodeMapper.saveSysCommCodeDetail(request);
    }
}
