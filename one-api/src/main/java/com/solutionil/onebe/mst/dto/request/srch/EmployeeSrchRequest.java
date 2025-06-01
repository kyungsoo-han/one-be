package com.solutionil.onebe.mst.dto.request.srch;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class EmployeeSrchRequest extends BaseSrchRequest {

    @Schema(description = "부서명")
    private String deptNm;

    @Schema(description = "사원명")
    private String empNm;

    @Schema(description = "직위")
    private String jobPosition;

    @Schema(description = "직책")
    private String jobDuty;

    @Schema(description = "입사일자 시작일")
    private String enterFdate;

    @Schema(description = "입사일자 종료일")
    private String enterTdate;

    @Schema(description = "퇴사일자 시작일")
    private String resignFdate;

    @Schema(description = "퇴사일자 종료일")
    private String resignTdate;


}
