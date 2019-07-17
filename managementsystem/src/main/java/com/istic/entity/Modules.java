package com.istic.entity;

import java.util.Date;
import javax.persistence.*;

public class Modules {
    @Id
    private Integer id;

    @Column(name = "module_name_cn")
    private String moduleNameCn;

    @Column(name = "module_name_en")
    private String moduleNameEn;

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
     * @return module_name_cn
     */
    public String getModuleNameCn() {
        return moduleNameCn;
    }

    /**
     * @param moduleNameCn
     */
    public void setModuleNameCn(String moduleNameCn) {
        this.moduleNameCn = moduleNameCn;
    }

    /**
     * @return module_name_en
     */
    public String getModuleNameEn() {
        return moduleNameEn;
    }

    /**
     * @param moduleNameEn
     */
    public void setModuleNameEn(String moduleNameEn) {
        this.moduleNameEn = moduleNameEn;
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