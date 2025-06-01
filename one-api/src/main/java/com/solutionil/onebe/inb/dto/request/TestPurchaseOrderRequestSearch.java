package com.solutionil.onebe.inb.dto.request;

import com.solutionil.onebe.comm.dto.request.BaseRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class TestPurchaseOrderRequestSearch extends BaseRequest {

    @Schema(description = "조회 사업장", example = "YYYY-MM-DD")
    private int compId(){
        return getCompId();
    };

    @Schema(description = "조회 유저", example = "YYYY-MM-DD")
    private String userId(){
        return getUserId();
    }
    
    @Schema(description = "조회 시작일", example = "YYYY-MM-DD")
    private String fromDate;

    @Schema(description = "조회 종료일", example = "YYYY-MM-DD")
    private String toDate;

    @Schema(description = "조회 전표번호", example = "1")
    private String slipNo;
}
