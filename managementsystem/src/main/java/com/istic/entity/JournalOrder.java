package com.istic.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2019/07/17
*/
@Table(name = "journal_order")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JournalOrder {
    @Id
    private Integer id;

    /**
     * 预订人Code
     */
    @Column(name = "reservation_usercode")
    private String reservationUsercode;

    /**
     * 预订人姓名
     */
    @Column(name = "reservation_username")
    private String reservationUsername;

    /**
     * 订单编号
     */
    @Column(name = "order_number")
    private String orderNumber;

    @Column(name = "start_time")
    private Date startTime;

    /**
     * 年费
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 部门
     */
    private String department;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 联系电话
     */
    @Column(name = "phone_number")
    private String phoneNumber;
}