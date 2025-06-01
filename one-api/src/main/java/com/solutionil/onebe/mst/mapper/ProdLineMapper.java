package com.solutionil.onebe.mst.mapper;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.mst.dto.entity.ProdLine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProdLineMapper {
    void insertProdLine(ProdLine request);

    void updateProdLine(ProdLine request);

    void deleteProdLine(Integer prodLineId);

    ProdLine selectProdLineById(Integer prodLineId);

    List<ProdLine> selectProdLineList(BaseSrchRequest request);
}
