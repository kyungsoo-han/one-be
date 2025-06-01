package com.solutionil.onebe.inb.dto.request;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseRequest;

import java.util.List;

@Data
public class TestPurchaseOrderRequest extends BaseRequest{

    @Schema(description = "저장/수정/삭제 구분자", example = "IN")
    private int compId(){
        return getCompId();
    } ;

    private String userId(){
        return getUserId();
    }

    @Schema(description = "저장/수정/삭제 구분자", example = "IN")
    private String userId;

    @Schema(description = "저장/수정/삭제 구분자", example = "IN")
    private String flag;

    @Schema(description = "전표번호", example = "yyyyMMdd-일련번호")
    private String slipNo;

    @Schema(description = "등록일", example = "yyyyMMdd")
    private String slipDt;

    @Schema(description = "요청일", example = "yyyyMMdd")
    private String reqDt;

    @Schema(description = "고객사", example = "CUST001")
    private String custCd;

    @Schema(description = "발주구분", example = "01")
    private String poGbn;

    @Schema(description = "비고", example = " ")
    private String remark;

    @Schema(description = "TEST PO 품목 리스트")
    private List<TestPurchaseOrderItemsRequest> child;
}
