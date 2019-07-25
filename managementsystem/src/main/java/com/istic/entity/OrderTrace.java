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
@Table(name = "order_trace")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderTrace {
    @Id
    private Integer id;

    /**
     * 操作人
     */
    private String operator;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 操作结果
     */
    private String result;

    /**
     * 处理意见
     */
    private String idea;

    /**
     * 订单号
     */
    @Column(name = "order_id")
    private Integer orderId;
}