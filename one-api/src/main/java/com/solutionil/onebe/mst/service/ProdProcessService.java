package com.solutionil.onebe.mst.service;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.mst.dto.entity.ProdProcess;
import com.solutionil.onebe.mst.mapper.ProdProcessMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class ProdProcessService {

    private final ProdProcessMapper prodProcessMapper;

    @Transactional
    public void insertProdProcess(ProdProcess request) {
        prodProcessMapper.insertProdProcess(request);
    }

    @Transactional
    public void updateProdProcess(ProdProcess request) {
        prodProcessMapper.updateProdProcess(request);
    }

    @Transactional
    public void deleteProdProcess(Integer prodProcId) {
        prodProcessMapper.deleteProdProcess(prodProcId);
    }

    public ProdProcess selectProdProcessById(Integer prodProcId) {
        ProdProcess prodProcData = prodProcessMapper.selectProdProcessById(prodProcId);
        log.info("prodProcData={}", prodProcData.toString());
        return prodProcData;
    }

    public List<ProdProcess> selectProdProcessList(BaseSrchRequest request) {
        return prodProcessMapper.selectProdProcessList(request);
    }
}
