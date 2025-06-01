package com.solutionil.onebe.buy.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Schema(description = "PO Approval Response")
public class PurchaseOrderApprResponse {

    @Data
    @Schema(description = "구매 승인 대상 조회", name = "PurchaseOrderApprResponse.POApprGrid")
    public static class POApprGrid {
        private String chk;
        private String poDate;
        private String poId;
        private String delivReqDate;
        private String poGbnNm;
        private String poTypeNm;
        private String custNm;
        private String memo;
        private Integer seqNo;
        private String itemCd;
        private String itemNm;
        private Integer itemQty;
        private BigDecimal priceAmt;
        private String memo2;
    }

}
