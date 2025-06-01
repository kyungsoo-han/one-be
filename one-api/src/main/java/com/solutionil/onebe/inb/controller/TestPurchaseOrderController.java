package com.solutionil.onebe.inb.controller;

import com.solutionil.onebe.comm.dto.response.BaseResponse;

import com.solutionil.onebe.inb.dto.request.TestPurchaseOrderItemsRequest;
import com.solutionil.onebe.inb.dto.request.TestPurchaseOrderRequest;
import com.solutionil.onebe.inb.dto.request.TestPurchaseOrderRequestSearch;
import com.solutionil.onebe.inb.dto.response.TestPurchaseOrderResponseDetailGrid;
import com.solutionil.onebe.inb.dto.response.TestPurchaseOrderResponseMainGrid;
import com.solutionil.onebe.inb.service.TestPurchaseOrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/test-purchaseOrder")
public class TestPurchaseOrderController {

    private final TestPurchaseOrderService testPurchaseOrderService;

    @PostMapping
    public ResponseEntity<BaseResponse> insertTestPurchaseOrder(@RequestBody TestPurchaseOrderRequest request) {
        // ===============================================================
        // Write Log
        log.info("insertTestPurchaseOrder: {}", request);

        switch (request.getFlag())
        {
            case "IN" :
                // ===============================================================
                // INSERT Service Call
                testPurchaseOrderService.insertTestPurchaseOrder(request);
                break;
            case "UP" :
                // ===============================================================
                // INSERT Service Call
                testPurchaseOrderService.UpdateTestPurchaseOrder(request);
                break;
            default:
                break;
        }

        // ===============================================================
        // Success Return
        return ResponseEntity.ok(BaseResponse.success(request));
    }

    @GetMapping("/main")
    public ResponseEntity<BaseResponse> SelectTestPurchaseOrderMainGrid(TestPurchaseOrderRequestSearch request){
        // ===============================================================
        // Write Log
        log.info("SelectTestPurchaseOrderMainGrid ={}", request);

        // ===============================================================
        // SELECT Service Call
        List<TestPurchaseOrderResponseMainGrid> testPurchaseOrderResponseMainGrid = testPurchaseOrderService.SelectTestPurchaseOrderMainGrid(request);

        // ===============================================================
        // Success Return
        return ResponseEntity.ok(BaseResponse.success(testPurchaseOrderResponseMainGrid));
    }

    @GetMapping("/{slipNo}")
    public ResponseEntity<BaseResponse> SelectTestPurchaseOrderDetailGrid(@PathVariable String slipNo){
        log.info("testPurchaseOrderResponseDetailGrid ={}", slipNo);
        TestPurchaseOrderResponseDetailGrid testPurchaseOrderResponseDetailGrid = testPurchaseOrderService.SelectTestPurchaseOrderDetailGrid(slipNo);
        return ResponseEntity.ok(BaseResponse.success(testPurchaseOrderResponseDetailGrid));
    }
}



















