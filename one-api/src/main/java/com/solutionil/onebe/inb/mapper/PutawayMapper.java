package com.solutionil.onebe.inb.mapper;

import com.solutionil.onebe.inb.dto.request.PutawayRequest;
import com.solutionil.onebe.inb.dto.request.PutawaySrchRequest;
import com.solutionil.onebe.inb.dto.response.PutawayGrid;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PutawayMapper {

    void savePutaway(PutawayRequest request);

    void updateInboundStatus(Long inboundId);
    int getPutawayQtyByInboundId(Long inboundId);

    List<PutawayGrid> findPutawayTargets(PutawaySrchRequest request);

}
