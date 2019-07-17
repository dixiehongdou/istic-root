package com.istic.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2019/07/17
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Notice {
    @Id
    private Integer id;

    /**
     * 公告名称
     */
    @Column(name = "notice_name")
    private String noticeName;

    @Column(name = "create_time")
    private Date createTime;

    /**
     * 操作人
     */
    private String operator;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 发布内容
     */
    private String content;
}