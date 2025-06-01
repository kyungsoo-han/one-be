package com.solutionil.onebe.mst.service;

import com.solutionil.onebe.mst.dto.request.FlowMstRequest;
import com.solutionil.onebe.mst.dto.request.srch.FlowSrchRequest;
import com.solutionil.onebe.mst.dto.response.FlowResponse;
import com.solutionil.onebe.mst.dto.response.grid.FlowMainGrid;
import com.solutionil.onebe.mst.mapper.FlowMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class FlowService {
    private final FlowMapper flowMapper;

    @Transactional
    public void InsertFlowMst(FlowMstRequest request) {

        // ========================================================================================
        // 신규 저장 전 Key Duplicate Check
        int dupCnt = flowMapper.SelectDuplicateFlowCd(request);

        // ========================================================================================
        // Key Duplicate Error 시 Return
        if (dupCnt > 0) {
            String returnMsg = "[Duplicate Error]";
            returnMsg += "\r\n\r\n";
            returnMsg += "이미 해당 코드로 생성된 Flow가 존재합니다.";
            returnMsg += "\r\n";
            returnMsg += "중복코드 : " + request.getFlowCd();
            request.setReturnMsg(returnMsg);
            request.setDupCheck("-1");
            throw new IllegalStateException("에러 리턴 테스트");
        }

        // ========================================================================================
        // Insert FlowMst
        flowMapper.InsertFlowMst(request);
        request.setReturnMsg("");
        request.setDupCheck("0");
    }

    @Transactional
    public void UpdateFlowMst(FlowMstRequest request) {
        // ========================================================================================
        // Update
        flowMapper.UpdateFlowMst(request);

    }

    public List<FlowMainGrid> SelectFlowMainGrid(FlowSrchRequest request) {
        return flowMapper.SelectFlowMainGrid(request);
    }

    public FlowResponse SelectFlowDetailControl(FlowSrchRequest request) {
        return flowMapper.SelectFlowDetailControl(request);
    }
}
