package com.solutionil.onebe.inb.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(description = "구매 발주(PO) 정보를 나타내는 클래스")
public class InboundReqResponse {
    @Schema(description = "PO 아이디", example = "1")
    private Long inboundReqId;

    @Schema(description = "PO 일자", example = "2024-08-31")
    private String reqDate;

    @Schema(description = "PO 번호", example = "PO12345")
    private String poNo;

    @Schema(description = "PO 상태", example = "OPEN")
    private String status;

    @Schema(description = "납기 예정일", example = "2024-09-15")
    private String expDelivDate;

    @Schema(description = "공급사 아이디", example = "303")
    private Integer supplId;

    @Schema(description = "공급사 명", example = "삼성전자")
    private String supplNm;

    @Schema(description = "PO 유형 코드", example = "REGULAR")
    private String inbTypeCd;

    @Schema(description = "PO 구분 코드", example = "STANDARD")
    private String inbClassCd;

    @Schema(description = "메모", example = "특이사항 없음")
    private String memo;

    @Schema(description = "PO 품목 리스트")
    private List<InboundReqItemResponse> child;
}
