package com.solutionil.onebe.buy.service;

import com.solutionil.onebe.buy.dto.request.PurchaseOrderApprSrchRequest;
import com.solutionil.onebe.buy.dto.request.PurchaseOrderRequest;
import com.solutionil.onebe.buy.dto.response.PurchaseOrderApprResponse;
import com.solutionil.onebe.buy.mapper.PurchaseOrderApprMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@RequiredArgsConstructor
@Service
public class PurchaseOrderApprService {
    private final PurchaseOrderApprMapper purchaseOrderApprMapper;


    @Transactional(readOnly = true)
    public List<PurchaseOrderApprResponse.POApprGrid> findPurchaseOrderApproval(PurchaseOrderApprSrchRequest.POApprGrid request){
        return purchaseOrderApprMapper.findPurchaseOrderApproval(request);
    }

    public void approvalPurchaseOrder(List<PurchaseOrderRequest.Approval> request){
        purchaseOrderApprMapper.approvalPurchaseOrder(request);
    }

    public void cancelPurchaseOrder(List<PurchaseOrderRequest.Cancel> request){
        purchaseOrderApprMapper.cancelPurchaseOrder(request);
    }

}
