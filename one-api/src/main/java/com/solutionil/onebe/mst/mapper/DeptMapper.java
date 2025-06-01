package com.solutionil.onebe.mst.mapper;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.mst.dto.request.DeptRequest;
import com.solutionil.onebe.mst.dto.response.DeptResponse;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DeptMapper {
    void saveDept(DeptRequest request);

    DeptResponse findDeptById(Integer deptId);

    void deleteDept(Integer deptId);
    List<Integer> getDeleteTarget(Integer deptId);
    List<DeptResponse> findDepts(BaseSrchRequest request);
}