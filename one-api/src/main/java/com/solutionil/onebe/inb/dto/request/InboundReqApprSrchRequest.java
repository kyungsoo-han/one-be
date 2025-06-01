package com.solutionil.onebe.inb.dto.request;

import lombok.Data;

@Data
public class InboundReqApprSrchRequest {
    private Integer bizId;
    private String fDate;
    private String tDate;
    private Integer supplId;
}
