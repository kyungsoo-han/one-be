package com.solutionil.onebe.sys.dto.request;

import lombok.Data;

@Data
public class UpdateColumnWidthRequest {
    Integer columnId;
    Integer width;
}
