package com.solutionil.onebe.mst.dto.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "창고 정보를 나타내는 클래스")
public class Wh {
    @Schema(description = "창고 아이디", example = "1")
    private Integer whId;

    @Schema(description = "창고 코드", example = "WH01")
    private String whCd;

    @Schema(description = "창고 명", example = "주창고")
    private String whNm;

    @Schema(description = "사용 여부", example = "Y")
    private String useYn;

    @Schema(description = "메모", example = "창고 관련 메모")
    private String memo;
}
