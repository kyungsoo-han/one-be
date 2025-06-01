package com.solutionil.onebe.mst.service;

import com.solutionil.onebe.mst.dto.request.CompRequest;
import com.solutionil.onebe.mst.dto.request.srch.CompSrchRequest;
import com.solutionil.onebe.mst.dto.response.CompResponse;
import com.solutionil.onebe.mst.dto.response.grid.MstCompGrid;
import com.solutionil.onebe.mst.mapper.CompMapper;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class CompService {

    private static final Logger log = LoggerFactory.getLogger(CompService.class);
    private final CompMapper compMapper;

    @Transactional
    public void saveComp(CompRequest request){
        compMapper.saveComp(request);
    }

    @Transactional
    public void deleteComp(String compCd){
        compMapper.deleteComp(compCd);
    }

    public CompResponse findCompById(String compCd){
        CompResponse compData = compMapper.findCompById(compCd);
        log.info("compData={}",compData.toString());
        return compData;
    }

    public List<MstCompGrid> findComps(CompSrchRequest request){
        return compMapper.findComps(request);
    }


}
