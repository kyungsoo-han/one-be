package com.solutionil.onebe.oub.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseStockRequest;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper=false)
public class AllocationRequest extends BaseStockRequest {

    private Long allocationId;

    @Schema(description = "자동할당 아이디", example = "1")
    private Long autoAllocationId;
    
    @Schema(description = "출고요청 아이디", example = "1")
    private Long outboundReqId;

    @Schema(description = "고객사 아이디", example = "1")
    private Integer custId;
    
    @Schema(description = "배송지 아이디", example = "1")
    private Integer delivId;

    @Schema(description = "이전 로케이션 아이디", example = "1")
    private Integer previousLocId;

    @Schema(description = "이전 창고 아이디", example = "1")
    private Integer whId;

    @Schema(description = "이전 존 아이디", example = "1")
    private Integer zoneId;

    @Schema(description = "적치 일자", example = "2024-09-24")
    private String allocationDate;

    @Builder
    public AllocationRequest(Integer compId, Integer bizId, Long autoAllocationId, Integer custId, Integer delivId,
                             Integer itemId, String lotNo, Integer whId, Integer zoneId, Integer previousLocId,
                             Integer locId, Integer palletQty, Integer boxQty, Integer caseQty, Integer eaQty, Integer totalQty,
                             LocalDate makeDate, LocalDate expDate, String ioType, String workType) {
        super.setCompId(compId);
        super.setBizId(bizId);
        super.setItemId(itemId);
        super.setLotNo(lotNo);
        super.setLocId(locId);
        super.setPalletQty(palletQty);
        super.setBoxQty(boxQty);
        super.setCaseQty(caseQty);
        super.setEaQty(eaQty);
        super.setTotalQty(totalQty);
        super.setMakeDate(makeDate);
        super.setExpDate(expDate);
        super.setIoType(ioType);
        super.setWorkType(workType);
        setPreviousLocId(previousLocId);
        setAutoAllocationId(autoAllocationId);
        setCustId(custId);
        setDelivId(delivId);
    }
}
