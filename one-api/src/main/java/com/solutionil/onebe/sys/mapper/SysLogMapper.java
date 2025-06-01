package com.solutionil.onebe.sys.mapper;

import com.solutionil.onebe.sys.dto.request.LoginUserRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysLogMapper {

    void insertLoginLog(LoginUserRequest request);
}
