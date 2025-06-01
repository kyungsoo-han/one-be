package com.solutionil.onebe.comm.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
public class BaseOutStockRequest {

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

}
