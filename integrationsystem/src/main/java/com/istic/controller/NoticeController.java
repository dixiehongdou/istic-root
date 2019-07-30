package com.istic.controller;

import com.istic.base.Result;
import com.istic.service.NoticeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sunwy
 * @Date: 2019/7/30 15:43
 */
@RestController
@Api(tags = "通知公告接口")
public class NoticeController {
    @Autowired
    NoticeService noticeService;
    @GetMapping("/api/list")
    @ApiOperation(value = "通知公告列表")
    public Result getNoticeByCount(@RequestParam Integer count) {
        return noticeService.getNoticeByCount(count);
    }
    @GetMapping("/api/details")
    @ApiOperation(value = "通知详情")
    public Result getDetailsById(@RequestParam String id) {
        return noticeService.getDetailsById(id);
    }
}
