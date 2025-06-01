package com.solutionil.onebe.sys.mapper;

import com.solutionil.onebe.sys.dto.request.SysCommCodeDetailRequest;
import com.solutionil.onebe.sys.dto.request.SysCommCodeMainRequest;
import com.solutionil.onebe.sys.dto.response.SysCommCodeDetailResponse;
import com.solutionil.onebe.sys.dto.response.SysCommCodeMainResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysCommCodeMapper {

    List<SysCommCodeMainResponse> selectSysCommCodeMainList(String commGbn, String commNm);
    List<SysCommCodeDetailResponse> selectSysCommCodeDetailList(String commGbn);
    void saveSysCommCodeMain(SysCommCodeMainRequest request);
    void saveSysCommCodeDetail(SysCommCodeDetailRequest request);
}
