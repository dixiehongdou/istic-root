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
@Table(name = "leave_order")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LeaveOrder {
    @Id
    private Integer id;

    /**
     * 订单号
订单号
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 申请时间
     */
    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    /**
     * 请假类型
     */
    private Integer type;

    /**
     * 申请人code
     */
    @Column(name = "apply_usercode")
    private String applyUsercode;

    @Column(name = "apply_username")
    private String applyUsername;

    /**
     * 请假原因
     */
    private String reason;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 附件
     */
    private String attachment;

    /**
     * 审批人Code
审批信息
审批人Code
     */
    @Column(name = "approver_usercode")
    private String approverUsercode;

    /**
     * 审批人姓名
     */
    @Column(name = "approver_username")
    private String approverUsername;

    /**
     * 部门id
     */
    @Column(name = "department_id")
    private Integer departmentId;
}