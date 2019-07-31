package com.istic.controller;

import com.istic.base.Result;
import com.istic.service.RulesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sunwy
 * @Date: 2019/7/31 12:49
 */
@RestController
@Api(tags = "规章制度接口")
public class RulesController {

    @Autowired
    RulesService rulesService;

    @GetMapping("api/rules/list")
    @ApiOperation(value = "规章制度列表")
    public Result getRulesByCount(Integer count){
        return  rulesService.getRulesByCount(count);
    }
    @GetMapping("api/rules/details")
    @ApiOperation(value = "规章制度详情")
    public Result getRulesByCount(String id){
        return  rulesService.getRulesDetail(id);
    }
}
