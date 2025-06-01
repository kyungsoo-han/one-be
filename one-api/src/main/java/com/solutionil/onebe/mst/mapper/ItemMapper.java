package com.solutionil.onebe.mst.mapper;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.mst.dto.request.ItemRequest;
import com.solutionil.onebe.mst.dto.response.ItemResponse;
import com.solutionil.onebe.mst.dto.response.grid.MstItemGrid;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
    void insertItem(ItemRequest request);

    void deleteItem(Integer item_id);

    ItemResponse findItemById(Integer item_id);

    List<MstItemGrid> findItems(BaseSrchRequest request);

}
