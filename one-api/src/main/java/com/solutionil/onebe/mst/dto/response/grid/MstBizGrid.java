package com.solutionil.onebe.mst.dto.response.grid;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class MstBizGrid {
    
    @Schema(description = "사업자 아이디", example = "1")
    private Long bizId;

    @Schema(description = "사업자 코드", example = "BIZ001")
    private String bizCd;

    @Schema(description = "사업자명", example = "오차테크")
    private String bizNm;

    @Schema(description = "대표자", example = "홍길동")
    private String ownerNm;


}
