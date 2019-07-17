package com.istic.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "journal_basic_data")
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
     * 获取刊名
     *
     * @return journal_name - 刊名
     */
    public String getJournalName() {
        return journalName;
    }

    /**
     * 设置刊名
     *
     * @param journalName 刊名
     */
    public void setJournalName(String journalName) {
        this.journalName = journalName;
    }

    /**
     * 获取刊号
     *
     * @return journal_number - 刊号
     */
    public String getJournalNumber() {
        return journalNumber;
    }

    /**
     * 设置刊号
     *
     * @param journalNumber 刊号
     */
    public void setJournalNumber(String journalNumber) {
        this.journalNumber = journalNumber;
    }

    /**
     * 获取刊期
     *
     * @return journal_date - 刊期
     */
    public String getJournalDate() {
        return journalDate;
    }

    /**
     * 设置刊期
     *
     * @param journalDate 刊期
     */
    public void setJournalDate(String journalDate) {
        this.journalDate = journalDate;
    }

    /**
     * @return price
     */
    public Long getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * 获取年费
     *
     * @return annual_fee - 年费
     */
    public Long getAnnualFee() {
        return annualFee;
    }

    /**
     * 设置年费
     *
     * @param annualFee 年费
     */
    public void setAnnualFee(Long annualFee) {
        this.annualFee = annualFee;
    }

    /**
     * 获取期刊种类
     *
     * @return journal_type - 期刊种类
     */
    public Byte getJournalType() {
        return journalType;
    }

    /**
     * 设置期刊种类
     *
     * @param journalType 期刊种类
     */
    public void setJournalType(Byte journalType) {
        this.journalType = journalType;
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