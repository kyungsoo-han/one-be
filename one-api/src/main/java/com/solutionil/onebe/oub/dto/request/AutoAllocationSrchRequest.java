package com.solutionil.onebe.oub.dto.request;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AutoAllocationSrchRequest extends BaseSrchRequest {

    //private Integer autoAllocationId;
    private Integer custId;

}
