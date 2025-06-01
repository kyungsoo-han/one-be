package com.solutionil.onebe.mst.mapper;

import com.solutionil.onebe.mst.dto.entity.Wh;
import com.solutionil.onebe.mst.dto.request.WhRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WhMapper {
    void insertWh(WhRequest request);

    void deleteWh(Integer whId);

    List<Wh> findWhs(Integer compId, Integer bizId, String whCd, String whNm);
}
