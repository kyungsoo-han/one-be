package com.solutionil.onebe.mst.controller;

import com.solutionil.onebe.comm.dto.response.BaseResponse;
import com.solutionil.onebe.mst.dto.request.CompRequest;
import com.solutionil.onebe.mst.dto.request.srch.CompSrchRequest;
import com.solutionil.onebe.mst.service.CompService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/comp")
public class CompController {

    private final CompService compService;

    @PostMapping
    public ResponseEntity insertComp(@RequestBody CompRequest request){
        log.info("request ={}", request );
        compService.saveComp(request);
        return ResponseEntity.ok(BaseResponse.success(request));
    }

    @DeleteMapping("/{compCd}")
    public ResponseEntity deleteComp(@PathVariable String compCd){
        compService.deleteComp(compCd);
        return ResponseEntity.ok(BaseResponse.success());
    }

    @GetMapping("/detail")
    public ResponseEntity findCompById(@RequestParam String compCd){
        return ResponseEntity.ok(BaseResponse.success(compService.findCompById(compCd)));
    }

    @GetMapping("/list")
    public ResponseEntity findComps(CompSrchRequest request){
        log.info("request ={}", request);
        return ResponseEntity.ok(BaseResponse.success(compService.findComps(request)));
    }
}
