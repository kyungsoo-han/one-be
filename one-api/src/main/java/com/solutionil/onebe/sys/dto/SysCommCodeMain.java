package com.solutionil.onebe.sys.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseRequest;
import lombok.Data;

@Data
@Schema(description = "공통 코드 정보를 나타내는 클래스")
public class SysCommCodeMain  {

    @Schema(description = "공통코드 구분", example = "CATEGORY")
    private String commGbn;

    @Schema(description = "명칭", example = "Sample Code Name")
    private String commNm;

    @Schema(description = "비고", example = "This is a remark.")
    private String remark;


}
