package com.istic.controller;

import com.istic.base.Result;
import com.istic.entity.vo.AddSysUserVo;
import com.istic.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sunwy
 * @Date: 2019/7/31 10:20
 */
@RestController
@Api(tags = "同步用户到OA接口")
public class SysUserController {
    @Autowired
    SysUserService sysUserService;
    @PostMapping("api/SysUser/oaUser")
    @ApiOperation(value = "同步OA用户")
    public Result syncOASysUser(@RequestBody @Validated AddSysUserVo addSysUserVo){
        return  sysUserService.syncOASysUser(addSysUserVo);
    }
}
