package com.solutionil.onebe.inb.service;

import com.solutionil.onebe.inb.dto.request.InboundReqRequest;
import com.solutionil.onebe.inb.dto.request.InboundReqItemRequest;
import com.solutionil.onebe.inb.dto.request.InboundReqSrchRequest;
import com.solutionil.onebe.inb.dto.response.InboundReqGrid;
import com.solutionil.onebe.inb.dto.response.InboundReqItemResponse;
import com.solutionil.onebe.inb.dto.response.InboundReqResponse;
import com.solutionil.onebe.inb.mapper.InboundReqMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class InboundReqService {

    private final InboundReqMapper inboundReqMapper;

    @Transactional
    public void insertInboundReq(InboundReqRequest purchaseOrder) {
        inboundReqMapper.insertInboundReq(purchaseOrder);

        List<InboundReqItemRequest> items = purchaseOrder.getChild();
        if (items.isEmpty()) {
            return; // 아이템이 없으면 바로 리턴
        }

        inboundReqMapper.insertInboundReqItem(purchaseOrder.getInboundReqId(), items);
    }

    @Transactional
    public void deleteInboundReq(Long inboundReqId) {
        inboundReqMapper.deleteInboundReqItemsByPoId(inboundReqId);
        inboundReqMapper.deleteInboundReq(inboundReqId);
    }

    public InboundReqResponse findInboundReqById(Long inboundReqId) {
        InboundReqResponse purchaseOrder = inboundReqMapper.findInboundReqById(inboundReqId);
        List<InboundReqItemResponse> items = inboundReqMapper.findInboundReqItemById(inboundReqId);
        purchaseOrder.setChild(items);
        return purchaseOrder;
    }

    public List<InboundReqGrid> findInboundReqs(InboundReqSrchRequest request) {
        return inboundReqMapper.findInboundReqs(request);
    }
}
