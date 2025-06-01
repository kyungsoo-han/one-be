package com.solutionil.onebe.mst.dto.request;

import lombok.Data;
import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseRequest;

@Data
public class FlowMstRequest extends BaseRequest{

    /* * * * * * * * * * * * * * * * * * * * * * *
    * compId : Base Request 상속
    * userId : Base Request 상속
    * facId  : Base Request 상속 예정
    * * * * * * * * * * * * * * * * * * * * * * * */

    @Schema(description = "저장/수정/삭제 구분자", example = "IN")
    private String flag;

    /*
    @Schema(description = "사업장코드", example = "01")
    private int compId(){
        return getCompId();
    };

    @Schema(description = "유저명", example = "hanks")
    private String userId(){
        return getUserId();
    };
    */

    @Schema(description = "공장코드", example = "01")
    private String facId;
    
    @Schema(description = "라우팅 코드", example = "F001")
    private String flowCd;

    @Schema(description = "라우팅 명", example = "정규 공정 반제품 라우팅")
    private String flowNm;

    @Schema(description = "라우팅 그룹", example = "라우팅 그룹")
    private String flowGrp;
    
    @Schema(description = "비고", example = "")
    private String remark;

    @Schema(description = "저장 전 Duplicate Check", example = "")
    private String dupCheck;
    
    @Schema(description = "저장 전 에러 메세지 반환", example = "")
    private String returnMsg;
}
