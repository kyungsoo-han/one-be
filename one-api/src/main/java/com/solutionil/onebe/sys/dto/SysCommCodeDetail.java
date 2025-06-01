package com.solutionil.onebe.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "공통 코드 정보를 나타내는 클래스")
public class SysCommCodeDetail {

    @Schema(description = "코드", example = "001")
    private String commCd;

    @Schema(description = "명칭", example = "Sample Code Name")
    private String commNm;

    @Schema(description = "사용여부", example = "Y")
    private String useYn;

    @Schema(description = "순서", example = "1")
    private Integer seqNo;

    @Schema(description = "문자값1", example = "String Value 1")
    private String string1;

    @Schema(description = "문자값2", example = "String Value 2")
    private String string2;

    @Schema(description = "문자값3", example = "String Value 3")
    private String string3;

    @Schema(description = "문자값4", example = "String Value 4")
    private String string4;

    @Schema(description = "숫자값1", example = "100")
    private Integer number1;

    @Schema(description = "숫자값2", example = "200")
    private Integer number2;

    @Schema(description = "숫자값3", example = "300")
    private Integer number3;

    @Schema(description = "숫자값4", example = "400")
    private Integer number4;

    @Schema(description = "상세 비고", example = "This is a sub remark.")
    private String subRemark;

}
