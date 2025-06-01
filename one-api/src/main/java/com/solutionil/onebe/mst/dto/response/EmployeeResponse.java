package com.solutionil.onebe.mst.dto.response;

import com.solutionil.onebe.comm.dto.request.BaseRequest;
import com.solutionil.onebe.comm.dto.response.BaseResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "사원 정보 DTO")
public class EmployeeResponse {
    @Schema(description = "사원ID")
    private Integer empId;

    @Schema(description = "사업장ID")
    private Integer bizId;

    @Schema(description = "사원번호")
    private String empNo;

    @Schema(description = "사원명")
    private String empNm;

    @Schema(description = "사원명(영문)")
    private String empEnm;

    @Schema(description = "사원명(한자)")
    private String empCnm;

    @Schema(description = "부서ID")
    private Integer deptId;

    @Schema(description = "부서명")
    private String deptNm;
    
    @Schema(description = "성별")
    private String gender;

    @Schema(description = "주민번호")
    private String empRegiNo;

    @Schema(description = "생일")
    private String birthDate;

    @Schema(description = "국가")
    private String nation;

    @Schema(description = "근무 상태")
    private String workingState;

    @Schema(description = "채용구분")
    private String hireGbn;

    @Schema(description = "직종")
    private String jobKind;

    @Schema(description = "고용형태")
    private String employmentType;

    @Schema(description = "급여유형")
    private String salaryType;

    @Schema(description = "직위")
    private String jobPosition;

    @Schema(description = "직책")
    private String jobDuty;

    @Schema(description = "직급")
    private String jobRank;

    @Schema(description = "입사일자")
    private String enterDate;

    @Schema(description = "수습시작일")
    private String probationFdate;

    @Schema(description = "수습종료일")
    private String probationTdate;

    @Schema(description = "퇴사일자")
    private String resignDate;

    @Schema(description = "퇴직사유")
    private String resignReason;

    @Schema(description = "퇴직상세사유")
    private String resignReasonRemark;

    @Schema(description = "이메일")
    private String email;

    @Schema(description = "핸드폰")
    private String phoneNo;

    @Schema(description = "전화번호")
    private String telNo;

    @Schema(description = "취미")
    private String hobby;

    @Schema(description = "특기")
    private String ability;

    @Schema(description = "종교")
    private String religion;

    @Schema(description = "결혼여부")
    private String marryYn;

    @Schema(description = "결혼일")
    private String marryDate;

    @Schema(description = "긴급연락처")
    private String urgentContact;

    @Schema(description = "자동차번호")
    private String carNo;

    @Schema(description = "자동차모델")
    private String carModel;

    @Schema(description = "연료구분")
    private String carOil;

    @Schema(description = "우편번호")
    private String zipNo;

    @Schema(description = "주소")
    private String zipAddr1;

    @Schema(description = "상세주소")
    private String zipAddr2;

    @Schema(description = "영문주소")
    private String zipAddrEng;

    @Schema(description = "메모")
    private String memo;

    @Schema(description = "병역특례여부")
    private String militaryExceptYn;

    @Schema(description = "장애여부")
    private String disability;

    @Schema(description = "키")
    private Double height;

    @Schema(description = "체중")
    private Double weight;

    @Schema(description = "발사이즈")
    private Integer footSize;

    @Schema(description = "좌측시력")
    private Double sightLeft;

    @Schema(description = "우측시력")
    private Double sightRight;

    @Schema(description = "혈액형")
    private String bloodType;

    @Schema(description = "혈액형 RH")
    private String bloodRh;

    @Schema(description = "군 복무 상태")
    private String militaryState;

    @Schema(description = "군별")
    private String militaryType;

    @Schema(description = "계급")
    private String militaryRank;

    @Schema(description = "병과")
    private String militarySpecialty;

    @Schema(description = "군번")
    private String militaryNo;

    @Schema(description = "제대 구분")
    private String dischargeGbn;

    @Schema(description = "군복무 시작일")
    private String militaryFdate;

    @Schema(description = "군복무 종료일")
    private String militaryTdate;

    @Schema(description = "면제사유")
    private String militaryExceptReason;

    @Schema(description = "장애구분")
    private String disabilityGbn;

    @Schema(description = "장애등급")
    private String disabilityLevel;

}