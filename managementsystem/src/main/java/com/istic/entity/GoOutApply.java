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
    private String usercode;

    private String username;

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

    /**
     * 时长
     */
    private Double duration;

    private String reason;

    /**
     * 审批人
     */
    private String approver;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 状态
     */
    private Byte status;
}