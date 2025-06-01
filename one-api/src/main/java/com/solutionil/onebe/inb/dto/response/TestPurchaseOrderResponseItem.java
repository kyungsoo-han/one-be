package com.solutionil.onebe.inb.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class TestPurchaseOrderResponseItem {
    @Schema(description = "전표순번", example = "1")
    private int seqNo;

    @Schema(description = "품목코드", example = "ITEM001")
    private String itemCd;

    @Schema(description = "품목명", example = " ")
    private String itemNm;

    @Schema(description = "수량", example = " ")
    private int itemQty;

    @Schema(description = "품목타입", example = " ")
    private String itemTypeNm;

    @Schema(description = "품목비고", example = " ")
    private String itemRemark;
}
