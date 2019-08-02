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
import org.yangyuan.pay.bean.AliPayNoticeInfo;
import org.yangyuan.pay.bean.TradeStatus;
import org.yangyuan.pay.core.NoticeManagers;
import org.yangyuan.pay.core.PayManagers;
import org.yangyuan.pay.core.common.AbstractPayManager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @Author: sunwy
 * @Date: 2019/8/2 17:19
 */
@RestController
@Api(tags = "支付宝支付")
@Slf4j
public class AliPayController {

    @Autowired
    GoodsTradeService goodsTradeService;


    @PostMapping("/api/aliPay")
    @ApiOperation(value = "支付宝支付")
    public String pay(@RequestBody @Validated PayInfo payInfo) {
        log.info("发起支付宝支付：" + JSON.toJSONString(payInfo));
        String result = goodsTradeService.pay(payInfo);
        log.info("发起支付宝支付结果：" + result);
        return result;

    }

    @PostMapping(value = "/notify")
    @ApiOperation("异步通知")
    public void notify(HttpServletRequest request, HttpServletResponse response) {
    /*
        解析请求参数
     */
        Map<String, String> params = NoticeManagers.getDefaultManager().receiveAliParams(request);

    /*
        封装
     */
        AliPayNoticeInfo info = new AliPayNoticeInfo();
        TradeStatus status = NoticeManagers.getDefaultManager().execute(params, info);
        log.info("微信支付异步回调地址：" + JSON.toJSONString(info));
    /*
        持久化回调数据
     */
        //TODO: 强烈建议将AliPayNoticeInfo持久化到数据库中，以备不时之需，当然你也可以忽略

    /*
        业务分发
     */
        AbstractPayManager payManager = (AbstractPayManager) PayManagers.find(status.getTradeNo());
        payManager.doTradeStatus(status);

    /*
        响应
     */
        NoticeManagers.getDefaultManager().sendAliResponse(response);
    }
}
