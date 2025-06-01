package com.solutionil.onebe.sys.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseRequest;
import com.solutionil.onebe.sys.dto.entity.SysSelectorMain;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper=false)
@Data
@Schema(description = "t_sys_selector_m 테이블의 데이터를 나타내는 클래스")
public class SysSelectorMainRequest extends BaseRequest {

    List<SysSelectorMain> child;


}
