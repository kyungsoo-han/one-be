package com.solutionil.onebe.sys.dto.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@Schema(description = "t_sys_selector_m 테이블의 데이터를 나타내는 클래스")
public class SysSelectorMain {

    @Schema(description = "룩업 구분", example = "CATEGORY")
    private String selectorGbn;

    @Schema(description = "룩업명", example = "Category Selector")
    private String selectorNm;

    @Schema(description = "사용 여부", example = "Y")
    private String useYn;

    @Schema(description = "비고", example = "This is a remark.")
    private String remark;

    @Schema(description = "쿼리 데이터", example = "SELECT * FROM ...")
    private String queryData;

    @Schema(description = "쿼리 적용자", example = "queryApplier")
    private String queryApplyId;

    @Schema(description = "쿼리 적용일", example = "2024-08-31T12:34:56")
    private LocalDateTime queryApplyDt;

}
