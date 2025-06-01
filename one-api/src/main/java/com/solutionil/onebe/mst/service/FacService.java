package com.solutionil.onebe.mst.service;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.mst.dto.entity.Fac;
import com.solutionil.onebe.mst.mapper.FacMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class FacService {

    private final FacMapper facMapper;

    @Transactional
    public void insertFac(Fac request) {
        facMapper.insertFac(request);
    }

    @Transactional
    public void updateFac(Fac request) {
        facMapper.updateFac(request);
    }

    @Transactional
    public void deleteFac(Integer facId) {
        facMapper.deleteFac(facId);
    }

    public Fac findFacById(Integer facId) {
        Fac facData = facMapper.findFacById(facId);
        log.info("facData={}", facData.toString());
        return facData;
    }

    public List<Fac> findFacs(BaseSrchRequest request) {
        return facMapper.findFacs(request);
    }
}
