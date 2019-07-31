package com.istic.controller;

import com.istic.base.Result;
import com.istic.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sunwy
 * @Date: 2019/7/31 16:21
 */
@RestController
@Api(tags = "同步用户到OA接口")
public class SSOController {

    @Autowired
    SysUserService sysUserService;

    @GetMapping("api/sso/login")
    @ApiOperation(value = "获取单点登录URL")
    public Result getSSOLoginUrl(String uid,String to){
return  sysUserService.getSSOLoginUrl(uid,to);
    }
}
