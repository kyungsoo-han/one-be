package com.solutionil.onebe.sys.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseRequest;
import com.solutionil.onebe.sys.dto.response.SysSelectorDetailGrid;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
@Schema(description = "t_sys_selector_m 테이블의 데이터를 나타내는 클래스")
public class SysSelectorDetailRequest extends BaseRequest {

    @Schema(description = "룩업 구분", example = "CATEGORY")
    private String selectorGbn;

    List<SysSelectorDetailGrid> child;

}
