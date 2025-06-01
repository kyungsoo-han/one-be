package com.solutionil.onebe.sys.mapper;

import com.solutionil.onebe.sys.dto.request.LoginUserRequest;
import com.solutionil.onebe.sys.dto.request.SysUserRequest;
import com.solutionil.onebe.sys.dto.response.SysUserResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserMapper {

    List<SysUserResponse> selectSysUserList(String userId, String userNm);
    SysUserResponse selectSysUserDetail(String userId);
    void saveSysUser(SysUserRequest request);
    void deleteSysUser(SysUserRequest request);

    SysUserResponse login(LoginUserRequest request);
}
