package com.solutionil.onebe.buy.dto.request;

import com.solutionil.onebe.comm.dto.request.BaseRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Schema(description = "PO Approval Search Request")
public class PurchaseOrderApprSrchRequest {

    @Data
    @Schema(description = "그리드 조회조건", name = "POApprovalGridSrchRequest")
    @EqualsAndHashCode(callSuper = true)
    public static class POApprGrid extends BaseRequest {
        private Integer bizId;
        private Long poId;
        private String fDate;
        private String tDate;
        private Integer custId;
        private String poType;
        private String poGbn;
    }

}
