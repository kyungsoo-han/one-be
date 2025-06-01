package com.solutionil.onebe.oub.dto.request;


import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
@Schema(description = "출고요청 상태를 승인으로 변경하는 클래스")
public class OutboundReqApprRequest extends BaseRequest {

    private List<outboundReqId> outboundReqIds;

    @Data
    private static class outboundReqId{
        Long outboundReqId;
        String apprMemo;
    }
}
