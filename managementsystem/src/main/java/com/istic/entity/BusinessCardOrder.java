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
@Table(name = "business_card_order")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BusinessCardOrder {
    @Id
    private Integer id;

    private String username;

    @Column(name = "username_en")
    private String usernameEn;

    /**
     * 职务
     */
    private String duty;

    /**
     * 职称
     */
    private String titles;

    /**
     * 其他（中文）
     */
    @Column(name = "other_cn")
    private String otherCn;

    /**
     * 其他（英文
     */
    @Column(name = "other_en")
    private String otherEn;

    /**
     * 电话号
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 手机号
     */
    @Column(name = "mobile_phone_number")
    private String mobilePhoneNumber;

    /**
     * 传真
     */
    private String faxes;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 单价
     */
    private Long price;

    /**
     * 预定盒数
     */
    private Integer amount;

    /**
     * 是否加急 0否 1是
     */
    @Column(name = "is_urgent")
    private Byte isUrgent;

    /**
     * 加急费
     */
    private Long cost;

    /**
     * 备注
     */
    private String remark;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 状态
     */
    private Byte status;
}