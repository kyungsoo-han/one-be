package com.solutionil.onebe.inb.dto.request;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class PutawaySrchRequest extends BaseSrchRequest {
    private Long inboundId;
    private String fDate;
    private String tDate;
    private Integer supplId;
}
