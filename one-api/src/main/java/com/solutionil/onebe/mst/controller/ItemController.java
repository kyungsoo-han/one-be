package com.solutionil.onebe.mst.controller;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.mst.dto.request.ItemRequest;
import com.solutionil.onebe.mst.service.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/item")
public class ItemController {

    private final ItemService itemService;

    @PostMapping
    public ResponseEntity insertItem(@RequestBody ItemRequest request){
        log.info("request = {}", request);
        itemService.insertItem(request);
        return ResponseEntity.ok(BaseResponse.success(request));
    }

    @DeleteMapping("/{itemId}")
    public ResponseEntity saveCust(@PathVariable Integer itemId){
        itemService.deleteItem(itemId);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @GetMapping("/detail/{itemId}")
    public ResponseEntity findItemById(@PathVariable Integer itemId){
        return ResponseEntity.ok(BaseResponse.success(itemService.findItemById(itemId)));
    }

    @GetMapping("/list")
    public ResponseEntity findItems(BaseSrchRequest request){
        log.info("request ={}", request);
        return ResponseEntity.ok(BaseResponse.success(itemService.findItems(request)));
    }
}
