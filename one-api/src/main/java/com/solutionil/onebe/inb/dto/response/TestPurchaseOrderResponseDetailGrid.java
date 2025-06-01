package com.solutionil.onebe.inb.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
public class TestPurchaseOrderResponseDetailGrid {

    @Schema(description = "전표번호", example = "1")
    private String slipNo;

    @Schema(description = "등록일자", example = "yyyy-MM-dd")
    private String slipDt;

    @Schema(description = "요청일자", example = "yyyy-MM-dd")
    private String reqDt;

    @Schema(description = "고객사코드", example = "CUST001")
    private String custCd;

    @Schema(description = "고객사 명", example = "아셀씨앤아이")
    private String custNm;

    @Schema(description = "주문구분", example = " ")
    private String poGbn;

    @Schema(description = "비고", example = " ")
    private String remark;

    @Schema(description = "그리드 정보", example = " ")
    private List<TestPurchaseOrderResponseItem> child;
}
