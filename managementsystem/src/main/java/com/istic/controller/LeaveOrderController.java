package com.istic.controller;

import com.istic.base.Result;
import com.istic.entity.vo.AddDepart;
import com.istic.entity.vo.AddLeaveOrder;
import com.istic.service.DepartMentService;
import com.istic.service.LeaveOrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by hch on 2019/7/26.
 */
@RestController
@Api(tags = "请假相关接口")
public class LeaveOrderController {

    @Autowired
    LeaveOrderService leaveOrderService;

    @PostMapping("/api/addLeaveOrder")
    @ApiOperation(value = "申请假期")
    public Result addLeaveOrer(@RequestBody @Validated AddLeaveOrder addLeaveOrder) {
        return leaveOrderService.addLeaveOrder(addLeaveOrder);
    }

    @GetMapping("/api/iLeaveOrder")
    @ApiOperation(value = "我的请假")
    public Result iLeaveOrder(@RequestParam("operator") String operator, @RequestParam("type") String type
            , @RequestParam("startTime") Date startTime, @RequestParam("endTime") Date endTime
            , @RequestParam("status") Byte status) {
        return leaveOrderService.iLeaveOrder(operator, type, startTime, endTime, status);
    }

    @GetMapping("/api/leaveOrder")
    @ApiOperation(value = "请假详情")
    public Result leaveOrder(@RequestParam("id") Integer id) {
        return leaveOrderService.leaveOrder(id);
    }
}
