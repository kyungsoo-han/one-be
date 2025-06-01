package com.solutionil.onebe.mst.dto.response.grid;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "법인 정보를 나타내는 DTO")
public class MstCompGrid {

    @Schema(description = "법인 아이디", example = "1")
    private Integer compId;

    @Schema(description = "법인 코드", example = "COMP001")
    private String compCd;

    @Schema(description = "법인명", example = "ABC Corp")
    private String compNm;

    @Schema(description = "법인 번호", example = "123-45-67890")
    private String corporationNo;

    @Schema(description = "대표자", example = "John Doe")
    private String ownerNm;

}
