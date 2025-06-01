package com.solutionil.onebe.sys.service;

import com.solutionil.onebe.sys.dto.SelectorType;
import com.solutionil.onebe.sys.dto.entity.SysSelectorHeader;
import com.solutionil.onebe.sys.dto.request.SelectorSrchRequest;
import com.solutionil.onebe.sys.dto.request.SysSelectorDetailRequest;
import com.solutionil.onebe.sys.dto.request.SysSelectorMainRequest;
import com.solutionil.onebe.sys.dto.response.SysSelectorDetailGrid;
import com.solutionil.onebe.sys.dto.response.SysSelectorMainGrid;
import com.solutionil.onebe.sys.mapper.SysSelectorMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class SysSelectorService {

    private final SysSelectorMapper selectorMapper;

    public <T> List<T> getSelectorData(SelectorSrchRequest request, SelectorType selectorType) {
        try {
            Method method = SysSelectorMapper.class.getMethod(selectorType.getTypeName(), request.getClass());
            return (List<T>) method.invoke(selectorMapper, request);
        } catch (Exception e) {
            throw new RuntimeException("Selector service error", e);
        }
    }

    public List<SysSelectorHeader> getSelectorHeader(){
        return selectorMapper.getSelectorHeader();
    }

    @Transactional
    public void saveSelectorMain(SysSelectorMainRequest request){
        selectorMapper.saveSelectorMain(request);
    }

    @Transactional
    public void saveSelectorDetail(SysSelectorDetailRequest request){
        selectorMapper.saveSelectorDetail(request);
    }

    @Transactional
    public void deleteSysSelectorMain(String selectorGbn){
        selectorMapper.deleteSysSelectorMain(selectorGbn);
    }

    @Transactional
    public void deleteSysSelectorDetail(String selectorGbn, String fieldNm){
        selectorMapper.deleteSysSelectorDetail(selectorGbn, fieldNm);
    }

    public List<SysSelectorMainGrid> selectSysSelectorMainList(String selectorGbn, String selectorNm){
        return selectorMapper.selectSysSelectorMainList(selectorGbn, selectorNm);
    }

    public List<SysSelectorDetailGrid> selectSysSelectorDetailList(String selectorGbn) {
        return selectorMapper.selectSysSelectorDetailList(selectorGbn);
    }

}
