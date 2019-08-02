package com.istic.controller;

import com.alibaba.fastjson.JSON;
import com.istic.entity.vo.PayInfo;
import com.istic.service.GoodsTradeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.yangyuan.pay.bean.TradeStatus;
import org.yangyuan.pay.bean.WxPayNoticeInfo;
import org.yangyuan.pay.core.NoticeManagers;
import org.yangyuan.pay.core.PayManagers;
import org.yangyuan.pay.core.common.AbstractPayManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @Author: sunwy
 * @Date: 2019/8/2 19:12
 */
@RestController
@Api(tags = "微信支付")
@Slf4j
public class WxPayController {
    @Autowired
    GoodsTradeService goodsTradeService;

    @PostMapping("/api/wxPay")
    @ApiOperation(value = "微信支付")
    public String pay(@RequestBody @Validated PayInfo payInfo) {
        log.info("发起微信支付：" + JSON.toJSONString(payInfo));
        String result = goodsTradeService.pay(payInfo);
        log.info("发起微信支付结果："+result);
        return  result;

    }
    @PostMapping(value = "/notify")
    @ApiOperation(value = "微信支付异步回调")
    public void notify(HttpServletRequest request, HttpServletResponse response){
    /*
        解析请求参数
     */
        Map<String, String> params = NoticeManagers.getDefaultManager().receiveWxParams(request);

    /*
        封装
     */
        WxPayNoticeInfo info = new WxPayNoticeInfo();
        TradeStatus status = NoticeManagers.getDefaultManager().execute(params, info);

        log.info("微信支付异步回调地址："+ JSON.toJSONString(info));
    /*
        持久化回调数据
     */
        //TODO: 强烈建议将WxPayNoticeInfo持久化到数据库中，以备不时之需，当然你也可以忽略

    /*
        业务分发
     */
        AbstractPayManager payManager = (AbstractPayManager) PayManagers.find(status.getTradeNo());
        payManager.doTradeStatus(status);

    /*
        响应
     */
        NoticeManagers.getDefaultManager().sendWxResponse(response);
    }
}
