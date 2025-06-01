package com.solutionil.onebe.inb.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
@Schema(description = "구매 발주(PO) 정보를 나타내는 클래스")
public class InboundReqRequest extends BaseRequest {
    @Schema(description = "PO 아이디", example = "1")
    private Long inboundReqId;

    @Schema(description = "PO 일자", example = "2024-08-31")
    private String reqDate;

    @Schema(description = "법인 아이디", example = "101")
    private Integer compId;

    @Schema(description = "사업장 아이디", example = "202")
    private Integer bizId;

    @Schema(description = "PO 번호", example = "PO12345")
    private String poNo;

    @Schema(description = "PO 상태", example = "OPEN")
    private String status;

    @Schema(description = "납기 예정일", example = "2024-09-15")
    private String expDelivDate;

    @Schema(description = "공급사 아이디", example = "303")
    private Integer supplId;

    @Schema(description = "부가세 유형 코드", example = "VAT10")
    private String vatTypeCd;

    @Schema(description = "PO 유형 코드", example = "REGULAR")
    private String inbTypeCd;

    @Schema(description = "PO 구분 코드", example = "STANDARD")
    private String inbClassCd;

    @Schema(description = "메모", example = "특이사항 없음")
    private String memo;

    @Schema(description = "공급가", example = "100000.00")
    private BigDecimal supplyAmt;

    @Schema(description = "부가세", example = "10000.00")
    private BigDecimal vatAmt;

    @Schema(description = "합계", example = "110000.00")
    private BigDecimal totalAmt;

    @Schema(description = "PO 품목 리스트")
    private List<InboundReqItemRequest> child;
}
