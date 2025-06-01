package com.solutionil.onebe.inb.mapper;

import com.solutionil.onebe.inb.dto.request.InboundReqRequest;
import com.solutionil.onebe.inb.dto.request.InboundReqItemRequest;
import com.solutionil.onebe.inb.dto.request.InboundReqSrchRequest;
import com.solutionil.onebe.inb.dto.response.InboundReqGrid;
import com.solutionil.onebe.inb.dto.response.InboundReqItemResponse;
import com.solutionil.onebe.inb.dto.response.InboundReqResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InboundReqMapper {
    void insertInboundReq(InboundReqRequest purchaseOrder);

    void updateInboundReq(InboundReqRequest purchaseOrder);

    void deleteInboundReq(Long inboundReqId);

    InboundReqResponse findInboundReqById(Long inboundReqId);

    List<InboundReqGrid> findInboundReqs(InboundReqSrchRequest request);

    void insertInboundReqItem(Long inboundReqId, List<InboundReqItemRequest> items);

    void deleteInboundReqItemsByPoId(Long inboundReqId);

    List<InboundReqItemResponse> findInboundReqItemById(Long inboundReqId);
}
