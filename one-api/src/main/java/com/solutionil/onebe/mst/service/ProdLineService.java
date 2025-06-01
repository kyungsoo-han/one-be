package com.solutionil.onebe.mst.service;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.mst.dto.entity.ProdLine;
import com.solutionil.onebe.mst.mapper.ProdLineMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class ProdLineService {

    private final ProdLineMapper prodLineMapper;

    @Transactional
    public void insertProdLine(ProdLine request) {
        prodLineMapper.insertProdLine(request);
    }

    @Transactional
    public void updateProdLine(ProdLine request) {
        prodLineMapper.updateProdLine(request);
    }

    @Transactional
    public void deleteProdLine(Integer prodLineId) {
        prodLineMapper.deleteProdLine(prodLineId);
    }

    public ProdLine selectProdLineById(Integer prodLineId) {
        ProdLine prodLineData = prodLineMapper.selectProdLineById(prodLineId);
        log.info("prodLineData={}", prodLineData.toString());
        return prodLineData;
    }

    public List<ProdLine> selectProdLineList(BaseSrchRequest request) {
        return prodLineMapper.selectProdLineList(request);
    }
}
