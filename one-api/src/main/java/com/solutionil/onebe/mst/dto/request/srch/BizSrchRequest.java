package com.solutionil.onebe.mst.dto.request.srch;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class BizSrchRequest extends BaseSrchRequest {
    private Integer compId;
    private String bizNm;
    private String ownerNm;

}
