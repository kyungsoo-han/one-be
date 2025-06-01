package com.solutionil.onebe.buy.mapper;

import com.solutionil.onebe.buy.dto.request.PurchaseOrderRequest;
import com.solutionil.onebe.buy.dto.request.PurchaseOrderSrchRequest;
import com.solutionil.onebe.buy.dto.response.PurchaseOrderResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PurchaseOrderMapper {
    void savePurchaseOrder(PurchaseOrderRequest.Save request);
    void savePurchaseOrderItem(PurchaseOrderRequest.Save request, List<PurchaseOrderRequest.SaveItem> items);
    List<PurchaseOrderResponse.MainGrid> findPurchaseOrderMainGrid(PurchaseOrderSrchRequest.MainGrid request);
    PurchaseOrderResponse.Detail findPurchaseOrderDetail(Long poId);
    List<PurchaseOrderResponse.DetailGrid> findPurchaseOrderDetailGrid(Long poId);
    void deleteById(Long poId);
}
