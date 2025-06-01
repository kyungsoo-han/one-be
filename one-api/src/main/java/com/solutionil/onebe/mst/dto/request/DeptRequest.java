package com.solutionil.onebe.mst.dto.request;
import com.solutionil.onebe.comm.dto.request.BaseRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class DeptRequest extends BaseRequest {
       @Schema(description = "사업장 ID")
       private int bizId;

       @Schema(description = "부서 ID")
       private int deptId;

       @Schema(description = "부서 코드")
       private String deptCd;

       @Schema(description = "부서명")
       private String deptNm;

       @Schema(description = "상위 부서 ID")
       private Integer parentId;

       @Schema(description = "부서 유형")
       private String deptType;

       @Schema(description = "부서 구분")
       private String deptGbn;

       @Schema(description = "사용 여부")
       private String useYn;

       @Schema(description = "정렬 순서")
       private int seq;

       @Schema(description = "전화번호")
       private String telNo;

       @Schema(description = "팩스번호")
       private String faxNo;

       @Schema(description = "비고")
       private String remark;
}
