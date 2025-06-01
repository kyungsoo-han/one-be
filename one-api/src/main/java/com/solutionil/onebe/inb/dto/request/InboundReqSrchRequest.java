package com.solutionil.onebe.inb.dto.request;

import lombok.Data;

@Data
public class InboundReqSrchRequest {
    private Integer bizId;
    private Long inboundReqId;
    private String fDate;
    private String tDate;
    private Integer supplId;
    private String inbTypeCd;
    private String inbClassCd;
}
