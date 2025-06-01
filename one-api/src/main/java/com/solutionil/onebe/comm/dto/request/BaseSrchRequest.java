package com.solutionil.onebe.comm.dto.request;

import lombok.Data;

@Data
public class BaseSrchRequest {
    private Integer compId;
    private Integer bizId;
    private String fDate;
    private String tDate;
    private String name;
    private String code;

}
