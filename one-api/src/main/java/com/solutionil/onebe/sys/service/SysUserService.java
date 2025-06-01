package com.solutionil.onebe.sys.service;

import com.solutionil.onebe.mst.dto.response.EmployeeResponse;
import com.solutionil.onebe.mst.mapper.EmployeeMapper;
import com.solutionil.onebe.sys.dto.request.LoginUserRequest;
import com.solutionil.onebe.sys.dto.request.SysUserRequest;
import com.solutionil.onebe.sys.dto.response.SysUserResponse;
import com.solutionil.onebe.sys.mapper.SysLogMapper;
import com.solutionil.onebe.sys.mapper.SysUserMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class SysUserService {
    private final SysUserMapper userMapper;
    private final EmployeeMapper employeeMapper;
    private final SysLogMapper logMapper;

    public List<SysUserResponse> selectSysUserList(String userId, String userNm){
        return userMapper.selectSysUserList(userId,userNm);}

    public SysUserResponse selectSysUserDetail(String userId){
        return userMapper.selectSysUserDetail(userId);}

    @Transactional
    public void saveSysUser(SysUserRequest request) {
        userMapper.saveSysUser(request);
    }

    @Transactional
    public void deleteSysUser(SysUserRequest request) {
         userMapper.deleteSysUser(request);
    }

    public SysUserResponse login(LoginUserRequest request) {
            logMapper.insertLoginLog(request);
         return userMapper.login(request);
    }
}
