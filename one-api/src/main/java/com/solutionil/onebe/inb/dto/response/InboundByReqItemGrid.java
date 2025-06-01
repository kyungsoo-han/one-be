package com.solutionil.onebe.inb.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Schema(description = "구매 발주 품목 정보를 나타내는 클래스")
public class InboundByReqItemGrid {

    private String chk;

    @Schema(description = "순번", example = "1")
    private Integer refSeq;

    @Schema(description = "품목 아이디", example = "1001")
    private Integer itemId;

    @Schema(description = "품목 명", example = "품목 명")
    private String itemNm;

    @Schema(description = "박스 입수량", example = "10")
    private Integer boxUnitQty;

    @Schema(description = "케이스 입수량", example = "10")
    private Integer caseUnitQty;

    @Schema(description = "단가", example = "1000.00")
    private BigDecimal priceAmt;

    @Schema(description = "입고예정 수량", example = "10")
    private Integer reqQty;

    @Schema(description = "카톤박스 수량", example = "10")
    private Integer boxQty;

    @Schema(description = "케이스 수량", example = "10")
    private Integer caseQty;

    @Schema(description = "낱개 수량", example = "10")
    private Integer eaQty;

    @Schema(description = "입고 총 수량", example = "10")
    private Integer totalQty;

    @Schema(description = "제조 일자", example = "1991-07-16")
    private String makeDate;

    @Schema(description = "유통 기한", example = "2099-05-31")
    private String expDate;

    @Schema(description = "제조 lOT 번호", example = "LOT885222")
    private String makeLotNo;

    @Schema(description = "메모", example = "특이사항 없음")
    private String memo;
}
