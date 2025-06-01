package com.solutionil.onebe.mst.dto.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "공장 정보를 나타내는 클래스")
public class Fac {
    @Schema(description = "공장 아이디", example = "1")
    private Integer facId;

    @Schema(description = "법인 아이디", example = "101")
    private Integer compId;

    @Schema(description = "사업장 아이디", example = "202")
    private Integer bizId;

    @Schema(description = "공장 코드", example = "FACT01")
    private String facCd;

    @Schema(description = "공장 명", example = "서울공장")
    private String facNm;

    @Schema(description = "사용 여부", example = "Y")
    private String useYn;

    @Schema(description = "메모", example = "공장 관련 메모")
    private String memo;
}
