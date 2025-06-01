package com.solutionil.onebe.mst.mapper;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.mst.dto.entity.ProdProcess;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProdProcessMapper {
    void insertProdProcess(ProdProcess request);

    void updateProdProcess(ProdProcess request);

    void deleteProdProcess(Integer prodProcessId);

    ProdProcess selectProdProcessById(Integer prodProcessId);

    List<ProdProcess> selectProdProcessList(BaseSrchRequest request);
}
