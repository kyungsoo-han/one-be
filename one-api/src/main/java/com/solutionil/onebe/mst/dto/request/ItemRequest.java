package com.solutionil.onebe.mst.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;


@EqualsAndHashCode(callSuper=false)
@Data
@Schema(description = "품목 정보를 나타내는 DTO")
public class ItemRequest extends BaseRequest {

    @Schema(description = "품목 아이디", example = "1")
    private Integer itemId;

    @Schema(description = "품목 코드", example = "ITEM001")
    private String itemCd;

    @Schema(description = "품목 명", example = "상품명")
    private String itemNm;

    @Schema(description = "약식 명칭", example = "약식명")
    private String itemSnm;

    @Schema(description = "영문 명칭", example = "English Name")
    private String itemEnm;

    @Schema(description = "사용 여부", example = "Y")
    private String useYn;

    @Schema(description = "규격", example = "50x50cm")
    private String standard;

    @Schema(description = "단위 코드", example = "UNIT01")
    private String itemUnitCd;

    @Schema(description = "품목 타입", example = "TYPE01")
    private String itemTypeCd;

    @Schema(description = "세트 여부", example = "N")
    private String setYn;

    @Schema(description = "주 거래처", example = "1")
    private Long custId;

    @Schema(description = "바코드", example = "1234567890123")
    private String barcode;

    @Schema(description = "박스 바코드", example = "9876543210987")
    private String boxBarcode;

    @Schema(description = "팔레트 바코드", example = "4567890123456")
    private String palletBarcode;

    @Schema(description = "케이스 입수량", example = "10")
    private Integer caseUnitQty;

    @Schema(description = "박스 입수량", example = "10")
    private Integer boxUnitQty;

    @Schema(description = "팔레트 입수량", example = "100")
    private Integer palletUnitQty;

    @Schema(description = "최소발주수량", example = "100")
    private Integer moq;

    @Schema(description = "카테고리 대분류", example = "CAT01")
    private String categoryLv1;

    @Schema(description = "카테고리 중분류", example = "CAT02")
    private String categoryLv2;

    @Schema(description = "카테고리 소분류", example = "CAT03")
    private String categoryLv3;

    @Schema(description = "검사 여부", example = "Y")
    private String inspectYn;

    @Schema(description = "안전재고수량", example = "50")
    private Integer safeStockQty;

    @Schema(description = "보관 타입", example = "STORAGE01")
    private String storageTypeCd;

    @Schema(description = "가로", example = "100.0")
    private BigDecimal width;

    @Schema(description = "세로", example = "50.0")
    private BigDecimal depth;

    @Schema(description = "높이", example = "150.0")
    private BigDecimal height;

    @Schema(description = "중량(kg)", example = "2.5")
    private BigDecimal weight;

    @Schema(description = "메모", example = "비고 사항")
    private String memo;

}
