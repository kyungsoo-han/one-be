package com.solutionil.onebe.comm.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
public class BaseStockRequest extends BaseRequest{
    @Schema(description = "사업장 아이디", example = "1")
    private Integer bizId;

    @Schema(description = "품목 아이디", example = "100")
    private Integer itemId;

    @Schema(description = "로트 번호", example = "LOT123456")
    private String lotNo;

    @Schema(description = "적치 로케이션 아이디", example = "1")
    private Integer locId;

    @Schema(description = "팔레트 입수량", example = "100")
    private Integer palletUnitQty;

    @Schema(description = "박스 입수량", example = "10")
    private Integer boxUnitQty;

    @Schema(description = "케이스 입수량", example = "10")
    private Integer caseUnitQty;

    @Schema(description = "팔레트 수량", example = "500")
    private Integer palletQty;

    @Schema(description = "박스 수량", example = "500")
    private Integer boxQty;

    @Schema(description = "케이스 수량", example = "500")
    private Integer caseQty;

    @Schema(description = "낱개 수량", example = "500")
    private Integer eaQty;

    @Schema(description = "총 수량", example = "500")
    private Integer totalQty;
    
    @Schema(description = "제조 일자", example = "2023-09-01")
    private LocalDate makeDate;

    @Schema(description = "유통 기한", example = "2024-09-01")
    private LocalDate expDate;

    @Schema(description = "입출고 유형 (I:입고, O:출고)", example = "I")
    private String ioType;

    @Schema(description = "작업 유형", example = "적치 로케이션 추가")
    private String workType;

    private Long stockId;

}
