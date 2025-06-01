package com.solutionil.onebe.inb.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "TEST PO의 Grid POApprGrid")
public class TestPurchaseOrderItemsRequest {
    @Schema(description = "전표순번", example = "1")
    int seqNo;

    @Schema(description = "품목코드", example = "ITEM001")
    String itemCd;

    @Schema(description = "수량", example = "ITEM001")
    int itemQty;

    @Schema(description = "품목비고", example = " ")
    String itemRemark;

}
