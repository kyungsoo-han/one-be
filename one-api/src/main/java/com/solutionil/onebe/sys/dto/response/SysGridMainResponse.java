package com.solutionil.onebe.sys.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "시스템 그리드 정보를 나타내는 클래스")
public class SysGridMainResponse {
    @Schema(description = "메뉴 ID", example = "1")
    private Integer menuId;

    @Schema(description = "메뉴명", example = "메뉴명")
    private String menuNm;

    @Schema(description = "그리드컨트롤 이름", example = "GridControlName")
    private String gridNm;

    @Schema(description = "그리드 구분", example = "GRID")
    private String gridGbn;

    @Schema(description = "용도(저장/조회)", example = "SAVE")
    private String purpose;

    @Schema(description = "신규 입력 가능여부", example = "Y/N")
    private String availableAddRow;

    @Schema(description = "설명", example = "This is a description of the grid.")
    private String remark;
}
