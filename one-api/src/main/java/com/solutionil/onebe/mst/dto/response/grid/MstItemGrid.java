package com.solutionil.onebe.mst.dto.response.grid;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "품목 정보를 나타내는 DTO")
public class MstItemGrid {

    @Schema(description = "품목 아이디", example = "1")
    private Integer itemId;

    @Schema(description = "품목 코드", example = "ITEM001")
    private String itemCd;

    @Schema(description = "품목 명", example = "상품명")
    private String itemNm;

    @Schema(description = "규격", example = "50x50cm")
    private String standard;

    @Schema(description = "품목 타입", example = "반제품")
    private String itemType;

}
