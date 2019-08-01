package com.istic.controller;

import com.istic.base.Result;
import com.istic.entity.vo.AddSysUserVo;
import com.istic.entity.vo.UpdateSysUserVo;
import com.istic.service.SysUserService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
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
@Api(tags = "OA系统用户操作接口")
public class OAUserController {

    @Autowired
    SysUserService sysUserService;

    @PostMapping("api/oaUser/add")
    @ApiOperation(value = "同步OA用户")
    public Result addOASysUser(@RequestBody @Validated AddSysUserVo addSysUserVo) {
        return sysUserService.addOASysUser(addSysUserVo);
    }

    @PostMapping("api/oaUser/status")
    @ApiOperation(value = "同步OA用户")
    public Result updateOAUserStatus(UpdateSysUserVo updateSysUserVo) {
        return  sysUserService.updateOASysUserStatus(updateSysUserVo);
    }
}
