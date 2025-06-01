package com.solutionil.onebe.inb.service;

import com.solutionil.onebe.buy.dto.response.PurchaseOrderApprResponse;
import com.solutionil.onebe.inb.mapper.TempInboundMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class TempInboundService {
    private final TempInboundMapper tempInboundMapper;

    public List<PurchaseOrderApprResponse.POApprGrid> popupPOList(){
        return tempInboundMapper.popupPOList();
    }
}
