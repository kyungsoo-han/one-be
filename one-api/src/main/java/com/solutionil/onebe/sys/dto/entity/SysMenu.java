package com.solutionil.onebe.sys.dto.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
@Schema(description = "시스템 메뉴 정보를 나타내는 클래스")
public class SysMenu extends BaseRequest {

    @Schema(description = "메뉴 ID", example = "1")
    private Integer menuId;

    @Schema(description = "상위 코드", example = "0")
    private Integer parentId;

    @Schema(description = "메뉴명", example = "대시보드")
    private String menuNm;

    @Schema(description = "메뉴 레벨", example = "1")
    private Integer menuLvl;

    @Schema(description = "메뉴 경로", example = "/dashboard")
    private String menuPath;

    @Schema(description = "메뉴 권한", example = "ADMIN")
    private String menuAuth;

    @Schema(description = "하위 메뉴 여부", example = "N")
    private String getChild;

    @Schema(description = "순서", example = "1")
    private Integer seq;

    @Schema(description = "메인 여부", example = "N")
    private String mainYn;

    @Schema(description = "사용 여부", example = "Y")
    private String useYn;

    @Schema(description = "화면 ID", example = "SCREEN_01")
    private String classId;
}
