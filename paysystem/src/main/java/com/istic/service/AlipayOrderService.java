package com.istic.service;

import com.istic.entity.AlipayOrder;

/**
 * @Author: sunwy
 * @Date: 2019/8/1 9:59
 */
public interface AlipayOrderService {
    /**
     * 添加支付宝订单信息
     * @param alipayOrder
     */
    void addAlipayOrder(AlipayOrder alipayOrder);
}
