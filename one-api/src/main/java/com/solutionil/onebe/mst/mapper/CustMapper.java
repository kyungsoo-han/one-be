package com.solutionil.onebe.mst.mapper;

import com.solutionil.onebe.mst.dto.request.CustRequest;
import com.solutionil.onebe.mst.dto.request.srch.CustSrchRequest;
import com.solutionil.onebe.mst.dto.response.CustResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustMapper {
    void insertCust(CustRequest request);

    void deleteCust(Integer custId);

    CustResponse findCustById(Integer custId);

    List<CustResponse> findCusts(CustSrchRequest request);

}
