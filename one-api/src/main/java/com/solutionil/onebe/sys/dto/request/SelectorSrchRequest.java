package com.solutionil.onebe.sys.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class SelectorSrchRequest {

    @Schema(description = "법인 아이디", example = "1")
    private Integer compId;

    @Schema(description = "사업장 아이디", example = "1")
    private Integer bizId;

    @Schema(description = "창고 아이디", example = "1")
    private Integer whId;

    @Schema(description = "품목 아이디", example = "1")
    private Integer itemId;

    @Schema(description = "고객사 아이디", example = "1")
    private Integer custId;

    @Schema(description = "품목 로케이션 타입", example = "P:적치, A:피킹")
    private String itemLocType;

    @Schema(description = "검색어", example = "data code")
    private String searchText;

    @Schema(description = "존/로케이션 스테이지 여부", example = "Y/N")
    private String stageYn;
}
