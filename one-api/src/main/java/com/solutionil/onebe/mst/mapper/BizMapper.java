package com.solutionil.onebe.mst.mapper;

import com.solutionil.onebe.mst.dto.request.BizRequest;
import com.solutionil.onebe.mst.dto.request.srch.BizSrchRequest;
import com.solutionil.onebe.mst.dto.response.BizResponse;
import com.solutionil.onebe.mst.dto.response.grid.MstBizGrid;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BizMapper {
    void saveBiz(BizRequest request);

    void deleteBiz(String bizId);

    BizResponse findBizById(String bizId);

    List<MstBizGrid> findBizs(BizSrchRequest request);


}
