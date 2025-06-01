package com.solutionil.onebe.mst.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "거래처 정보를 나타내는 DTO")
public class CustResponse {

    @Schema(description = "거래처 아이디", example = "1")
    private Long custId;

    @Schema(description = "거래처 코드", example = "CUST1001")
    private String custCd;

    @Schema(description = "거래처 명", example = "XYZ Corporation")
    private String custNm;

    @Schema(description = "거래처 약식 명", example = "XYZ Corp")
    private String custSnm;

    @Schema(description = "거래처 영문명", example = "XYZ Corp Ltd.")
    private String custEnm;

    @Schema(description = "거래처 상태(거래여부)", example = "Y")
    private String tradeYn;

    @Schema(description = "사업자 번호", example = "123-45-67890")
    private String bizNo;

    @Schema(description = "업태", example = "Manufacturing")
    private String bizType;

    @Schema(description = "종목", example = "Electronics")
    private String bizItem;

    @Schema(description = "국가 코드", example = "KR")
    private String nationCd;

    @Schema(description = "거래처구분 코드(01:매출/02:매입/03:매출&매입/04:외주/05:기타)", example = "")
    private String custGbnCd;

    @Schema(description = "대표자", example = "Alice Johnson")
    private String ownerNm;

    @Schema(description = "설립일자", example = "2010-05-20")
    private String makeDate;

    @Schema(description = "개시일자", example = "2011-07-01")
    private String openDate;

    @Schema(description = "폐업일자", example = "2023-12-31")
    private String closeDate;

    @Schema(description = "이메일", example = "contact@xyz.com")
    private String email;

    @Schema(description = "전화번호", example = "010-1234-5678")
    private String telNo;

    @Schema(description = "팩스번호", example = "02-9876-5432")
    private String faxNo;

    @Schema(description = "담당자 이름", example = "Bob Smith")
    private String empNm;

    @Schema(description = "담당자 연락처", example = "010-8765-4321")
    private String empPhoneNo;

    @Schema(description = "담당자 이메일", example = "bob@xyz.com")
    private String empEmail;

    @Schema(description = "우편번호", example = "04567")
    private String zipNo;

    @Schema(description = "주소", example = "서울특별시 중구 명동길 12")
    private String zipAddr1;

    @Schema(description = "상세주소", example = "명동빌딩 5층")
    private String zipAddr2;

    @Schema(description = "홈페이지", example = "https://www.xyz.com")
    private String homepage;

    @Schema(description = "거래 시작일자", example = "2011-08-01")
    private String tradeStartDate;

    @Schema(description = "거래 종료일자", example = "2023-11-30")
    private String tradeEndDate;

    @Schema(description = "메모", example = "중요 거래처")
    private String memo;

}
