package com.solutionil.onebe.sys.mapper;

import com.solutionil.onebe.sys.dto.request.UpdateColumnWidthRequest;
import com.solutionil.onebe.sys.dto.response.GridColumnInfoResponse;
import com.solutionil.onebe.sys.dto.entity.SysGridMain;
import com.solutionil.onebe.sys.dto.request.SysGridDetailRequest;
import com.solutionil.onebe.sys.dto.request.SysGridMainRequest;
import com.solutionil.onebe.sys.dto.response.SysGridDetailResponse;
import com.solutionil.onebe.sys.dto.response.SysGridMainResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysGridMapper {
    void insertSysGridMain(SysGridMainRequest sysGrid);

    void updateSysGridM(SysGridMain sysGrid);

    void deleteSysGridMain(Integer menuId, String gridNm);

    void deleteSysGridDetail(Integer columnId);

    List<SysGridMainResponse> selectSysGridMain(String menuNm, String classId, String gridNm);

    List<SysGridDetailResponse> selectSysGridDetail(Integer menuId, String gridNm);

    List<GridColumnInfoResponse> selectGridColumnInfo(Integer menuId, String gridNm);

    void insertSysGridDetail(SysGridDetailRequest request);

    void updateGridColsWidth(List<UpdateColumnWidthRequest> request);
}
