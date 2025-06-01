package com.solutionil.onebe.inb.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "구매 발주(PO) 정보를 나타내는 클래스")
public class InboundReqGrid {
    @Schema(description = "PO 아이디", example = "1")
    private Long inboundReqId;

    @Schema(description = "PO 일자", example = "2024-08-31")
    private String reqDate;

    @Schema(description = "공급사 명", example = "공급사")
    private String supplNm;

    @Schema(description = "PO 유형", example = "REGULAR")
    private String inbType;

    @Schema(description = "PO 구분", example = "STANDARD")
    private String inbClass;

}
