package com.istic.service;

import com.istic.entity.vo.PayInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yangyuan.pay.bean.AliTrade;
import org.yangyuan.pay.bean.common.Trade;
import org.yangyuan.pay.bean.common.TradeToken;
import org.yangyuan.pay.core.common.AbstractPayAdaptor;

/**
 * @Author: sunwy
 * @Date: 2019/8/2 19:05
 */
@Service
public class GoodsTradeService extends AbstractPayAdaptor {

    @Autowired
    private GoodsTradeManager goodsTradeManager;

    /**
     * 支付
     * @param payByAli 商品id
     * @return
     */
    public String pay(PayInfo payByAli){
        Trade trade = AliTrade
                .qrcodePay()
                .subject(payByAli.getSubject())
                .body(payByAli.getBody())
                .outTradeNo(goodsTradeManager.newTradeNo(payByAli.getUserCode()))
                .totalAmount(payByAli.getTotal_amount())
                .build();
        TradeToken<String> token = goodsTradeManager.qrcodePay(trade);
        String url = token.value();
        return  url;
    }


    @Override
    public void doPaySuccess(String outTradeNo) {
        //支付成功，这里一般要更新数据库的状态
    }

    @Override
    public void doPayFail(String outTradeNo) {
        //支付失败，这里一般要更新数据库的状态
    }

    @Override
    public void doRefundSuccess(String outTradeNo) {
        //退款成功，这里一般要更新数据库的状态
    }

    @Override
    public void doRefundFail(String outTradeNo) {
        //退款失败，这里一般要更新数据库的状态
    }
}
