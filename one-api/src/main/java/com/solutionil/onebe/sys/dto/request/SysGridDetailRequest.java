package com.solutionil.onebe.sys.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseRequest;
import com.solutionil.onebe.sys.dto.entity.SysGridDetail;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
@Schema(description = "시스템 그리드 정보를 나타내는 클래스")
public class SysGridDetailRequest extends BaseRequest {

    @Schema(description = "메뉴 ID", example = "1")
    private Integer menuId;

    @Schema(description = "그리드컨트롤 이름", example = "GridControlName")
    private String gridNm;

    private List<SysGridDetail> child;

}
