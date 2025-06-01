package com.solutionil.onebe.mst.service;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.mst.dto.request.ItemRequest;
import com.solutionil.onebe.mst.dto.response.ItemResponse;
import com.solutionil.onebe.mst.dto.response.grid.MstItemGrid;
import com.solutionil.onebe.mst.mapper.ItemMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class ItemService {

    private final ItemMapper itemMapper;

    @Transactional
    public void insertItem(ItemRequest request){
        itemMapper.insertItem(request);
    }

    @Transactional
    public void deleteItem(Integer ItemId){
        itemMapper.deleteItem(ItemId);
    }

    public ItemResponse findItemById(Integer ItemId){
        ItemResponse itemData = itemMapper.findItemById(ItemId);
        return itemData;
    }

    public List<MstItemGrid> findItems(BaseSrchRequest request){
        return itemMapper.findItems(request);
    }


}
