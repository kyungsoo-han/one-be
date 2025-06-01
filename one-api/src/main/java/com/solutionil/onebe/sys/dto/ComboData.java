package com.solutionil.onebe.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "콤보박스의 공통코드 정보를 나타내는 클래스")
public class ComboData {

    @Schema(description = "공통코드 구분", example = "CATEGORY")
    private String commGbn;

    @Schema(description = "코드", example = "001")
    private String commCd;

    @Schema(description = "명칭", example = "Sample Code Name")
    private String commNm;

}
