package com.solutionil.onebe.inb.service;

import com.solutionil.onebe.inb.dto.request.InboundByReqSrchRequest;
import com.solutionil.onebe.inb.dto.response.InboundByReqMainGrid;
import com.solutionil.onebe.inb.dto.response.InboundReqItemResponse;
import com.solutionil.onebe.inb.mapper.InboundByReqMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class InboundByReqService {

    private final InboundByReqMapper mapper;

    public List<InboundByReqMainGrid> findInboundByReqMainGrid(InboundByReqSrchRequest request) {
        return mapper.findInboundByReqMainGrid(request);
    }
    public List<InboundReqItemResponse> findInboundByReqDetailGrid (Long inboundReqId) {
        List<InboundReqItemResponse> items = mapper.findInboundByReqDetailGrid(inboundReqId);
        return items;
    }


}
