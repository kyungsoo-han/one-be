package com.solutionil.onebe.oub.service;

import com.solutionil.onebe.oub.dto.request.OutboundReqApprRequest;
import com.solutionil.onebe.oub.dto.request.OutboundReqApprSrchRequest;
import com.solutionil.onebe.oub.dto.response.OutboundReqApprMainGrid;
import com.solutionil.onebe.oub.dto.response.OutboundReqItemResponse;
import com.solutionil.onebe.oub.mapper.OutboundReqApprMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class OutboundReqApprService {

    private final OutboundReqApprMapper mapper;


    public List<OutboundReqApprMainGrid> findOutboundReqApprMainGrid(OutboundReqApprSrchRequest request) {
        return mapper.findOutboundReqApprMainGrid(request);
    }

    public List<OutboundReqItemResponse> findOutboundReqApprDetailGrid(Long outboundReqId) {
        List<OutboundReqItemResponse> items = mapper.findOutboundReqApprDetailGrid(outboundReqId);
        return items;
    }

    public void updateOutboundReqStatus(OutboundReqApprRequest request) {
        mapper.updateOutboundReqStatus(request);
    }
}
