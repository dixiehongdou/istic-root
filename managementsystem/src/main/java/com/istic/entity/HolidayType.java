package com.istic.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2019/07/29
*/
@Table(name = "holiday_type")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HolidayType {
    @Id
    private Integer id;

    /**
     * 编码
     */
    private String code;

    @Column(name = "name_cn")
    private String nameCn;

    @Column(name = "name_en")
    private String nameEn;

    /**
     * 附加值
     */
    @Column(name = "value_add")
    private String valueAdd;

    /**
     * 备注中文
     */
    @Column(name = "note_cn")
    private String noteCn;

    /**
     * 备注英文
     */
    @Column(name = "note_en")
    private String noteEn;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 创建人
     */
    private String creator;

    /**
     * 状态 0 禁用 1 启用
     */
    private Byte status;
}