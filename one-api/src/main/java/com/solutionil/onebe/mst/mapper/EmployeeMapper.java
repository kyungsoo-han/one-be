package com.solutionil.onebe.mst.mapper;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.mst.dto.request.DeptRequest;
import com.solutionil.onebe.mst.dto.request.EmployeeRequest;
import com.solutionil.onebe.mst.dto.request.srch.EmployeeSrchRequest;
import com.solutionil.onebe.mst.dto.response.DeptResponse;
import com.solutionil.onebe.mst.dto.response.EmployeeResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<EmployeeResponse> findEmployees(EmployeeSrchRequest request);

    EmployeeResponse findEmployee(String compId, String bizId, String empNo);

    EmployeeResponse findEmployeeById(Integer empId);

    void saveEmployee(EmployeeRequest employee);

    void deleteEmployee(EmployeeRequest.Delete request);
}