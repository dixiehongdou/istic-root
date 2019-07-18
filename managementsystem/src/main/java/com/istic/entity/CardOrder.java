package com.istic.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2019/07/18
*/
@Table(name = "card_order")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardOrder {
    @Id
    private Integer id;

    /**
     * 单据类型 1补卡 2销卡 3卡挂失
     */
    @Column(name = "order_type")
    private Byte orderType;

    /**
     * 申请开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 申请截止时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 订单状态 1代受理  2已受理 3已完成 4未提交
     */
    private Byte status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "order_number")
    private String orderNumber;

    /**
     * 申请人code
     */
    @Column(name = "apply_usercode")
    private String applyUsercode;

    @Column(name = "apply_username")
    private String applyUsername;

    /**
     * 销卡/补卡原因
     */
    private String reason;

    /**
     * 照片地址
     */
    @Column(name = "picture_url")
    private String pictureUrl;
}