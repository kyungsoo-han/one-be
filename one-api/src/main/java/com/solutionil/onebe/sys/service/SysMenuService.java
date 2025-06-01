package com.solutionil.onebe.sys.service;

import com.solutionil.onebe.sys.dto.entity.SysMenu;
import com.solutionil.onebe.sys.mapper.SysMenuMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class SysMenuService {
    private final SysMenuMapper menuMapper;

    public List<SysMenu> getMenu(){
        return menuMapper.getMenu();
    }
    public List<SysMenu> selectSysMenuList(String menuNm, String menuPath){
        return menuMapper.selectSysMenuList(menuNm, menuPath);
    }
    public SysMenu selectSysMenuDetail(Integer menuId){
        return menuMapper.selectSysMenuDetail(menuId);
    }

    @Transactional
    public void insertSysMenu(SysMenu request) {
        menuMapper.insertSysMenu(request);
    }

    @Transactional
    public void deleteSysMenu(SysMenu request) {
        List<Integer> deleteTarget = menuMapper.getDeleteTarget(request.getMenuId());
        deleteTarget.forEach(menuMapper::deleteSysMenu);
    }
}
