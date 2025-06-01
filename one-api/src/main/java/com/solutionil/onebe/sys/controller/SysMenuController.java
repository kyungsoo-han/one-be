package com.solutionil.onebe.sys.controller;


import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.sys.dto.entity.SysMenu;
import com.solutionil.onebe.sys.service.SysMenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/sys-menu")
public class SysMenuController {

    private final SysMenuService menuService;

    @GetMapping("/main")
    public ResponseEntity<BaseResponse> selectSysMenuList(@RequestParam(value = "menuNm", required = false) String menuNm,
                                                           @RequestParam(value = "menuPath", required = false) String menuPath) {
        List<SysMenu> menuData = menuService.selectSysMenuList(menuNm, menuPath);
        return ResponseEntity.ok(BaseResponse.success(menuData));
 }
    @GetMapping("/get")
    public ResponseEntity<BaseResponse> getMenu() {
        List<SysMenu> menuData = menuService.getMenu();
        return ResponseEntity.ok(BaseResponse.success(menuData));
 }
    @GetMapping("/detail")
    public ResponseEntity<BaseResponse> selectSysMenuDetail(@RequestParam(value = "menuId") Integer menuId) {
        SysMenu menuData = menuService.selectSysMenuDetail(menuId);
        return ResponseEntity.ok(BaseResponse.success(menuData));
 }

    @PostMapping("/save")
    public ResponseEntity<BaseResponse> insertSysMenu(@RequestBody SysMenu request) {
        log.info("SysMenu ={}", request);
        menuService.insertSysMenu(request);
        return ResponseEntity.ok(BaseResponse.success(request));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<BaseResponse> deleteSysMenu(@RequestBody SysMenu request) {
        menuService.deleteSysMenu(request);
        return ResponseEntity.ok(BaseResponse.success());
    }
}
