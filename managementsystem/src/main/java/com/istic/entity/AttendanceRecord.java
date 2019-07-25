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
@Table(name = "attendance_record")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AttendanceRecord {
    @Id
    private Integer id;

    private String username;

    /**
     * 上班打卡时间
     */
    @Column(name = "punch_in_time")
    private Date punchInTime;

    /**
     * 下班打卡时间
     */
    @Column(name = "punch_out_time")
    private Date punchOutTime;

    /**
     * 部门id
     */
    @Column(name = "depart_id")
    private Integer departId;

    /**
     * 上午打卡状态0 正常 1 迟到 2 未打卡
     */
    @Column(name = "status_am")
    private Byte statusAm;

    /**
     * 下午打卡状态0 正常 1 迟到 2 未打卡
     */
    @Column(name = "status_pm")
    private Byte statusPm;

    /**
     * 工作时长
     */
    @Column(name = "working_hours")
    private Double workingHours;

    /**
     * 考勤类型 
     */
    @Column(name = "attendance_type")
    private String attendanceType;

    /**
     * 加班时长
     */
    @Column(name = "overtime_hours")
    private Double overtimeHours;

    /**
     * 请假时长
     */
    @Column(name = "leave_hours")
    private Double leaveHours;

    /**
     * 0 未请假  1事假   2 其他假  
     */
    private Byte status;

    /**
     * 是否外勤 0 否 1 是
     */
    @Column(name = "is_go_out")
    private Byte isGoOut;

    /**
     * 员工code
     */
    private String usercode;
}