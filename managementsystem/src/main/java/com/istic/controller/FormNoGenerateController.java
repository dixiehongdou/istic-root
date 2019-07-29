package com.istic.controller;

import com.istic.constants.FormNoTypeEnum;
import com.istic.service.FormNoGenerateService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hch on 2019/7/29.
 */
@RestController
public class FormNoGenerateController {
    @Autowired
    FormNoGenerateService formNoGenerateService;

    @PostMapping("/api/formNoGenerate")
    @ApiOperation(value = "生成订单号")
    public String formNoGenerate(@RequestBody FormNoTypeEnum formNoTypeEnum) {
        return formNoGenerateService.generateFormNo(formNoTypeEnum);
    }
}
