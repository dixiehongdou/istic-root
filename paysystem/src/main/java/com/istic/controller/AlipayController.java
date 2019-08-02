package com.istic.controller;

import com.istic.entity.vo.PayByAli;
import com.istic.service.AliPayService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: sunwy
 * @Date: 2019/7/26 14:25
 */
@RestController
public class AliPayController {

    @Autowired
    AliPayService alipayService;

    @PostMapping("/api/aliPay")
    @ApiOperation(value = "支付宝支付")
    public String Pay(@RequestBody @Validated PayByAli payByAli){
        System.out.println(payByAli);
        return alipayService.pay(payByAli);
    }
    //2.a1lipay支持同步返回地址
    @ApiOperation("同步")
    @RequestMapping(value = "/api/notify_sync",method = RequestMethod.GET)
    public String alipayNotify(HttpServletRequest request) {
        return alipayService.syncNotify(request);
    }

    //3.alipay异步通知调用地址
    @ApiOperation("异步通知")
    @RequestMapping(value = "/api/notify_async",method = RequestMethod.POST)
    public void alipayNotify(HttpServletRequest request, HttpServletResponse response){
        alipayService.notify(request,response);
    }
}
