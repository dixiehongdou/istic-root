package com.istic.controller;

import com.istic.base.Result;
import com.istic.entity.vo.AddUser;
import com.istic.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hch on 2019/7/17.
 */
@RestController
@Api(tags = "user相关接口")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/api/addUser")
    @ApiOperation(value = "添加员工")
    public Result addUser(@RequestBody @Validated AddUser addUser) {
        return userService.addUser(addUser);
    }

}
