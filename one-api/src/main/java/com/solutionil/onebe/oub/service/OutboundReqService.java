package com.solutionil.onebe.oub.service;

import com.solutionil.onebe.oub.dto.request.OutboundReqItemRequest;
import com.solutionil.onebe.oub.dto.request.OutboundReqRequest;
import com.solutionil.onebe.oub.dto.request.OutboundReqSrchRequest;
import com.solutionil.onebe.oub.dto.response.OutboundReqGrid;
import com.solutionil.onebe.oub.dto.response.OutboundReqItemResponse;
import com.solutionil.onebe.oub.dto.response.OutboundReqItemSum;
import com.solutionil.onebe.oub.dto.response.OutboundReqResponse;
import com.solutionil.onebe.oub.mapper.OutboundReqMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class OutboundReqService {

    private final OutboundReqMapper outboundReqMapper;

    @Transactional
    public void insertOutboundReq(OutboundReqRequest request) {
        outboundReqMapper.insertOutboundReq(request);

        List<OutboundReqItemRequest> items = request.getChild();
        if (items.isEmpty()) {
            return; // 아이템이 없으면 바로 리턴
        }
        outboundReqMapper.insertOutboundReqItem(request.getOutboundReqId(), items);
    }

    @Transactional
    public void deleteOutboundReq(Long outboundReqId) {
        outboundReqMapper.deleteOutboundReqItemsByPoId(outboundReqId);
        outboundReqMapper.deleteOutboundReq(outboundReqId);
    }

    public OutboundReqResponse findOutboundReqById(Long outboundReqId) {
        OutboundReqResponse purchaseOrder = outboundReqMapper.findOutboundReqById(outboundReqId);
        List<OutboundReqItemResponse> items = outboundReqMapper.findOutboundReqItemById(outboundReqId);
        purchaseOrder.setChild(items);
        return purchaseOrder;
    }

    public List<OutboundReqGrid> findOutboundReqs(OutboundReqSrchRequest request) {
        return outboundReqMapper.findOutboundReqs(request);
    }


    public List<OutboundReqItemSum> findOutboundReqItemSumById(List<Long> outboundReqIds) {
        return outboundReqMapper.findOutboundReqItemSumById(outboundReqIds);
    }
}
