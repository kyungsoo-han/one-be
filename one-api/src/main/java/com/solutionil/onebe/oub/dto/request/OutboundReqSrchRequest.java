package com.solutionil.onebe.oub.dto.request;

import lombok.Data;

@Data
public class OutboundReqSrchRequest {
    private Integer bizId;
    private Long outboundReqId;
    private String fDate;
    private String tDate;
    private Integer custId;
    private String oubTypeCd;
    private String oubClassCd;
}
