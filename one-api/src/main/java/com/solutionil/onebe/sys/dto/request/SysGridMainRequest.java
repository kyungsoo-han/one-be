package com.solutionil.onebe.sys.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseRequest;
import com.solutionil.onebe.sys.dto.entity.SysGridMain;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper=false)
@Data
@Schema(description = "시스템 그리드 정보를 나타내는 클래스")
public class SysGridMainRequest extends BaseRequest {
    private List<SysGridMain> child;
}
