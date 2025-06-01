package com.solutionil.onebe.mst.dto.request;

import com.solutionil.onebe.comm.dto.request.BaseRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class BizRequest extends BaseRequest {

    @Schema(description = "사업자 ID", example = "1")
    private Integer bizId;

    @Schema(description = "사업자 코드", example = "BIZ001")
    private String bizCd;

    @Schema(description = "사업자명", example = "오차테크")
    private String bizNm;

    @Schema(description = "약식 명칭", example = "오차")
    private String bizSnm;

    @Schema(description = "영문 명칭", example = "ONE Tech")
    private String bizEnm;

    @Schema(description = "사업자 번호", example = "123-45-67890")
    private String bizNo;

    @Schema(description = "업태", example = "IT")
    private String bizType;

    @Schema(description = "업종", example = "물류")
    private String bizItem;

    @Schema(description = "사용 여부", example = "N")
    private String useYn;

    @Schema(description = "본사 여부", example = "N")
    private String headOfficeYn;

    @Schema(description = "대표자", example = "홍길동")
    private String ownerNm;

    @Schema(description = "개업일자", example = "2023-09-01")
    private String openDate;

    @Schema(description = "폐업일자", example = "2024-08-26")
    private String closeDate;

    @Schema(description = "이메일", example = "contact@onedb.com")
    private String email;

    @Schema(description = "전화번호", example = "02-123-4567")
    private String telNo;

    @Schema(description = "팩스번호", example = "02-987-6543")
    private String faxNo;

    @Schema(description = "우편번호", example = "12345")
    private String zipNo;

    @Schema(description = "주소", example = "서울특별시 강남구 테헤란로 123")
    private String zipAddr1;

    @Schema(description = "상세주소", example = "아크로텔 10층 101호")
    private String zipAddr2;

    @Schema(description = "메모", example = "특이사항 없음")
    private String memo;

}
