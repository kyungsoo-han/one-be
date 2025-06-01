package com.solutionil.onebe.mst.service;

import com.solutionil.onebe.mst.dto.request.CustRequest;
import com.solutionil.onebe.mst.dto.request.srch.CustSrchRequest;
import com.solutionil.onebe.mst.dto.response.CustResponse;
import com.solutionil.onebe.mst.mapper.CustMapper;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class CustService {

    private static final Logger log = LoggerFactory.getLogger(CustService.class);
    private final CustMapper custMapper;

    @Transactional
    public void insertCust(CustRequest request){
        custMapper.insertCust(request);
    }

    @Transactional
    public void deleteCust(Integer custId){
        custMapper.deleteCust(custId);
    }

    public CustResponse findCustById(Integer custId){
        CustResponse CustomerData = custMapper.findCustById(custId);
        log.info("CustomerData={}",CustomerData.toString());
        return CustomerData;
    }

    public List<CustResponse> findCusts(CustSrchRequest request){
        return custMapper.findCusts(request);
    }


}
