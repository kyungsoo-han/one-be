package com.solutionil.onebe.oub.dto.request;

import com.solutionil.onebe.comm.dto.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AutoAllocationRequest extends BaseRequest {
    private Long autoAllocationId;
    private Integer bizId;
    private String status;
    private String memo;
}
