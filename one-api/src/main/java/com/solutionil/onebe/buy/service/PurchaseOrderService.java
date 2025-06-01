package com.solutionil.onebe.buy.service;

import com.solutionil.onebe.buy.dto.request.PurchaseOrderRequest;
import com.solutionil.onebe.buy.dto.request.PurchaseOrderSrchRequest;
import com.solutionil.onebe.buy.dto.response.PurchaseOrderResponse;
import com.solutionil.onebe.buy.mapper.PurchaseOrderMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class PurchaseOrderService {
    private final PurchaseOrderMapper purchaseOrderMapper;

    public void save(PurchaseOrderRequest.Save request){
        purchaseOrderMapper.savePurchaseOrder(request);
        if(!request.getChild().isEmpty())
            purchaseOrderMapper.savePurchaseOrderItem(request, request.getChild());
    }

    @Transactional(readOnly = true)
    public List<PurchaseOrderResponse.MainGrid> findPurchaseOrderMainGrid(PurchaseOrderSrchRequest.MainGrid request){
        return purchaseOrderMapper.findPurchaseOrderMainGrid(request);
    }

    @Transactional(readOnly = true)
    public PurchaseOrderResponse.Detail findPurchaseOrderDetail(Long poId){
        List<PurchaseOrderResponse.DetailGrid> poItems = purchaseOrderMapper.findPurchaseOrderDetailGrid(poId);

        PurchaseOrderResponse.Detail poDetail = purchaseOrderMapper.findPurchaseOrderDetail(poId);
        poDetail.setChild(poItems);

        return poDetail;
    }

    public void deleteById(Long poId) {
        purchaseOrderMapper.deleteById(poId);
    }
}
