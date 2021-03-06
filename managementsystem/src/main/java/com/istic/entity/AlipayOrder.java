package com.istic.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2019/07/29
*/
@Table(name = "alipay_order")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlipayOrder {
    @Id
    private Integer id;

    @Column(name = "out_trade_no")
    private String outTradeNo;

    private String subject;

    private String body;

    @Column(name = "total_amount")
    private String totalAmount;

    @Column(name = "time_express")
    private String timeExpress;

    @Column(name = "product_code")
    private String productCode;
    @Column(name = "code")
    private String code;
    @Column(name = "msg")
    private String msg;

    @Column(name = "userCode")
    private String usercode;

    private Date dt;
}