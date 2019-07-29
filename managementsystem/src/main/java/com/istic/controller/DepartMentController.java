package com.istic.controller;

import com.istic.base.Result;
import com.istic.entity.vo.AddDepart;
import com.istic.entity.vo.AddRole;
import com.istic.entity.vo.UpdateDepart;
import com.istic.entity.vo.UpdateRole;
import com.istic.service.DepartMentService;
import com.istic.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hch on 2019/7/25.
 */
@RestController
@Api(tags = "部门相关接口")
public class DepartMentController {
    @Autowired
    DepartMentService departMentService;

    @PostMapping("/api/addDepart")
    @ApiOperation(value = "添加部门")
    public Result addDepart(@RequestBody @Validated AddDepart addDepart) {
        return departMentService.addDepart(addDepart);
    }

    @PutMapping("/api/updateDepart")
    @ApiOperation(value = "修改部门")
    public Result updateDepart(@RequestBody @Validated UpdateDepart updateDepart) {
        return departMentService.updateDepart(updateDepart);
    }

    @GetMapping("/api/selectDepartsByName")
    @ApiOperation(value = "查询部门列表")
    public Result selectDepartsByName(@RequestParam @Validated  String departName) {
        return departMentService.selectDepartsByName(departName);
    }


}
