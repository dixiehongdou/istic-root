package com.istic.controller;

import com.istic.base.Result;
import com.istic.service.DownloadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: sunwy
 * @Date: 2019/7/31 9:26
 */
@RestController
@Api(tags = "常用下载接口")
public class DownloadController {

    @Autowired
    DownloadService downloadService;

    @GetMapping("api/download/list")
    @ApiOperation(value = "下载")
    public Result getDownloadList(Integer count){
        return  downloadService.getDownloadList(count);
    }
}
