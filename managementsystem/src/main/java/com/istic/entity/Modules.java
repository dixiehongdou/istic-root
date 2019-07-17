package com.istic.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2019/07/17
*/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
}