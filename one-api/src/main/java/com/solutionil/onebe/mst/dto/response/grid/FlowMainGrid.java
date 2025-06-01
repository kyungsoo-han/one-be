package com.solutionil.onebe.mst.dto.response.grid;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class FlowMainGrid {
    @Schema(description = "라우팅코드", example = "TEST001")
    private String flowCd;

    @Schema(description = "라우팅명", example = "정규 라우팅")
    private String flowNm;

    @Schema(description = "라우팅그룹", example = "01")
    private String flowGrp;
}
