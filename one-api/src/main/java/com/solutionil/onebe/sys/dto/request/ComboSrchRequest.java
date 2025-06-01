package com.solutionil.onebe.sys.dto.request;

import com.solutionil.onebe.comm.dto.request.BaseSrchRequest;
import lombok.Data;

@Data
public class ComboSrchRequest extends BaseSrchRequest {

    private String param1;
    private String param2;
    private String param3;
    private String param4;
    private String param5;

    public ComboSrchRequest() {
        Integer compId = super.getCompId();
        System.out.println("compId = " + compId);
    }
    
}
