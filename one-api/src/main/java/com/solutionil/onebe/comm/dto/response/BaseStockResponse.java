package com.solutionil.onebe.comm.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseRequest;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BaseStockResponse {
    @Schema(description = "사업장 아이디", example = "1")
    private Integer bizId;

    @Schema(description = "품목 아이디", example = "100")
    private Integer itemId;

    @Schema(description = "로트 번호", example = "LOT123456")
    private String lotNo;

    @Schema(description = "창고 아이디", example = "1")
    private Integer whId;

    @Schema(description = "존 아이디", example = "1")
    private Integer zoneId;

    @Schema(description = "적치 로케이션 아이디", example = "1")
    private Integer locId;

    @Schema(description = "박스 수량", example = "500")
    private Integer boxQty;

    @Schema(description = "케이스 수량", example = "500")
    private Integer caseQty;

    @Schema(description = "낱개 수량", example = "500")
    private Integer eaQty;

    @Schema(description = "재고 수량", example = "500")
    private Integer stockQty;

    @Schema(description = "예약 수량", example = "500")
    private Integer reservedQty;

    @Schema(description = "가용 수량", example = "500")
    private Integer availableQty;

    @Schema(description = "제조 일자", example = "2023-09-01")
    private LocalDate makeDate;

    @Schema(description = "유통 기한", example = "2024-09-01")
    private LocalDate expDate;

    @Schema(description = "입출고 유형 (I:입고, O:출고)", example = "I")
    private String ioType;

    @Schema(description = "작업 유형", example = "적치 로케이션 추가")
    private String workType;

    private Long stockId;

    @Schema(description = "팔레트당 수량", example = "500")
    private Integer palletUnitQty;

    @Schema(description = "박스당 수량", example = "500")
    private Integer boxUnitQty;

    @Schema(description = "케이스당 수량", example = "500")
    private Integer caseUnitQty;
}
