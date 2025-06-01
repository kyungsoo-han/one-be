package com.solutionil.onebe.inb.mapper;

import com.solutionil.onebe.inb.dto.request.InboundRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InboundMapper {
    // 해당 날짜의 최대 lotNo를 조회하는 메서드
    String findMaxInboundLotNoByDate(String inboundDate);

    void saveInbound(InboundRequest request);
}
