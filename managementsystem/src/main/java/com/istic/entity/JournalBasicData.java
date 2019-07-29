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
@Table(name = "journal_basic_data")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JournalBasicData {
    @Id
    private Integer id;

    /**
     * 刊名
     */
    @Column(name = "journal_name")
    private String journalName;

    /**
     * 刊号
     */
    @Column(name = "journal_number")
    private String journalNumber;

    /**
     * 刊期
     */
    @Column(name = "journal_date")
    private String journalDate;

    private Long price;

    /**
     * 年费
     */
    @Column(name = "annual_fee")
    private Long annualFee;

    /**
     * 期刊种类
     */
    @Column(name = "journal_type")
    private Byte journalType;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 状态
     */
    private Byte status;
}