package com.solutionil.onebe.sys.controller;


import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.sys.dto.request.LoginUserRequest;
import com.solutionil.onebe.sys.dto.request.SysUserRequest;
import com.solutionil.onebe.sys.dto.response.SysUserResponse;
import com.solutionil.onebe.sys.service.SysUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/sys-user")
public class SysUserController {

    private final SysUserService userService;

    @GetMapping("/list")
    public ResponseEntity<BaseResponse> selectSysUserList(@RequestParam(value = "userId", required = false) String userId,
                                                           @RequestParam(value = "userNm", required = false) String userNm) {
        List<SysUserResponse> menuData = userService.selectSysUserList(userId, userNm);
        return ResponseEntity.ok(BaseResponse.success(menuData));
 }

    @GetMapping("/detail")
     public ResponseEntity<BaseResponse> selectSysUserDetail(@RequestParam(value = "userId") String userId) {
        SysUserResponse sysUser = userService.selectSysUserDetail(userId);
         return ResponseEntity.ok(BaseResponse.success(sysUser));
  }

   @PostMapping("/login")
    public ResponseEntity<BaseResponse> login(@RequestBody LoginUserRequest request) {
       SysUserResponse sysUser = userService.login(request);
        return ResponseEntity.ok(BaseResponse.success(sysUser));
 }
    @PostMapping("/save")
    public ResponseEntity<BaseResponse> insertSysMenu(@RequestBody SysUserRequest request) {
        log.info("SysMenu ={}", request);
        userService.saveSysUser(request);
        return ResponseEntity.ok(BaseResponse.success(request));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<BaseResponse> deleteSysMenu(@RequestBody SysUserRequest request) {
        userService.deleteSysUser(request);
        return ResponseEntity.ok(BaseResponse.success());
    }
}
