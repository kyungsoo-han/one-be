package com.solutionil.onebe.oub.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "입고등록(요청별) 메인 그리드")
public class OutboundReqApprMainGrid {
    @Schema(description = "선택")
    private String chk;

    @Schema(description = "출고요청 아이디", example = "1")
    private Long outboundReqId;

    @Schema(description = "요청 일자", example = "2024-08-31")
    private String reqDate;

    @Schema(description = "고객사 명", example = "")
    private String custNm;

    @Schema(description = "PO 유형", example = "REGULAR")
    private String oubType;

    @Schema(description = "PO 구분", example = "STANDARD")
    private String oubClass;

    @Schema(description = "배송지명")
    private String delivNm;

    @Schema(description = "메모")
    private String memo;

    @Schema(description = "승인 메모")
    private String apprMemo;

    @Schema(description = "출고예정일")
    private String expOutboundDate;
}
