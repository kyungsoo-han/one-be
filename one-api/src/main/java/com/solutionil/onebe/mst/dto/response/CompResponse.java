package com.solutionil.onebe.mst.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "법인 정보를 나타내는 DTO")
public class CompResponse {

    @Schema(description = "법인 아이디", example = "1")
    private String compId;

    @Schema(description = "법인 코드", example = "COMP001")
    private String compCd;

    @Schema(description = "법인명", example = "ABC Corp")
    private String compNm;

    @Schema(description = "약식 명칭", example = "ABC")
    private String compSnm;

    @Schema(description = "영문 명칭", example = "ABC Corporation")
    private String compEnm;

    @Schema(description = "법인 번호", example = "123-45-67890")
    private String corporationNo;

    @Schema(description = "대표자", example = "John Doe")
    private String ownerNm;

    @Schema(description = "설립일자", example = "2000-01-01")
    private String makeDate;

    @Schema(description = "개업일자", example = "2001-01-01")
    private String openDate;

    @Schema(description = "폐업일자", example = "2020-01-01")
    private String closeDate;

    @Schema(description = "이메일", example = "userId@example.com")
    private String email;

    @Schema(description = "전화번호", example = "02-1234-5678")
    private String telNo;

    @Schema(description = "팩스번호", example = "02-9876-5432")
    private String faxNo;

    @Schema(description = "우편번호", example = "12345")
    private String zipNo;

    @Schema(description = "주소", example = "서울특별시 강남구")
    private String zipAddr1;

    @Schema(description = "상세주소", example = "강남대로 123")
    private String zipAddr2;

    @Schema(description = "메모", example = "기타 참고사항")
    private String memo;
}
