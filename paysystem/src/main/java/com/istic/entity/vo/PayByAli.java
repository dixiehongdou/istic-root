package com.istic.entity.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author: sunwy
 * @Date: 2019/7/26 13:54
 * 第三方对接接口参数
 */
@Data
@ApiModel(value = "支付宝支付")
public class PayByAli {

    @NotNull(message = "商户订单号不能为空")
    @ApiModelProperty(value = "商户订单号")
    private String out_trade_no;

    @NotNull(message = "订单名称不能为空")
    @ApiModelProperty(value = "订单名称")
    private String subject;

    @NotNull(message = "付款金额不能为空")
    @ApiModelProperty(value = "付款金额")
    private String total_amount;

    @ApiModelProperty(value = "商品描述")
    private String body;

    @NotNull(message = "销售产品码不能为空")
    @ApiModelProperty(value = "销售产品码")
    private String product_code = "充值";

    @NotNull(message = "用户编号不能为空")
    @ApiModelProperty(value = "用户编号")
    private  String userCode;
}
