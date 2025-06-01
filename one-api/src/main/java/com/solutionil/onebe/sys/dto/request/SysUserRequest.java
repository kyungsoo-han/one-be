package com.solutionil.onebe.sys.dto.request;

import com.solutionil.onebe.comm.dto.request.BaseRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "시스템 사용자 정보를 나타내는 클래스")
public class SysUserRequest extends BaseRequest {

    @Schema(description = "사용자 ID", example = "user123")
    private String userId;

    @Schema(description = "사용자 비밀번호", example = "password123")
    private String userPwd;

    @Schema(description = "사용자 구분", example = "admin")
    private String userType;

    @Schema(description = "사원ID", example = "1")
    private Integer empId;

    @Schema(description = "사용 여부", example = "Y")
    private String useYn;

    @Schema(description = "메모", example = "Sample memo")
    private String memo;

}
