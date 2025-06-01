package com.solutionil.onebe.mst.mapper;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.mst.dto.entity.Fac;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FacMapper {
    void insertFac(Fac request);

    void updateFac(Fac request);

    void deleteFac(Integer facId);

    Fac findFacById(Integer facId);

    List<Fac> findFacs(BaseSrchRequest request);
}
