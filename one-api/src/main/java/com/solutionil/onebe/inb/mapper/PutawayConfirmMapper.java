package com.solutionil.onebe.inb.mapper;

import com.solutionil.onebe.inb.dto.request.PutawayRequest;
import com.solutionil.onebe.inb.dto.request.PutawaySrchRequest;
import com.solutionil.onebe.inb.dto.response.PutawayConfirmGrid;
import com.solutionil.onebe.inb.dto.response.PutawayGrid;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PutawayConfirmMapper {
    List<PutawayConfirmGrid> findPutaways(PutawaySrchRequest request);

    void confirmPutaways(Long putawayId);

    void deletePutaways(Long putawayId, Long inboundId);
}
