
package com.solutionil.onebe.mst.service;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.mst.dto.request.DeptRequest;
import com.solutionil.onebe.mst.dto.response.DeptResponse;
import com.solutionil.onebe.mst.mapper.DeptMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class DeptService {

    private final DeptMapper deptMapper;

    @Transactional
    public void saveDept(DeptRequest request) {

        deptMapper.saveDept(request);
    }

    public DeptResponse findDeptById(int deptId) {
        return deptMapper.findDeptById(deptId);
    }

    public List<DeptResponse> findDepts(BaseSrchRequest request) {
        return deptMapper.findDepts(request);
    }

    @Transactional
    public void deleteDept(Integer deptId) {
        List<Integer> deleteTarget = deptMapper.getDeleteTarget(deptId);
        deleteTarget.forEach(deptMapper::deleteDept);

    }
}