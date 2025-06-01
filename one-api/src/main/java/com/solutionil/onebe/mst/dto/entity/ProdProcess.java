package com.solutionil.onebe.mst.dto.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "생산 공정 정보를 나타내는 클래스")
public class ProdProcess {
    @Schema(description = "생산 공정 아이디", example = "1")
    private Integer prodProcessId;

    @Schema(description = "법인 아이디", example = "101")
    private Integer compId;

    @Schema(description = "공장 아이디", example = "202")
    private Integer facId;

    @Schema(description = "생산 라인 아이디", example = "303")
    private Integer prodLineId;

    @Schema(description = "생산 공정 코드", example = "PROC01")
    private String prodProcCd;

    @Schema(description = "생산 공정 명", example = "용접 공정")
    private String prodProcNm;

    @Schema(description = "사용 여부", example = "Y")
    private String useYn;

    @Schema(description = "메모", example = "생산 공정 관련 메모")
    private String memo;

    @Schema(description = "창고 아이디", example = "404")
    private Long whId;

    @Schema(description = "존 아이디", example = "505")
    private Long zoneId;

    @Schema(description = "위치 아이디", example = "606")
    private Long locId;
}
