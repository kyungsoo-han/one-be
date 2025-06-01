package com.solutionil.onebe.mst.service;

import com.solutionil.onebe.mst.dto.entity.Wh;
import com.solutionil.onebe.mst.dto.request.WhRequest;
import com.solutionil.onebe.mst.mapper.WhMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class WhService {

    private final WhMapper whMapper;

    @Transactional
    public void insertWh(WhRequest request) {
        whMapper.insertWh(request);
    }

    @Transactional
    public void deleteWh(Integer whId) {
        whMapper.deleteWh(whId);
    }

    public List<Wh> findWhs(Integer compId, Integer bizId, String whCd, String whNm) {
        return whMapper.findWhs(compId, bizId,whCd, whNm);
    }
}
