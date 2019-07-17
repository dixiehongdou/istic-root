package com.istic.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "journal_order")
public class JournalOrder {
    @Id
    private Integer id;

    /**
     * 预订人Code
     */
    @Column(name = "reservation_usercode")
    private String reservationUsercode;

    /**
     * 预订人姓名
     */
    @Column(name = "reservation_username")
    private String reservationUsername;

    /**
     * 订单编号
     */
    @Column(name = "order_number")
    private String orderNumber;

    @Column(name = "start_time")
    private Date startTime;

    /**
     * 年费
     */
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 部门
     */
    private String department;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 联系电话
     */
    @Column(name = "phone_number")
    private String phoneNumber;

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
     * 获取预订人Code
     *
     * @return reservation_usercode - 预订人Code
     */
    public String getReservationUsercode() {
        return reservationUsercode;
    }

    /**
     * 设置预订人Code
     *
     * @param reservationUsercode 预订人Code
     */
    public void setReservationUsercode(String reservationUsercode) {
        this.reservationUsercode = reservationUsercode;
    }

    /**
     * 获取预订人姓名
     *
     * @return reservation_username - 预订人姓名
     */
    public String getReservationUsername() {
        return reservationUsername;
    }

    /**
     * 设置预订人姓名
     *
     * @param reservationUsername 预订人姓名
     */
    public void setReservationUsername(String reservationUsername) {
        this.reservationUsername = reservationUsername;
    }

    /**
     * 获取订单编号
     *
     * @return order_number - 订单编号
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * 设置订单编号
     *
     * @param orderNumber 订单编号
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * @return start_time
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取年费
     *
     * @return end_time - 年费
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置年费
     *
     * @param endTime 年费
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取部门
     *
     * @return department - 部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置部门
     *
     * @param department 部门
     */
    public void setDepartment(String department) {
        this.department = department;
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
     * 获取状态
     *
     * @return status - 状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取联系电话
     *
     * @return phone_number - 联系电话
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置联系电话
     *
     * @param phoneNumber 联系电话
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}