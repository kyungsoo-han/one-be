package com.solutionil.onebe.mst.mapper;

import com.solutionil.onebe.mst.dto.request.FlowMstRequest;
import com.solutionil.onebe.mst.dto.request.srch.FlowSrchRequest;
import com.solutionil.onebe.mst.dto.response.FlowResponse;
import com.solutionil.onebe.mst.dto.response.grid.FlowMainGrid;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface FlowMapper {
    int SelectDuplicateFlowCd(FlowMstRequest flowMstRequest);

    void InsertFlowMst(FlowMstRequest flowMstRequest);

    void UpdateFlowMst(FlowMstRequest flowMstRequest);

    List<FlowMainGrid> SelectFlowMainGrid(FlowSrchRequest request);

    FlowResponse SelectFlowDetailControl(FlowSrchRequest request);
}
