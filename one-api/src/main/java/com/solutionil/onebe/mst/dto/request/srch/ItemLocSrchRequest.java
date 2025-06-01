package com.solutionil.onebe.mst.dto.request.srch;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ItemLocSrchRequest {

    @Schema(description = "품목 아이디")
    private Integer itemId;
    @Schema(description = "P:적치/A:할당")
    private String itemLocType;

}
