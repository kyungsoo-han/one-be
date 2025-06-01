package com.solutionil.onebe.mst.mapper;

import com.solutionil.onebe.mst.dto.request.CompRequest;
import com.solutionil.onebe.mst.dto.request.srch.CompSrchRequest;
import com.solutionil.onebe.mst.dto.response.CompResponse;
import com.solutionil.onebe.mst.dto.response.grid.MstCompGrid;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CompMapper {
    void saveComp(CompRequest request);

    void deleteComp(String compCd);

    CompResponse findCompById(String compCd);

    List<MstCompGrid> findComps(CompSrchRequest request);

}
