package com.istic.entity;

import java.util.Date;
import javax.persistence.*;

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
     * 获取公告名称
     *
     * @return notice_name - 公告名称
     */
    public String getNoticeName() {
        return noticeName;
    }

    /**
     * 设置公告名称
     *
     * @param noticeName 公告名称
     */
    public void setNoticeName(String noticeName) {
        this.noticeName = noticeName;
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
     * 获取操作人
     *
     * @return operator - 操作人
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作人
     *
     * @param operator 操作人
     */
    public void setOperator(String operator) {
        this.operator = operator;
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
     * 获取发布内容
     *
     * @return content - 发布内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置发布内容
     *
     * @param content 发布内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}