package com.istic.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2019/08/01
*/
@Table(name = "leave_order_status")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LeaveOrderStatus {
    @Id
    private Integer id;

    /**
     * 请假订单id
     */
    @Column(name = "leave_order_id")
    private Integer leaveOrderId;

    /**
     * 审批状态  0 待审批 1审批通过  2已撤回  3 审批未通过 4已退回
     */
    private Byte status;

    private String username;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;
}