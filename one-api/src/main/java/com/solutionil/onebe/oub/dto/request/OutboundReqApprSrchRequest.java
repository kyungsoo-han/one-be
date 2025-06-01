package com.solutionil.onebe.oub.dto.request;

import lombok.Data;

@Data
public class OutboundReqApprSrchRequest {
    private Integer bizId;
    private String fDate;
    private String tDate;
    private Integer custId;
}
