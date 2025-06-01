package com.solutionil.onebe.mst.controller;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.mst.dto.request.DeptRequest;
import com.solutionil.onebe.mst.dto.request.EmployeeRequest;
import com.solutionil.onebe.mst.dto.request.srch.EmployeeSrchRequest;
import com.solutionil.onebe.mst.dto.response.DeptResponse;
import com.solutionil.onebe.mst.service.DeptService;
import com.solutionil.onebe.mst.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/emp")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;

      @Operation(summary = "모든 사원 목록 조회", description = "모든 사원의 정보를 조회합니다.")
      @GetMapping("/list")
      public ResponseEntity<BaseResponse> findEmployees(EmployeeSrchRequest request) {
          return ResponseEntity.ok(BaseResponse.success(employeeService.findEmployees(request)));
      }

      @Operation(summary = "사원 정보 조회", description = "사원ID로 사원의 정보를 조회합니다.")
      @GetMapping
      public ResponseEntity<BaseResponse> findEmployee(String compId, String bizId, String empNo) {
          return ResponseEntity.ok(BaseResponse.success(employeeService.findEmployee(compId, bizId, empNo)));
      }

      @Operation(summary = "사원 정보 추가", description = "새로운 사원 정보를 추가합니다.")
      @PostMapping
      public ResponseEntity<BaseResponse> insertEmployee(@RequestBody EmployeeRequest request) {
          employeeService.saveEmployee(request);
          return ResponseEntity.ok().build();
      }


      @Operation(summary = "사원 정보 삭제", description = "사원ID로 사원 정보를 삭제합니다.")
      @DeleteMapping
      public ResponseEntity<BaseResponse> deleteEmployee(@RequestBody EmployeeRequest.Delete request) {
          employeeService.deleteEmployee(request);
          return ResponseEntity.ok().build();
      }
}
