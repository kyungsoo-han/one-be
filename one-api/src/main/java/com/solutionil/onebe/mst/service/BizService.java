package com.solutionil.onebe.mst.service;

import com.solutionil.onebe.mst.dto.request.BizRequest;
import com.solutionil.onebe.mst.dto.request.srch.BizSrchRequest;
import com.solutionil.onebe.mst.dto.response.BizResponse;
import com.solutionil.onebe.mst.dto.response.grid.MstBizGrid;
import com.solutionil.onebe.mst.mapper.BizMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class BizService {

    private final BizMapper bizMapper;

    @Transactional
    public void saveBiz(BizRequest request){
        bizMapper.saveBiz(request);
    }

    @Transactional
    public void deleteBiz(String bizId){
        bizMapper.deleteBiz(bizId);
    }

    public BizResponse findBizById(String bizId){
        BizResponse bizData = bizMapper.findBizById(bizId);
        log.info("bizId={}",bizData.toString());
        return bizData;
    }

    public List<MstBizGrid> findBizs(BizSrchRequest request){
        return bizMapper.findBizs(request);
    }


}
