package com.solutionil.onebe.oub.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Schema(description = "출고요청 품목 정보를 나타내는 클래스")
public class OutboundReqItemRequest {
    @Schema(description = "출고요청 아이디", example = "1")
    private Long outboundReqId;

    @Schema(description = "순번", example = "1")
    private Integer seqNo;

    @Schema(description = "품목 아이디", example = "1001")
    private Integer itemId;

    @Schema(description = "단가", example = "1000.00")
    private BigDecimal priceAmt;

    @Schema(description = "수량", example = "10")
    private Integer reqQty;

    @Schema(description = "메모", example = "특이사항 없음")
    private String memo;
}
