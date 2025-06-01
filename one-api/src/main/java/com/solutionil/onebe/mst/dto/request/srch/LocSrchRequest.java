package com.solutionil.onebe.mst.dto.request.srch;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class LocSrchRequest extends BaseSrchRequest {
    private Integer bizId;
    private Integer whId;
    private Integer zoneId;
    private String allocationYn;
    private String stageYn;

}
