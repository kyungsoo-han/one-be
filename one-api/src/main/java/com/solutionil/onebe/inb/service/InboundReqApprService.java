package com.solutionil.onebe.inb.service;

import com.solutionil.onebe.inb.dto.request.InboundReqApprRequest;
import com.solutionil.onebe.inb.dto.request.InboundReqApprSrchRequest;
import com.solutionil.onebe.inb.dto.response.InboundReqApprMainGrid;
import com.solutionil.onebe.inb.dto.response.InboundReqItemResponse;
import com.solutionil.onebe.inb.mapper.InboundReqApprMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class InboundReqApprService {

    private final InboundReqApprMapper mapper;


    public List<InboundReqApprMainGrid> findInboundReqApprMainGrid(InboundReqApprSrchRequest request) {
        return mapper.findInboundReqApprMainGrid(request);
    }

    public List<InboundReqItemResponse> findInboundReqApprDetailGrid(Long inboundReqId) {
        List<InboundReqItemResponse> items = mapper.findInboundReqApprDetailGrid(inboundReqId);
        return items;
    }

    public void updateInboundReqStatus(InboundReqApprRequest request) {
        mapper.updateInboundReqStatus(request);
    }
}
