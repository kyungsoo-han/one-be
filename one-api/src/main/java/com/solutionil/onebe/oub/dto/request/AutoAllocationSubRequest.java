package com.solutionil.onebe.oub.dto.request;

import com.solutionil.onebe.comm.dto.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AutoAllocationSubRequest extends BaseRequest {
    private Long autoAllocationId;
    private Long outboundReqId;
    private Integer custId;
    private Integer delivId;
}
