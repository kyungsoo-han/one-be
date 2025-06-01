package com.solutionil.onebe.mst.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class FlowResponse {
    @Schema(description = "라우팅코드", example = "TEST001")
    private String flowCd;

    @Schema(description = "라우팅명", example = "정규 라우팅")
    private String flowNm;

    @Schema(description = "라우팅그룹", example = "01")
    private String flowGrp;

    @Schema(description = "비고", example = " ")
    private String remark;
}
