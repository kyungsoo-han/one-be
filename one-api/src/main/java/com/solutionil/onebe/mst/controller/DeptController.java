package com.solutionil.onebe.mst.controller;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.mst.dto.request.DeptRequest;
import com.solutionil.onebe.mst.dto.response.DeptResponse;
import com.solutionil.onebe.mst.service.DeptService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dept")
@RequiredArgsConstructor
public class DeptController {

    private final DeptService deptService;

    @PostMapping("/save")
    public ResponseEntity<BaseResponse> saveDept(@RequestBody DeptRequest request) {
        deptService.saveDept(request);
        return ResponseEntity.ok(BaseResponse.success(request));
    }

    @GetMapping("/{deptId}")
    public ResponseEntity<BaseResponse> findDeptById(@PathVariable int deptId) {
        DeptResponse dept = deptService.findDeptById(deptId);
        return ResponseEntity.ok(BaseResponse.success(dept));
    }

    @GetMapping("/list")
    public ResponseEntity<BaseResponse> findDepts(BaseSrchRequest request) {
        List<DeptResponse> depts = deptService.findDepts(request);
        return ResponseEntity.ok(BaseResponse.success(depts));
    }

    @DeleteMapping("/delete/{deptId}")
    public ResponseEntity<Void> deleteDept(@PathVariable int deptId) {
        deptService.deleteDept(deptId);
        return ResponseEntity.ok().build();
    }
}
