package com.istic.controller;

import com.istic.base.Result;
import com.istic.entity.vo.AddHolidayType;
import com.istic.entity.vo.AddLeaveOrder;
import com.istic.entity.vo.EnableHoloday;
import com.istic.service.HolidayTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * Created by hch on 2019/7/29.
 */
@RestController
@Api(tags = "假期类型维护")
public class HolidayTypeController {
    @Autowired
    HolidayTypeService holidayTypeService;


    @PostMapping("/api/addHolidayType")
    @ApiOperation(value = "添加假期类型")
    public Result addHolidayType(@RequestBody @Validated AddHolidayType addHolidayType) {
        return holidayTypeService.addHolidayType(addHolidayType);
    }

    @PutMapping("/api/enableOrDisable")
    @ApiOperation(value = "启用禁用假期类型")
    public Result enableOrDisable(@RequestBody @Validated EnableHoloday enableHoloday) {
        return holidayTypeService.enableOrDisable(enableHoloday);
    }


    @GetMapping("/api/holidayTypeList")
    @ApiOperation(value = "所有假期列表")
    public Result holidayTypeList() {
        return holidayTypeService.holidayTypeList();
    }

    @GetMapping("/api/enableHolidayTypeList")
    @ApiOperation(value = "启用的假期列表")
    public Result enableHolidayTypeList() {
        return holidayTypeService.enableHolidayTypeList();
    }
}
