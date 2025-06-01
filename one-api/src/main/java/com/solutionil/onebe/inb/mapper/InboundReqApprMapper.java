package com.solutionil.onebe.inb.mapper;

import com.solutionil.onebe.inb.dto.request.InboundReqApprRequest;
import com.solutionil.onebe.inb.dto.request.InboundReqApprSrchRequest;
import com.solutionil.onebe.inb.dto.response.InboundReqApprMainGrid;
import com.solutionil.onebe.inb.dto.response.InboundReqItemResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InboundReqApprMapper {
    List<InboundReqApprMainGrid> findInboundReqApprMainGrid(InboundReqApprSrchRequest request);

    List<InboundReqItemResponse> findInboundReqApprDetailGrid(Long inboundReqId);

    void updateInboundReqStatus(InboundReqApprRequest request);
}
