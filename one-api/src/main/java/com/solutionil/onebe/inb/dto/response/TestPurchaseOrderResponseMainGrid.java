package com.solutionil.onebe.inb.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class TestPurchaseOrderResponseMainGrid {

    @Schema(description = "등록일", example = "YYYY-MM-DD")
    private String slipDt;

    @Schema(description = "전표번호", example = "1")
    private String slipNo;

    @Schema(description = "비고", example = " ")
    private String remark;
}
