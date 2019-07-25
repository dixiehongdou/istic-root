package com.istic.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2019/07/25
*/
@Table(name = "car_license_order")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CarLicenseOrder {
    @Id
    private Integer id;

    /**
     * 预定人code
     */
    @Column(name = "reservation_usercode")
    private String reservationUsercode;

    /**
     * 预定人姓名
     */
    @Column(name = "reservation_username")
    private String reservationUsername;

    /**
     * 联系电话
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 代办人code
     */
    @Column(name = "commission_usercode")
    private String commissionUsercode;

    @Column(name = "commission_username")
    private String commissionUsername;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "update_time")
    private Date updateTime;

    private Byte status;

    @Column(name = "order_number")
    private String orderNumber;
}