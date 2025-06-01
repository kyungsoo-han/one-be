package com.solutionil.onebe.sys.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "t_sys_selector_m 테이블의 데이터를 나타내는 클래스")
public class SysSelectorDetailGrid {

    @Schema(description = "필드명", example = "CATEGORY")
    private String fieldNm;
    @Schema(description = "순서", example = "1")
    private Integer seqNo;
    @Schema(description = "제목", example = "제목")
    private String title;
    @Schema(description = "넓이", example = "100")
    private Integer width;
    @Schema(description = "숨김 여부", example = "N")
    private String hiddenYn;
    @Schema(description = "정렬", example = "L")
    private String align;
    @Schema(description = "Text 값 여부", example = "N")
    private String displayYn;
    @Schema(description = "Value 값 여부", example = "N")
    private String valueYn;
    @Schema(description = "Field 값 여부", example = "N")
    private String fieldYn;
    @Schema(description = "비고", example = "This is remark.")
    private String remark;


}
