package com.istic.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mail_template")
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

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取邮件类型
     *
     * @return mail_type - 邮件类型
     */
    public Byte getMailType() {
        return mailType;
    }

    /**
     * 设置邮件类型
     *
     * @param mailType 邮件类型
     */
    public void setMailType(Byte mailType) {
        this.mailType = mailType;
    }

    /**
     * 获取邮件标题
     *
     * @return mail_title - 邮件标题
     */
    public String getMailTitle() {
        return mailTitle;
    }

    /**
     * 设置邮件标题
     *
     * @param mailTitle 邮件标题
     */
    public void setMailTitle(String mailTitle) {
        this.mailTitle = mailTitle;
    }

    /**
     * @return mail_content
     */
    public String getMailContent() {
        return mailContent;
    }

    /**
     * @param mailContent
     */
    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }

    /**
     * 获取步骤名称
     *
     * @return steps - 步骤名称
     */
    public String getSteps() {
        return steps;
    }

    /**
     * 设置步骤名称
     *
     * @param steps 步骤名称
     */
    public void setSteps(String steps) {
        this.steps = steps;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }
}