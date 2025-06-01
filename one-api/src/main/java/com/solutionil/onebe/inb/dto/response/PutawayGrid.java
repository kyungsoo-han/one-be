package com.solutionil.onebe.inb.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class PutawayGrid {

    @Schema(description = "체크 상태", example = "N")
    private String chk;

    @Schema(description = "입고 아이디", example = "1")
    private Long inboundId;

    @Schema(description = "거래처 아이디", example = "1")
    private Integer custId;

    @Schema(description = "고객사명", example = "")
    private String custNm;

    @Schema(description = "공급사 아이디", example = "1")
    private Integer supplId;

    @Schema(description = "공급사명", example = "")
    private String supplNm;

    @Schema(description = "품목 아이디", example = "100")
    private Integer itemId;

    @Schema(description = "품목 코드", example = "ITEM001")
    private String itemCd;

    @Schema(description = "품목 이름", example = "품목명")
    private String itemNm;

    @Schema(description = "입고 로케이션 ID", example = "1")
    private Integer previousLocId;

    @Schema(description = "입고 로케이션 명", example = "RCV")
    private String previousLocationNm;

    @Schema(description = "적치 로케이션 ID", example = "1")
    private Integer locId;

    @Schema(description = "적치 로케이션 코드", example = "A01-01-01")
    private String locCd;

    @Schema(description = "케이스 입수량", example = "12")
    private Integer caseUnitQty;

    @Schema(description = "박스 입수량", example = "6")
    private Integer boxUnitQty;

    @Schema(description = "팔레트 입수량", example = "24")
    private Integer palletUnitQty;

    @Schema(description = "로트 번호", example = "LOT123456")
    private String lotNo;

    @Schema(description = "유통기한", example = "2024-12-01")
    private String expDate;

    @Schema(description = "제조 일자", example = "2023-12-01")
    private String makeDate;

    @Schema(description = "팔레트 수량", example = "10")
    private Integer palletQty;

    @Schema(description = "박스 수량", example = "10")
    private Integer boxQty;

    @Schema(description = "케이스 수량", example = "5")
    private Integer caseQty;

    @Schema(description = "낱개 수량", example = "50")
    private Integer eaQty;

    @Schema(description = "적치 수량", example = "500")
    private Integer totalQty;

    @Schema(description = "입고 수량", example = "500")
    private Integer inboundTotalQty;

    @Schema(description = "기적치 수량", example = "500")
    private Integer putawayTotalQty;
    
    @Schema(description = "남은 수량", example = "500")
    private Integer remainTotalQty;

    private Integer whId;

    private Integer zoneId;

}
