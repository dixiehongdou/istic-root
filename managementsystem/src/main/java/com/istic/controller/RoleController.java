package com.istic.controller;

import com.istic.base.Result;
import com.istic.entity.vo.AddRole;
import com.istic.entity.vo.AddUser;
import com.istic.entity.vo.UpdateRole;
import com.istic.service.RoleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hch on 2019/7/25.
 */
@RestController
public class RoleController {
    @Autowired
    RoleService roleService;

    @PostMapping("/api/addRole")
    @ApiOperation(value = "添加角色")
    public Result addRole(@RequestBody @Validated AddRole addRole) {
        return roleService.addRole(addRole);
    }

    @PutMapping("/api/updateRole")
    @ApiOperation(value = "修改角色")
    public Result updateRole(@RequestBody @Validated UpdateRole updateRole) {
        return roleService.updateRole(updateRole);
    }

    @GetMapping("/api/selectRolesByName")
    @ApiOperation(value = "修改角色")
    public Result selectRolesByName(@RequestParam String roleName) {
        return roleService.selectRolesByName(roleName);
    }


}
