package com.solutionil.onebe.mst.dto.request;

import io.swagger.v3.oas.annotations.media.Schema;
import com.solutionil.onebe.comm.dto.request.BaseRequest;
import com.solutionil.onebe.mst.dto.entity.Wh;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper=false)
@Schema(description = "창고 정보를 나타내는 클래스")
public class WhRequest extends BaseRequest {
    Integer bizId;
    List<Wh> child;
}
