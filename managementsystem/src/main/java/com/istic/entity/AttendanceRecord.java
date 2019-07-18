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
}