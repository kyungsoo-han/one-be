package com.solutionil.onebe.inb.mapper;

import com.solutionil.onebe.buy.dto.response.PurchaseOrderApprResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TempInboundMapper {

    List<PurchaseOrderApprResponse.POApprGrid> popupPOList();
}
