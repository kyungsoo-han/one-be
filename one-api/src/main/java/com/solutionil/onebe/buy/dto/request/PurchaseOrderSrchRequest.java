package com.solutionil.onebe.buy.dto.request;

import com.solutionil.onebe.comm.dto.request.BaseRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Schema(description = "PO Search Request")
public class PurchaseOrderSrchRequest {

    @Data
    @Schema(description = "메인 그리드 조회조건", name = "POMainGridSrchRequest")
    @EqualsAndHashCode(callSuper = true)
    public static class MainGrid extends BaseRequest {
        private Integer bizId;
        private Long poId;
        private String fDate;
        private String tDate;
        private Integer custId;
        private String poType;
        private String poGbn;
    }

}
