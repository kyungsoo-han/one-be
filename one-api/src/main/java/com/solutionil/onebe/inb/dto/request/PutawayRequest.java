package com.solutionil.onebe.inb.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseStockRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper=false)
public class PutawayRequest extends BaseStockRequest {

    private Long putawayId;

    @Schema(description = "입고 아이디", example = "1")
    private Long inboundId;

    @Schema(description = "입고 로케이션 아이디", example = "1")
    private Integer previousLocId;

    @Schema(description = "적치 창고 아이디", example = "1")
    private Integer whId;

    @Schema(description = "적치 존 아이디", example = "1")
    private Integer zoneId;

    @Schema(description = "팔레트 수량", example = "10")
    private Integer palletQty;

    @Schema(description = "박스 수량", example = "10")
    private Integer boxQty;

    @Schema(description = "케이스 수량", example = "10")
    private Integer caseQty;

    @Schema(description = "낱개 수량", example = "10")
    private Integer eaQty;

    @Schema(description = "입고 수량", example = "10")
    private Integer inboundTotalQty;

    @Schema(description = "적치 상태", example = "00: 미확정/ 01:확정")
    private String confirmStatus;

    @Schema(description = "적치 일자", example = "2024-09-24")
    private String putawayDate;

}
