package com.istic.service;

import com.istic.entity.vo.PayByAli;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: sunwy
 * @Date: 2019/8/1 16:25
 */
public interface AliPayService {

    /**
     * 支付
     * @param payByAli
     * @return
     */
    String pay(PayByAli payByAli);

    /**
     * 支付结果异步通知
     * @param request
     * @param response
     */
    void notify(HttpServletRequest request, HttpServletResponse response);

    /**
     * 支付结果同步通知结果
     * @param request
     * @return
     */
    String syncNotify(HttpServletRequest request);
}
