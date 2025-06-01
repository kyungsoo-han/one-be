package com.solutionil.onebe.mst.dto.request.srch;

import com.solutionil.onebe.comm.dto.request.BaseRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class FlowSrchRequest extends BaseRequest {
    /* * * * * * * * * * * * * * * * * * * * * * *
     * compId : Base Request 상속
     * userId : Base Request 상속
     * facId  : Base Request 상속 예정
     * * * * * * * * * * * * * * * * * * * * * * * */
    @Schema(description = "공장코드", example = "01")
    private String facId;

    @Schema(description = "라우팅코드/명", example = "TEST001")
    private String flowCd;

    @Schema(description = "라우팅그룹", example = "01")
    private String flowGrp;
}
