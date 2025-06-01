package com.solutionil.onebe.oub.mapper;

import com.solutionil.onebe.oub.dto.request.OutboundReqItemRequest;
import com.solutionil.onebe.oub.dto.request.OutboundReqRequest;
import com.solutionil.onebe.oub.dto.request.OutboundReqSrchRequest;
import com.solutionil.onebe.oub.dto.response.OutboundReqGrid;
import com.solutionil.onebe.oub.dto.response.OutboundReqItemResponse;
import com.solutionil.onebe.oub.dto.response.OutboundReqItemSum;
import com.solutionil.onebe.oub.dto.response.OutboundReqResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OutboundReqMapper {
    void insertOutboundReq(OutboundReqRequest request);

    void updateOutboundReq(OutboundReqRequest request);

    void deleteOutboundReq(Long outboundReqId);

    OutboundReqResponse findOutboundReqById(Long outboundReqId);

    List<OutboundReqGrid> findOutboundReqs(OutboundReqSrchRequest request);

    void insertOutboundReqItem(Long outboundReqId, List<OutboundReqItemRequest> items);

    void deleteOutboundReqItemsByPoId(Long outboundReqId);

    List<OutboundReqItemResponse> findOutboundReqItemById(Long outboundReqId);

    List<OutboundReqItemSum> findOutboundReqItemSumById(List<Long> outboundReqIds);
}
