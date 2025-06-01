package com.solutionil.onebe.inb.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseRequest;
import com.solutionil.onebe.comm.dto.request.BaseStockRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
public class InboundRequest extends BaseStockRequest {

    private Long inboundId;

    @Schema(description = "입고요청 일자", example = "1")
    String refDate;

    @Schema(description = "입고요청 아이디", example = "1")
    Long refNo;

    @Schema(description = "공급사 아이디", example = "1")
    private Integer supplId;

    @Schema(description = "입고 날짜", example = "2024-09-24")
    private String inboundDate;

    @Schema(description = "창고 아이디", example = "1")
    private Integer whId;

    @Schema(description = "존 아이디", example = "1")
    private Integer zoneId;

    @Schema(description = "팔레트 수량", example = "10")
    private Integer palletQty;
    
    @Schema(description = "박스 수량", example = "10")
    private Integer boxQty;

    @Schema(description = "케이스 수량", example = "10")
    private Integer caseQty;

    @Schema(description = "낱개 수량", example = "10")
    private Integer eaQty;

    @Schema(description = "메모", example = "긴급 입고")
    private String memo;

    @Schema(description = "참조 순번(입고요청순번)", example = "1")
    private Integer refSeq;


    private Long stockId;
}
