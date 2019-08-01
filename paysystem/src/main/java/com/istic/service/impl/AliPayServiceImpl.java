package com.istic.service.impl;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.istic.config.AlipayConfig;
import com.istic.dao.AlipayOrderMapper;
import com.istic.entity.AlipayOrder;
import com.istic.entity.vo.PayByAli;
import com.istic.service.AliPayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: sunwy
 * @Date: 2019/8/1 16:33
 */
@Service
@Slf4j
public class AliPayServiceImpl implements AliPayService {
    public static final String TRADE_SUCCESS = "TRADE_SUCCESS"; //支付成功标识
    public static final String TRADE_CLOSED = "TRADE_CLOSED";//交易关闭
    @Autowired
    AlipayOrderMapper alipayOrderMapper;

    @Override
    public String pay(PayByAli payByAli) {
        return null;
    }

    /**
     * 添加支付宝支付流水过程
     *
     * @param code
     * @param msg
     * @param body
     * @param out_trade_no
     * @param subject
     * @param total_amount
     */
    private void addAlipayOrder(String code, String msg, String body, String out_trade_no, String subject,
                                String total_amount) {
        AlipayOrder alipayOrder = new AlipayOrder();
        alipayOrder.setCode(code);
        alipayOrder.setTimeExpress("2m");
        alipayOrder.setTotalAmount(total_amount);
        alipayOrder.setOutTradeNo(out_trade_no);
        alipayOrder.setSubject(subject);
        alipayOrder.setBody(body);
        alipayOrder.setMsg(msg);
        alipayOrderMapper.insert(alipayOrder);
    }

    @Override
    public void notify(HttpServletRequest request, HttpServletResponse response) {
        //接收参数进行校验
        Map<String, String> parameters = new HashMap<>();
        Map<String, String[]> requestParams = request.getParameterMap();
        for (Map.Entry<String, String[]> entry : requestParams.entrySet()) {
            String key = entry.getKey();
            String[] values = entry.getValue();
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            parameters.put(key, valueStr);
        }
        log.info("parameters is [parameters={}]", parameters);
        String appId = request.getParameter("app_id");//appid
        String merchantOrderNo = request.getParameter("out_trade_no");//商户订单号
        log.info("orderId: {}", merchantOrderNo);
        String payState = request.getParameter("trade_status");//交易状态
        String encodeOrderNum = null;
        addAlipayOrder("1005", "异步支付通知结果", request.getParameter("body"), merchantOrderNo, request.getParameter("subject"), request.getParameter("total_amount"));
        try {
            encodeOrderNum = URLDecoder.decode(request.getParameter("passback_params"), "UTF-8");
            log.info("encodeOrderNum is [encodeOrderNum={}]", encodeOrderNum);

            boolean signVerified;
            signVerified = AlipaySignature.rsaCheckV1(parameters, AlipayConfig.ALIPAY_PUBLIC_KEY, "UTF-8",
                    AlipayConfig.SIGNTYPE);
            //验证签名
            log.info("signVerified is [signVerified={}]", signVerified);
            if (signVerified) { //通过验证
                log.info("payState: {}", payState);
                if (payState.equals(TRADE_SUCCESS)) {
                    //判断订单号与插入的订单号是否一样
                    if (merchantOrderNo.equals(encodeOrderNum) == false || AlipayConfig.APPID.equals(appId) == false) {
                        log.info("vali failure");
                        addAlipayOrder("1006", "vali failure", request.getParameter("body"), merchantOrderNo, request.getParameter("subject"), request.getParameter("total_amount"));
                        response.getOutputStream().print("failure");
                        return;
                    }
                    addAlipayOrder("2000", "success", request.getParameter("body"), merchantOrderNo, request.getParameter("subject"), request.getParameter("total_amount"));
                    response.getOutputStream().print("success");
                    return;
                } else if (payState.equals(TRADE_CLOSED)) { //交易关闭

                    addAlipayOrder("4004", TRADE_CLOSED, request.getParameter("body"), merchantOrderNo, request.getParameter("subject"), request.getParameter("total_amount"));
                } else {
                    addAlipayOrder("5000", "failure", request.getParameter("body"), merchantOrderNo, request.getParameter("subject"), request.getParameter("total_amount"));
                    response.getOutputStream().print("failure");
                    return;
                }
            } else {
                //签名校验失败更状态
                addAlipayOrder("1007", "签名校验失败", request.getParameter("body"), merchantOrderNo, request.getParameter("subject"), request.getParameter("total_amount"));
                response.getOutputStream().print("sgin failure");
                return;
            }
            log.info("encodeOrderNum is  [encodeOrderNum={}]", encodeOrderNum);
            addAlipayOrder("1008", "failure", request.getParameter("body"), merchantOrderNo, request.getParameter("subject"), request.getParameter("total_amount"));
            response.getOutputStream().print("failure");
            return;
        } catch (AlipayApiException e) {
            log.error(e.getErrMsg());
            addAlipayOrder("5001", e.getMessage(), request.getParameter("body"), merchantOrderNo, request.getParameter(
                    "subject"), request.getParameter("total_amount"));
            throw new RuntimeException("调用支付宝接口发生异常");
        } catch (UnsupportedEncodingException e) {
            log.error(e.getMessage());
            addAlipayOrder("5002", e.getMessage(), request.getParameter("body"), merchantOrderNo, request.getParameter(
                    "subject"), request.getParameter("total_amount"));
            throw new RuntimeException("URLDecoderf发生异常");
        } catch (IOException e) {
            addAlipayOrder("5003", e.getMessage(), request.getParameter("body"), merchantOrderNo, request.getParameter(
                    "subject"), request.getParameter("total_amount"));
            log.error(e.getMessage());
            throw new RuntimeException("IO发生异常");
        }
    }

    @Override
    public String syncNotify(HttpServletRequest request) {
        Map<String, String> parameters = new HashMap<>();
        Map<String, String[]> requestParams = request.getParameterMap();
        log.info("支付宝同步参数", requestParams);
        for (Map.Entry<String, String[]> entry : requestParams.entrySet()) {
            String key = entry.getKey();
            String[] values = entry.getValue();
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i] : valueStr + values[i] + ",";
            }
            parameters.put(key, valueStr);
        }
        //记录日志
        String merchantOrderNo = request.getParameter("out_trade_no");//商户订单号
        addAlipayOrder("2001", "支付结果同步返回结果", request.getParameter("body"), merchantOrderNo, request.getParameter("subject"), request.getParameter("total_amount"));
        return "<html>\n" +
                "<head>\n" +
                "<script type=\"text/javascript\"> function load() { window.close(); } </script>\n" +
                "</head>\n" +
                "<body onload=\"" +
                "load()\"> </body>\n" +
                "</html>";
    }
}
