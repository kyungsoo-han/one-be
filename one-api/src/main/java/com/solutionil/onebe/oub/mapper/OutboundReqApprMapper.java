package com.solutionil.onebe.oub.mapper;

import com.solutionil.onebe.oub.dto.request.OutboundReqApprRequest;
import com.solutionil.onebe.oub.dto.request.OutboundReqApprSrchRequest;
import com.solutionil.onebe.oub.dto.response.OutboundReqApprMainGrid;
import com.solutionil.onebe.oub.dto.response.OutboundReqItemResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OutboundReqApprMapper {
    List<OutboundReqApprMainGrid> findOutboundReqApprMainGrid(OutboundReqApprSrchRequest request);

    List<OutboundReqItemResponse> findOutboundReqApprDetailGrid(Long outboundReqId);

    void updateOutboundReqStatus(OutboundReqApprRequest request);
}
