package com.solutionil.onebe.comm.dto.request;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class BaseRequest {

    @Schema(description = "법인 아이디", example = "1")
    private Integer compId;

    @Schema(description = "user Id", example = "userId")
    private String userId;

    @JsonIgnore
    public String getUserId() {
        return this.userId;  // Return the actual field instead of calling the method
    }

    @JsonProperty
    public void setUserId(String userId) {
        this.userId = userId;  // Set the actual field instead of calling the method
    }
}
