package com.istic.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "temp_stall")
public class TempStall {
    @Id
    @Column(name = "` id`")
    private Integer id;

    /**
     * 预定人code
     */
    @Column(name = "reservation_user_code")
    private String reservationUserCode;

    /**
     * 预定人姓名
     */
    @Column(name = "reservation_user_name")
    private String reservationUserName;

    /**
     * 联系电话
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /**
     * 使用日期
     */
    @Column(name = "use_date")
    private Date useDate;

    /**
     * 使用时间 1 上午 2 下午  3 全天
     */
    @Column(name = "use_time")
    private Byte useTime;

    /**
     * 车牌号
     */
    @Column(name = "car_number")
    private String carNumber;

    /**
     * 备注
     */
    private String note;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 状态
     */
    private Byte status;

    /**
     * @return  id
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
     * @return reservation_user_code - 预定人code
     */
    public String getReservationUserCode() {
        return reservationUserCode;
    }

    /**
     * 设置预定人code
     *
     * @param reservationUserCode 预定人code
     */
    public void setReservationUserCode(String reservationUserCode) {
        this.reservationUserCode = reservationUserCode;
    }

    /**
     * 获取预定人姓名
     *
     * @return reservation_user_name - 预定人姓名
     */
    public String getReservationUserName() {
        return reservationUserName;
    }

    /**
     * 设置预定人姓名
     *
     * @param reservationUserName 预定人姓名
     */
    public void setReservationUserName(String reservationUserName) {
        this.reservationUserName = reservationUserName;
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
     * 获取使用日期
     *
     * @return use_date - 使用日期
     */
    public Date getUseDate() {
        return useDate;
    }

    /**
     * 设置使用日期
     *
     * @param useDate 使用日期
     */
    public void setUseDate(Date useDate) {
        this.useDate = useDate;
    }

    /**
     * 获取使用时间 1 上午 2 下午  3 全天
     *
     * @return use_time - 使用时间 1 上午 2 下午  3 全天
     */
    public Byte getUseTime() {
        return useTime;
    }

    /**
     * 设置使用时间 1 上午 2 下午  3 全天
     *
     * @param useTime 使用时间 1 上午 2 下午  3 全天
     */
    public void setUseTime(Byte useTime) {
        this.useTime = useTime;
    }

    /**
     * 获取车牌号
     *
     * @return car_number - 车牌号
     */
    public String getCarNumber() {
        return carNumber;
    }

    /**
     * 设置车牌号
     *
     * @param carNumber 车牌号
     */
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    /**
     * 获取备注
     *
     * @return note - 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注
     *
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note;
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
}