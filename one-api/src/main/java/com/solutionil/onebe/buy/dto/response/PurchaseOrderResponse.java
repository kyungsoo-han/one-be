package com.solutionil.onebe.buy.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@Schema(description = "PO Response")
public class PurchaseOrderResponse {
    
    @Data
    @Schema(description = "구매 발주 메인 그리드", name = "PurchaseOrderResponse.MainGrid")
    public static class MainGrid {
        private String poDate;
        private Long poId;
        private String custNm;
        private String poGbnNm;
        private String poTypeNm;
        private String empNm;
    }

    @Data
    @Schema(description = "구매 발주 상세 내용", name = "PurchaseOrderResponse.Detail")
    public static class Detail {
        private String poId;
        private String poDate;
        private String delivReqDate;
        private String poGbn;
        private String poType;
        private String custId;
        private String custNm;
        private String memo;
        private List<DetailGrid> child;
    }

    @Data
    @Schema(description = "구매 발주 품목 그리드", name = "PurchaseOrderResponse.DetailGrid")
    public static class DetailGrid {
        private Integer seqNo;
        private Integer itemId;
        private String itemNm;
        private Integer itemQty;
        private BigDecimal priceAmt;
        private String memo;
    }

}
