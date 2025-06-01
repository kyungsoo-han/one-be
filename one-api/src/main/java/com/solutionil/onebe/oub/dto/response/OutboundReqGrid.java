package com.solutionil.onebe.oub.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "출고요청 정보를 나타내는 클래스")
public class OutboundReqGrid {
    @Schema(description = "출고요청 아이디", example = "1")
    private Long outboundReqId;

    @Schema(description = "출고요청  일자", example = "2024-08-31")
    private String reqDate;

    @Schema(description = "고객사사 명", example = "고객사")
    private String custNm;

    @Schema(description = "출고요청 유형", example = "REGULAR")
    private String oubType;

    @Schema(description = "출고요청 구분", example = "STANDARD")
    private String oubClass;

}
