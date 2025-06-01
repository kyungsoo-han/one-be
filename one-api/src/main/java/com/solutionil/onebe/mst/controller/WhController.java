package com.solutionil.onebe.mst.controller;

import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.mst.dto.request.WhRequest;
import com.solutionil.onebe.mst.service.WhService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/wh")
public class WhController {

    private final WhService whService;

    @PostMapping
    public ResponseEntity insertWh(@RequestBody WhRequest request) {
        log.info("request = {}", request);
        whService.insertWh(request);
        return ResponseEntity.ok(BaseResponse.success());
    }


    @DeleteMapping("/{whId}")
    public ResponseEntity deleteWh(@PathVariable Integer whId) {
        whService.deleteWh(whId);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @GetMapping("/list")
    public ResponseEntity findWhs(@RequestParam(required = true) Integer compId,@RequestParam(required = true) Integer bizId,
                                              @RequestParam(required = false) String whCd, @RequestParam(required = false) String whNm) {
        return ResponseEntity.ok(BaseResponse.success(whService.findWhs(compId, bizId, whCd, whNm)));
    }
}
