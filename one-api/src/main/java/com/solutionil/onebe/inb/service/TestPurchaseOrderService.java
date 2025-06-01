package com.solutionil.onebe.inb.service;


import com.solutionil.onebe.inb.dto.request.TestPurchaseOrderRequest;
import com.solutionil.onebe.inb.dto.request.TestPurchaseOrderItemsRequest;
import com.solutionil.onebe.inb.dto.request.TestPurchaseOrderRequestSearch;
import com.solutionil.onebe.inb.dto.response.TestPurchaseOrderResponseDetailGrid;
import com.solutionil.onebe.inb.dto.response.TestPurchaseOrderResponseItem;
import com.solutionil.onebe.inb.dto.response.TestPurchaseOrderResponseMainGrid;
import com.solutionil.onebe.inb.mapper.TestPurchaseOrderMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class TestPurchaseOrderService {

    private final TestPurchaseOrderMapper testPurchaseOrderMapper;

    /*********************************************************
     * Insert
     ********************************************************/
    @Transactional
    public void insertTestPurchaseOrder(TestPurchaseOrderRequest testPurchaseOrderRequest) {
        // ========================================================================================
        // ITEM 획득
        List<TestPurchaseOrderItemsRequest> items = testPurchaseOrderRequest.getChild();

        // ========================================================================================
        // Insert Mapper Call
        testPurchaseOrderMapper.InsertTestPurchaseOrder(testPurchaseOrderRequest, items);

        // ========================================================================================
        // Insert After Process / 전표번호 획득
        String newSlipNo = testPurchaseOrderMapper.InsertTestPurchaseOrderAfter();

        // ========================================================================================
        // 신규 전표번호 부여
        testPurchaseOrderRequest.setSlipNo(newSlipNo);

        System.out.println("Generated Slip No: " + testPurchaseOrderRequest.getSlipNo());
    }
    @Transactional
    public void UpdateTestPurchaseOrder(TestPurchaseOrderRequest testPurchaseOrderRequest){
        List<TestPurchaseOrderItemsRequest> items = testPurchaseOrderRequest.getChild();

        testPurchaseOrderMapper.UpdateTestPurchaseOrder(testPurchaseOrderRequest, items);
    }

    /*********************************************************
     * SELECT
     ********************************************************/
    public List<TestPurchaseOrderResponseMainGrid> SelectTestPurchaseOrderMainGrid(TestPurchaseOrderRequestSearch reuqest){
        return testPurchaseOrderMapper.SelectTestPurchaseOrderMainGrid(reuqest);
    }

    public TestPurchaseOrderResponseDetailGrid SelectTestPurchaseOrderDetailGrid(String slipNo){
        // ========================================================================================
        // Control 조회
        TestPurchaseOrderResponseDetailGrid testPurchaseOrderResponseDetailGrid = testPurchaseOrderMapper.SelectTestPurchaseOrderDetailControl(slipNo);
        // ========================================================================================
        // ITEM 조회
        List<TestPurchaseOrderResponseItem> items = testPurchaseOrderMapper.SelectTestPurchaseOrderDetailGrid(slipNo);

        // ========================================================================================
        // 데이터 정리
        testPurchaseOrderResponseDetailGrid.setChild(items);

        return testPurchaseOrderResponseDetailGrid;
    }
}






















