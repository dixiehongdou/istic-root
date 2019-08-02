package com.istic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.yangyuan.pay.core.annotation.PayManagerComponent;
import org.yangyuan.pay.core.common.AbstractPayAdaptor;
import org.yangyuan.pay.core.common.AbstractPayManager;

/**
 * @Author: sunwy
 * @Date: 2019/8/2 19:06
 */
@PayManagerComponent
public class GoodsTradeManager extends AbstractPayManager {

    @Autowired
    private GoodsTradeService goodsTradeService;

    @Override
    public String getTradeType() {
        return "0";
    }

    @Override
    public AbstractPayAdaptor getPayAdaptor() {
        return goodsTradeService;
    }
}