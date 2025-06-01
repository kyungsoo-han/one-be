package com.solutionil.onebe.sys.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class LoginUserRequest {
    @Schema(description = "법인 아이디")
    private Integer compId;
    @Schema(description = "로그인 아이디")
    private String loginId;
    @Schema(description = "비밀번호")
    private String password;
    @Schema(description = "내부 아이피")
    private String internalIpAddress;
    @Schema(description = "외부 아이피")
    private String externalIpAddress;
    @Schema(description = "PC 호스트명")
    private String hostName;



}
