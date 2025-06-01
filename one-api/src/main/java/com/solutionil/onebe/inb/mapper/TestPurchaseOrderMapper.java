package com.solutionil.onebe.inb.mapper;


import com.solutionil.onebe.inb.dto.request.TestPurchaseOrderItemsRequest;
import com.solutionil.onebe.inb.dto.request.TestPurchaseOrderRequest;
import com.solutionil.onebe.inb.dto.request.TestPurchaseOrderRequestSearch;
import com.solutionil.onebe.inb.dto.response.TestPurchaseOrderResponseDetailGrid;
import com.solutionil.onebe.inb.dto.response.TestPurchaseOrderResponseItem;
import com.solutionil.onebe.inb.dto.response.TestPurchaseOrderResponseMainGrid;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestPurchaseOrderMapper {
    // ======================================================
    // Insert SelectTestPurchaseOrder
    void InsertTestPurchaseOrder(
            TestPurchaseOrderRequest purchaseOrderRequest, List<TestPurchaseOrderItemsRequest> items
    );

    // ======================================================
    // Insert SelectTestPurchaseOrder
    void UpdateTestPurchaseOrder(
            TestPurchaseOrderRequest purchaseOrderRequest, List<TestPurchaseOrderItemsRequest> items
    );

    // ======================================================
    // Insert After
    String InsertTestPurchaseOrderAfter();

    // ======================================================
    // SELECT Main Grid
    List<TestPurchaseOrderResponseMainGrid> SelectTestPurchaseOrderMainGrid(TestPurchaseOrderRequestSearch search);

    // ======================================================
    // SELECT Detail Controls
    TestPurchaseOrderResponseDetailGrid SelectTestPurchaseOrderDetailControl(String slipNo);

    // ======================================================
    // SELECT Detail Grid
    List<TestPurchaseOrderResponseItem> SelectTestPurchaseOrderDetailGrid(String slipNo);
}
