package com.solutionil.onebe.mst.service;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.mst.dto.request.EmployeeRequest;
import com.solutionil.onebe.mst.dto.request.srch.EmployeeSrchRequest;
import com.solutionil.onebe.mst.dto.response.EmployeeResponse;
import com.solutionil.onebe.mst.mapper.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional(readOnly = true)
@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeMapper employeeMapper;

    public List<EmployeeResponse> findEmployees(EmployeeSrchRequest request) {
        return employeeMapper.findEmployees(request);
    }

    public EmployeeResponse findEmployee(String compId, String bizId, String empNo) {
        return employeeMapper.findEmployee( compId,  bizId,  empNo);
    }

    @Transactional
    public void saveEmployee(EmployeeRequest request) {
        employeeMapper.saveEmployee(request);
    }

    @Transactional
    public void deleteEmployee(EmployeeRequest.Delete  request) {
        employeeMapper.deleteEmployee(request);
    }
}
