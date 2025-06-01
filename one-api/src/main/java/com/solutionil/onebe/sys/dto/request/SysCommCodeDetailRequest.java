package com.solutionil.onebe.sys.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseRequest;
import com.solutionil.onebe.sys.dto.SysCommCodeDetail;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
@Schema(description = "공통 코드 정보를 나타내는 클래스")
public class SysCommCodeDetailRequest extends BaseRequest {

    @Schema(description = "공통코드 구분", example = "CATEGORY")
    private String commGbn;

    List<SysCommCodeDetail> child;

}
