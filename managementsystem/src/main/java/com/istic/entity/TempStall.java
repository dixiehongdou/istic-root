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
@Table(name = "temp_stall")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TempStall {
    @Id
    @Column(name = "` id`")
    private Integer id;

    /**
     * 预定人code
     */
    @Column(name = "reservation_user_code")
    private String reservationUserCode;

    /**
     * 预定人姓名
     */
    @Column(name = "reservation_user_name")
    private String reservationUserName;

    /**
     * 联系电话
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 使用日期
     */
    @Column(name = "use_date")
    private Date useDate;

    /**
     * 使用时间 1 上午 2 下午  3 全天
     */
    @Column(name = "use_time")
    private Byte useTime;

    /**
     * 车牌号
     */
    @Column(name = "car_number")
    private String carNumber;

    /**
     * 备注
     */
    private String note;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 状态
     */
    private Byte status;
}