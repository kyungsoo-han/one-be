package com.solutionil.onebe.inb.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Schema(description = "구매 발주 품목 정보를 나타내는 클래스")
public class InboundReqItemResponse {

    @Schema(description = "순번", example = "1")
    private Integer seqNo;

    @Schema(description = "품목 아이디", example = "1001")
    private Integer itemId;

    @Schema(description = "품목 명", example = "품목 명")
    private String itemNm;

    @Schema(description = "단가", example = "1000.00")
    private BigDecimal priceAmt;

    @Schema(description = "수량", example = "10")
    private Integer reqQty;

    @Schema(description = "제조 일자", example = "1991-07-16")
    private String makeDate;

    @Schema(description = "유통 기한", example = "2099-05-31")
    private String expDate;

    @Schema(description = "제조 lOT 번호", example = "LOT885222")
    private String makeLotNo;

    @Schema(description = "메모", example = "특이사항 없음")
    private String memo;
}
