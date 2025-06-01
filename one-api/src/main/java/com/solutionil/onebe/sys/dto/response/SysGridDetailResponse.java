package com.solutionil.onebe.sys.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "시스템 그리드 상세 정보를 나타내는 클래스")
public class SysGridDetailResponse {
    @Schema(description = "체크박스", example = "N")
    private String chk;

    @Schema(description = "컬럼 ID", example = "1")
    private Integer columnId;

    @Schema(description = "타이틀, 헤더", example = "Title Header")
    private String title;

    @Schema(description = "그룹 명", example = "Group Name")
    private String band;

    @Schema(description = "순서", example = "1")
    private Integer seq;

    @Schema(description = "넓이", example = "100")
    private Integer width;

    @Schema(description = "컬럼 유형", example = "TX")
    private String type;

    @Schema(description = "콤보, 서치룩업의 구분자", example = "TYPE_GBN")
    private String typeGbn;

    @Schema(description = "필드명", example = "FIELD_NAME")
    private String fieldNm;

    @Schema(description = "리소스명", example = "RESOURCE_NAME")
    private String resNm;

    @Schema(description = "정렬", example = "L")
    private String align;

    @Schema(description = "키 컬럼 여부", example = "N")
    private String keyYn;

    @Schema(description = "변경 가능 여부", example = "N")
    private String cannotModifyYn;

    @Schema(description = "읽기 전용 여부", example = "N")
    private String readonlyYn;

    @Schema(description = "숨김 여부", example = "N")
    private String hiddenYn;

    @Schema(description = "소수점", example = "2")
    private Integer decimalPt;

    @Schema(description = "최대 입력문자 수", example = "2")
    private Integer maxLength;

    @Schema(description = "필수 여부", example = "N")
    private String mandatoryYn;

    @Schema(description = "정렬 여부", example = "N")
    private String sortYn;

    @Schema(description = "필터 여부", example = "N")
    private String filterYn;

    @Schema(description = "그룹핑 여부", example = "N")
    private String groupYn;

    @Schema(description = "틀 고정 여부", example = "N")
    private String fixYn;

    @Schema(description = "합계 여부", example = "N")
    private String sumYn;

    @Schema(description = "기타1", example = "Additional Info 1")
    private String etc1;

    @Schema(description = "기타2", example = "Additional Info 2")
    private String etc2;

    @Schema(description = "기타3", example = "Additional Info 3")
    private String etc3;

    @Schema(description = "기타4", example = "Additional Info 4")
    private String etc4;

}
