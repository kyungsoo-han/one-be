package com.solutionil.onebe.oub.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.inb.dto.response.InboundReqItemResponse;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "출고요청 정보를 나타내는 클래스")
public class OutboundReqResponse {
    @Schema(description = "출고요청 아이디", example = "1")
    private Long outboundReqId;

    @Schema(description = "출고요청 일자", example = "2024-08-31")
    private String reqDate;

    @Schema(description = "출고요청 상태", example = "OPEN")
    private String status;

    @Schema(description = "납기 예정일", example = "2024-09-15")
    private String expOutboundDate;

    @Schema(description = "고객사 아이디", example = "303")
    private Integer custId;

    @Schema(description = "고객사 명", example = "303")
    private String custNm;

    @Schema(description = "배송지 아이디", example = "303")
    private Integer delivId;

    @Schema(description = "배송지 명", example = "303")
    private String delivNm;

    @Schema(description = "출고요청 유형 코드", example = "REGULAR")
    private String oubTypeCd;

    @Schema(description = "출고요청 구분 코드", example = "STANDARD")
    private String oubClassCd;

    @Schema(description = "메모", example = "특이사항 없음")
    private String memo;

    @Schema(description = "출고요청 품목 리스트")
    private List<OutboundReqItemResponse> child;
}
