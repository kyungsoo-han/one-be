package com.solutionil.onebe.mst.dto.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "생산 라인 정보를 나타내는 클래스")
public class ProdLine {
    @Schema(description = "생산 라인 아이디", example = "1")
    private Integer prodLineId;

    @Schema(description = "법인 아이디", example = "101")
    private Integer compId;

    @Schema(description = "공장 아이디", example = "202")
    private Integer facId;

    @Schema(description = "생산 라인 코드", example = "LINE01")
    private String prodLineCd;

    @Schema(description = "생산 라인 명", example = "자동차 부품 라인")
    private String prodLineNm;

    @Schema(description = "부서 아이디", example = "303")
    private Long deptId;

    @Schema(description = "메모", example = "생산 라인 관련 메모")
    private String memo;
}
