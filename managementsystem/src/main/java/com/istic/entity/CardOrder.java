package com.istic.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "card_order")
public class CardOrder {
    @Id
    private Integer id;

    /**
     * 单据类型 1补卡 2销卡 3卡挂失
     */
    @Column(name = "order_type")
    private Byte orderType;

    /**
     * 申请开始时间
     */
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 申请截止时间
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 订单状态 1代受理  2已受理 3已完成 4未提交
     */
    private Byte status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "order_number")
    private String orderNumber;

    /**
     * 申请人code
     */
    @Column(name = "apply_usercode")
    private String applyUsercode;

    @Column(name = "apply_username")
    private String applyUsername;

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
     * 获取单据类型 1补卡 2销卡 3卡挂失
     *
     * @return order_type - 单据类型 1补卡 2销卡 3卡挂失
     */
    public Byte getOrderType() {
        return orderType;
    }

    /**
     * 设置单据类型 1补卡 2销卡 3卡挂失
     *
     * @param orderType 单据类型 1补卡 2销卡 3卡挂失
     */
    public void setOrderType(Byte orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取申请开始时间
     *
     * @return start_time - 申请开始时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置申请开始时间
     *
     * @param startTime 申请开始时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取申请截止时间
     *
     * @return end_time - 申请截止时间
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置申请截止时间
     *
     * @param endTime 申请截止时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取订单状态 1代受理  2已受理 3已完成 4未提交
     *
     * @return status - 订单状态 1代受理  2已受理 3已完成 4未提交
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置订单状态 1代受理  2已受理 3已完成 4未提交
     *
     * @param status 订单状态 1代受理  2已受理 3已完成 4未提交
     */
    public void setStatus(Byte status) {
        this.status = status;
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
     * @return order_number
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * @param orderNumber
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 获取申请人code
     *
     * @return apply_usercode - 申请人code
     */
    public String getApplyUsercode() {
        return applyUsercode;
    }

    /**
     * 设置申请人code
     *
     * @param applyUsercode 申请人code
     */
    public void setApplyUsercode(String applyUsercode) {
        this.applyUsercode = applyUsercode;
    }

    /**
     * @return apply_username
     */
    public String getApplyUsername() {
        return applyUsername;
    }

    /**
     * @param applyUsername
     */
    public void setApplyUsername(String applyUsername) {
        this.applyUsername = applyUsername;
    }
}