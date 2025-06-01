package com.solutionil.onebe.inb.mapper;

import com.solutionil.onebe.inb.dto.request.InboundByReqSrchRequest;
import com.solutionil.onebe.inb.dto.response.InboundByReqMainGrid;
import com.solutionil.onebe.inb.dto.response.InboundReqItemResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InboundByReqMapper {
    List<InboundByReqMainGrid> findInboundByReqMainGrid(InboundByReqSrchRequest request);

    List<InboundReqItemResponse> findInboundByReqDetailGrid(Long inboundReqId);

}
