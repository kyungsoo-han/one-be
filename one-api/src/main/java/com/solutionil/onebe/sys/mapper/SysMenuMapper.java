package com.solutionil.onebe.sys.mapper;

import com.solutionil.onebe.sys.dto.entity.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysMenuMapper {
    List<SysMenu> getMenu();
    List<SysMenu> selectSysMenuList(String menuNm, String menuPath);

    SysMenu selectSysMenuDetail(Integer menuId);

    void insertSysMenu(SysMenu request);
    List<Integer> getDeleteTarget(Integer menuId);
    void deleteSysMenu(Integer menuId);

}
