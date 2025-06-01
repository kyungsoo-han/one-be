package com.solutionil.onebe.sys.service;

import com.solutionil.onebe.sys.dto.ComboData;
import com.solutionil.onebe.sys.dto.SysCommCodeDetail;
import com.solutionil.onebe.sys.dto.request.ComboSrchRequest;
import com.solutionil.onebe.sys.mapper.SysComboMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class SysComboService {

    private final SysComboMapper comboMapper;

    public List<ComboData> getComboData(){
        return comboMapper.getComboData();
    }

    public List<ComboData> getComboDataFromTable(String tableGbn, ComboSrchRequest request){
        return comboMapper.getComboDataFromTable(tableGbn, request);
    }
}
