package com.solutionil.onebe.sys.dto.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "t_sys_selector_d 테이블의 데이터를 나타내는 클래스")
public class SysSelectorDetail {

    @Schema(description = "룩업 구분", example = "CATEGORY")
    private String selectorGbn;

    @Schema(description = "필드명", example = "FIELD_NAME")
    private String fieldNm;

    @Schema(description = "순서", example = "1")
    private Integer seqNo;

    @Schema(description = "타이틀", example = "Title of the Field")
    private String title;

    @Schema(description = "넓이", example = "100")
    private Integer width;

    @Schema(description = "숨김 여부", example = "N")
    private String hiddenYn;

    @Schema(description = "정렬", example = "L")
    private String align;

    @Schema(description = "텍스트 표시 여부", example = "N")
    private String displayYn;

    @Schema(description = "값 표시 여부", example = "N")
    private String valueYn;

    @Schema(description = "필드 여부", example = "N")
    private String fieldYn;

    @Schema(description = "비고", example = "This is a remark.")
    private String remark;

}
