package com.istic.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "car_license_order")
public class CarLicenseOrder {
    @Id
    private Integer id;

    /**
     * 预定人code
     */
    @Column(name = "reservation_usercode")
    private String reservationUsercode;

    /**
     * 预定人姓名
     */
    @Column(name = "reservation_username")
    private String reservationUsername;

    /**
     * 联系电话
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 代办人code
     */
    @Column(name = "commission_usercode")
    private String commissionUsercode;

    @Column(name = "commission_username")
    private String commissionUsername;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "update_time")
    private Date updateTime;

    private Byte status;

    @Column(name = "order_number")
    private String orderNumber;

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
     * 获取预定人code
     *
     * @return reservation_usercode - 预定人code
     */
    public String getReservationUsercode() {
        return reservationUsercode;
    }

    /**
     * 设置预定人code
     *
     * @param reservationUsercode 预定人code
     */
    public void setReservationUsercode(String reservationUsercode) {
        this.reservationUsercode = reservationUsercode;
    }

    /**
     * 获取预定人姓名
     *
     * @return reservation_username - 预定人姓名
     */
    public String getReservationUsername() {
        return reservationUsername;
    }

    /**
     * 设置预定人姓名
     *
     * @param reservationUsername 预定人姓名
     */
    public void setReservationUsername(String reservationUsername) {
        this.reservationUsername = reservationUsername;
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

    /**
     * 获取代办人code
     *
     * @return commission_usercode - 代办人code
     */
    public String getCommissionUsercode() {
        return commissionUsercode;
    }

    /**
     * 设置代办人code
     *
     * @param commissionUsercode 代办人code
     */
    public void setCommissionUsercode(String commissionUsercode) {
        this.commissionUsercode = commissionUsercode;
    }

    /**
     * @return commission_username
     */
    public String getCommissionUsername() {
        return commissionUsername;
    }

    /**
     * @param commissionUsername
     */
    public void setCommissionUsername(String commissionUsername) {
        this.commissionUsername = commissionUsername;
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
     * @return end_time
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
}