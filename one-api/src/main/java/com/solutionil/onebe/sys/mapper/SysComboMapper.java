package com.solutionil.onebe.sys.mapper;

import com.solutionil.onebe.sys.dto.ComboData;
import com.solutionil.onebe.sys.dto.request.ComboSrchRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysComboMapper {
    List<ComboData> getComboData();

    List<ComboData> getComboDataFromTable(String tableGbn, ComboSrchRequest request);
}
