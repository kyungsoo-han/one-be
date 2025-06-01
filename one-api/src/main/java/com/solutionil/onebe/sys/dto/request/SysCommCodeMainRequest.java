package com.solutionil.onebe.sys.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseRequest;
import com.solutionil.onebe.sys.dto.SysCommCodeMain;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
@Schema(description = "공통 코드 정보를 나타내는 클래스")
public class SysCommCodeMainRequest extends BaseRequest {

    List<SysCommCodeMain> child;


}
