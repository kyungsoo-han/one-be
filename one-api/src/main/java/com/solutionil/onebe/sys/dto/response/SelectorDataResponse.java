package com.solutionil.onebe.sys.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

public class SelectorDataResponse {

    @Data
    @AllArgsConstructor
    public static class Emp
    {
        @Schema(description = "사원ID")
        private Integer empId;

        @Schema(description = "사원번호")
        private String empNo;

        @Schema(description = "사원명")
        private String empNm;

        @Schema(description = "부서ID")
        private String deptId;

        @Schema(description = "부서명")
        private String deptNm;

        @Schema(description = "사업자 아이디", example = "1")
        private Integer bizId;

        @Schema(description = "사업자명", example = "오차테크")
        private String bizNm;

    }

    @Data
    @AllArgsConstructor
    public static class Comp
    {
        @Schema(description = "법인 아이디", example = "1")
        private Integer compId;

        @Schema(description = "법인 코드", example = "COMP001")
        private String compCd;
    
        @Schema(description = "법인명", example = "ABC Corp")
        private String compNm;
    
        @Schema(description = "대표자", example = "존스")
        private String ownerNm;


    }
    @Data
    @AllArgsConstructor
    public static class Biz
    {
        @Schema(description = "법인 아이디", example = "1")
        private Integer compId;

        @Schema(description = "법인명", example = "ABC Corp")
        private String compNm;

        @Schema(description = "사업자 아이디", example = "1")
        private Integer bizId;

        @Schema(description = "사업자 코드", example = "BIZ001")
        private String bizCd;

        @Schema(description = "사업자명", example = "오차테크")
        private String bizNm;

        @Schema(description = "사업자 번호", example = "123-45-67890")
        private String bizNo;

        @Schema(description = "대표자", example = "홍길동")
        private String ownerNm;

    }
    @Data
    public static class Dept {
        @Schema(description = "사업자 아이디", example = "1")
        private Integer bizId;
        @Schema(description = "사업자명", example = "오차테크")
        private String bizNm;
        @Schema(description = "부서ID", example = "1")
        private Integer deptId;
        @Schema(description = "부서코드", example = "1")
        private String  deptCd;
        @Schema(description = "부서명", example = "오차테크")
        private String deptNm;
    }

    @Data
    public static class Wh {
        @Schema(description = "사업자 아이디", example = "1")
        private Integer bizId;

        @Schema(description = "사업자명", example = "오차테크")
        private String bizNm;

        @Schema(description = "창고 아이디", example = "1")
        private Integer whId;

        @Schema(description = "창고 코드", example = "WH01")
        private String whCd;

        @Schema(description = "창고 명", example = "주창고")
        private String whNm;
    }

    @Data
    public static class Zone{

        @Schema(description = "사업자 아이디", example = "1")
        private Integer bizId;

        @Schema(description = "창고 아이디", example = "1")
        private Integer whId;

        @Schema(description = "창고 명", example = "WH1")
        private String whNm;

        @Schema(description = "존 아이디", example = "1")
        private Integer zoneId;

        @Schema(description = "존 코드", example = "Z01")
        private String zoneCd;

        @Schema(description = "존 명", example = "존 명")
        private String zoneNm;

        @Schema(description = "보관 타입", example = "냉장")
        private String storageType;

        @Schema(description = "존 타입", example = "일반")
        private String zoneType;

        @Schema(description = "스테이지 여부", example = "RCV/SHP/RTN")
        private String stageYn;


    }

    @Data
    public static class Loc {

        @Schema(description = "사업자 아이디", example = "1")
        private Integer bizId;

        @Schema(description = "창고 아이디", example = "1")
        private Integer whId;

        @Schema(description = "창고 명", example = "WH1")
        private String whNm;

        @Schema(description = "존 아이디", example = "1")
        private Integer zoneId;

        @Schema(description = "존 명", example = "존 명")
        private String zoneNm;

        @Schema(description = "로케이션 아이디", example = "1")
        private Integer locId;

        @Schema(description = "로케이션 코드", example = "A01-01-01")
        private String locCd;

        @Schema(description = "로케이션 명", example = "A01-01-01")
        private String locNm;

        @Schema(description = "보관 타입", example = "냉장")
        private String storageTypeNm;

        @Schema(description = "존 타입", example = "일반")
        private String zoneTypeNm;

        @Schema(description = "사용 여부", example = "Y")
        private String useYn;

        @Schema(description = "열", example = "10")
        private Integer axisX;

        @Schema(description = "행", example = "20")
        private Integer axisY;

        @Schema(description = "단", example = "30")
        private Integer axisZ;


    }
    @Data
    public static class Cust {
        @Schema(description = "거래처 아이디", example = "1")
        private Integer custId;

        @Schema(description = "거래처 코드", example = "CUST1001")
        private String custCd;

        @Schema(description = "거래처 명", example = "XYZ Corporation")
        private String custNm;

        @Schema(description = "업태", example = "Manufacturing")
        private String bizType;

        @Schema(description = "종목", example = "Electronics")
        private String bizItem;

        @Schema(description = "대표자", example = "Alice Johnson")
        private String ownerNm;
    }
    @Data
    public static class CustDeliv {
        @Schema(description = "거래처 아이디", example = "1")
        private Integer custId;

        @Schema(description = "거래처 명", example = "XYZ Corporation")
        private String custNm;

        @Schema(description = "배송지 아이디", example = "1")
        private Integer delivId;

        @Schema(description = "배송지 코드", example = "DELV1001")
        private String delivCd;

        @Schema(description = "배송지 명", example = "삼성점")
        private String delivNm;

    }
    @Data
    public static class Suppl {
        @Schema(description = "공급사 아이디", example = "1")
        private Integer supplId;

        @Schema(description = "공급사 코드", example = "SUPL1001")
        private String supplCd;

        @Schema(description = "공급사 명", example = "VBS Corporation")
        private String supplNm;

        @Schema(description = "업태", example = "Manufacturing")
        private String bizType;

        @Schema(description = "종목", example = "Electronics")
        private String bizItem;

        @Schema(description = "대표자", example = "Alice Johnson")
        private String ownerNm;
    }

    @Data
    public static class Item{
        @Schema(description = "품목 아이디", example = "1")
        private Integer itemId;

        @Schema(description = "품목 코드", example = "ITEM001")
        private String itemCd;

        @Schema(description = "품목 명", example = "상품명")
        private String itemNm;

        @Schema(description = "품목 타입", example = "TYPE01")
        private String itemTypeNm;

        @Schema(description = "규격", example = "50x50cm")
        private String standard;

        @Schema(description = "단위", example = "UNIT01")
        private String itemUnitNm;

        @Schema(description = "팔레트 입수량", example = "10")
        private Integer palletUnitQty;

        @Schema(description = "박스 입수량", example = "10")
        private Integer boxUnitQty;

        @Schema(description = "케이스 입수량", example = "10")
        private Integer caseUnitQty;
    }

    @Data
    public static class Menu {

        @Schema(description = "메뉴 ID", example = "1")
        private Integer menuId;

        @Schema(description = "상위 코드", example = "0")
        private Integer parentId;

        @Schema(description = "메뉴명", example = "대시보드")
        private String menuNm;

        @Schema(description = "메뉴 레벨", example = "1")
        private Integer menuLvl;

        @Schema(description = "메뉴 경로", example = "/dashboard")
        private String menuPath;

        @Schema(description = "메뉴 권한", example = "ADMIN")
        private String menuAuth;

        @Schema(description = "하위 메뉴 여부", example = "N")
        private String getChild;

        @Schema(description = "순서", example = "1")
        private Integer seq;

        @Schema(description = "메인 여부", example = "N")
        private String mainYn;

        @Schema(description = "사용 여부", example = "Y")
        private String useYn;

        @Schema(description = "화면 ID", example = "SCREEN_01")
        private String classId;
    }

}