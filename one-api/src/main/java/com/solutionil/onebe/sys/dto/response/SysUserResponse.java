package com.solutionil.onebe.sys.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "시스템 사용자 정보를 나타내는 클래스")
public class SysUserResponse {

    @Schema(description = "사용자 ID", example = "user123")
    private String userId;

    @Schema(description = "사용자 비밀번호", example = "password123")
    private String userPwd;

    @Schema(description = "사용자 구분", example = "admin")
    private String userType;

    @Schema(description = "사원ID", example = "1")
    private String empId;
    
    @Schema(description = "사원 명", example = "한경수")
    private String empNm;

    @Schema(description = "사용 여부", example = "Y")
    private String useYn;

    @Schema(description = "메모", example = "Sample memo")
    private String memo;

}
