package com.solutionil.onebe.oub.dto.response;

import lombok.Data;

@Data
public class AutoAllocationDetailGrid {
    private Long outboundReqId;
    private String status;
    private String statusNm;
    private Integer custId;
    private String custNm;
    private Integer delivId;
    private String delivNm;
    private String memo;
}
