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
@Table(name = "go_out_apply")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GoOutApply {
    @Id
    private Integer id;

    /**
     * 员工Code
     */
    @Column(name = "apply_usercode")
    private String applyUsercode;

    @Column(name = "apply_username")
    private String applyUsername;

    /**
     * 部门id
     */
    @Column(name = "department_id")
    private Integer departmentId;

    /**
     * 外出开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 外出结束时间
     */
    @Column(name = "end_time")
    private Date endTime;

    private String reason;

    /**
     * 审批人
     */
    @Column(name = "approver_usercode")
    private String approverUsercode;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 状态
     */
    private Byte status;

    @Column(name = "approver_username")
    private String approverUsername;

    /**
     * 订单号
     */
    @Column(name = "order_id")
    private String orderId;
}