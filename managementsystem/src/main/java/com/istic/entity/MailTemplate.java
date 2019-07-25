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
@Table(name = "mail_template")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MailTemplate {
    @Id
    private Integer id;

    /**
     * 邮件类型
     */
    @Column(name = "mail_type")
    private Byte mailType;

    /**
     * 邮件标题
     */
    @Column(name = "mail_title")
    private String mailTitle;

    @Column(name = "mail_content")
    private String mailContent;

    /**
     * 步骤名称
     */
    private String steps;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private Byte status;
}