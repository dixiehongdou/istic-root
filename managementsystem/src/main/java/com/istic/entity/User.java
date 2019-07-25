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
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private Integer id;

    /**
     * 员工姓名
     */
    private String username;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 员工Code
     */
    private String usercode;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 部门
     */
    @Column(name = "department_id")
    private Integer departmentId;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private String password;

    /**
     * 考勤类型
     */
    @Column(name = "attendance_type")
    private Integer attendanceType;
}