package com.solutionil.onebe.buy.dto.request;

import com.solutionil.onebe.comm.dto.request.BaseRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.List;

@Schema(description = "PO Request")
@Data
public class PurchaseOrderRequest  {


    @Schema(description = "PO  저장", name = "PurchaseOrderSaveRequest")
    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Save  extends BaseRequest {
        @Schema(description = "사업장 ID")
        private Integer bizId;
        @Schema(description = "PO ID")
        private Long poId;
        @Schema(description = "PO 일자")
        private String poDate;
        @Schema(description = "납기요청일")
        private String delivReqDate;
        @Schema(description = "매입처 ID")
        private String custId;
        @Schema(description = "PO 구분 코드")
        private String poGbn;
        @Schema(description = "PO 타입 코드")
        private String poType;
        @Schema(description = "메모")
        private String memo;

        @Schema(description = "품목 상세")
        public List<SaveItem> child;
    }

    @Schema(description = "PO 품목 저장", name = "PurchaseOrderItemSaveRequest")
    @Data
    public static class SaveItem   {
        @Schema(description = "PO 품목 순번")
        private Integer seqNo;
        @Schema(description = "품목 ID")
        private Integer itemId;
        @Schema(description = "품목 수량")
        private Integer itemQty;
        @Schema(description = "단가")
        private BigDecimal priceAmt;
        @Schema(description = "메모")
        private String memo;
    }


    @Data
    @Schema(description = "PO 삭제", name = "PurchaseOrderDeleteRequest")
    public static class Delete   {
        @Schema(description = "PO ID")
        private Long poId;

    }


    @Schema(description = "PO 승인", name = "PurchaseOrderApprRequest")
    @Data
    @EqualsAndHashCode(callSuper = true)
    public static class Approval  extends BaseRequest {
        @Schema(description = "PO ID")
        private Long poId;

        @Schema(description = "PO 순번")
        private Integer seqNo;

    }

    @Data
    @Schema(description = "PO 승인 취소", name = "PurchaseOrderApprCancelRequest")
    public static class Cancel   {
        @Schema(description = "PO ID")
        private Long poId;

        @Schema(description = "PO 순번")
        private Integer seqNo;

    }
    
}
