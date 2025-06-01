package com.solutionil.onebe.mst.dto.response;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class DeptResponse {

    @Schema(description = "법인 ID", example = "1")
    private int compId;

    @Schema(description = "사업장 ID", example = "101")
    private int bizId;

    @Schema(description = "부서 ID", example = "1001")
    private int deptId;

    @Schema(description = "부서 코드", example = "D001")
    private String deptCd;

    @Schema(description = "부서명", example = "인사부")
    private String deptNm;

    @Schema(description = "상위 부서 ID", example = "1000", nullable = true)
    private Integer parentId;

    @Schema(description = "부서 유형", example = "본사")
    private String deptType;

    @Schema(description = "부서 구분", example = "정규")
    private String deptGbn;

    @Schema(description = "사용 여부", allowableValues = {"Y", "N"}, example = "Y")
    private String useYn;

    @Schema(description = "정렬 순서", example = "1")
    private int seq;

    @Schema(description = "전화번호", example = "02-1234-5678")
    private String telNo;

    @Schema(description = "팩스번호", example = "02-8765-4321")
    private String faxNo;

    @Schema(description = "비고", example = "부서 관련 비고 사항")
    private String remark;
}
