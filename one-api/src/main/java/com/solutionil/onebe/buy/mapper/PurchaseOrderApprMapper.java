package com.solutionil.onebe.buy.mapper;

import com.solutionil.onebe.buy.dto.request.PurchaseOrderApprSrchRequest;
import com.solutionil.onebe.buy.dto.request.PurchaseOrderRequest;
import com.solutionil.onebe.buy.dto.response.PurchaseOrderApprResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PurchaseOrderApprMapper {
    List<PurchaseOrderApprResponse.POApprGrid> findPurchaseOrderApproval(PurchaseOrderApprSrchRequest.POApprGrid request);

    void approvalPurchaseOrder(List<PurchaseOrderRequest.Approval> request);
    void cancelPurchaseOrder(List<PurchaseOrderRequest.Cancel> request);
}
