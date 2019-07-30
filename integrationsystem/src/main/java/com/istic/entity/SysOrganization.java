package com.istic.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2019/07/30
*/
@Table(name = "sys_organization")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysOrganization {
    @Id
    private String id;

    private String name;

    private String identifier;

    @Column(name = "parentId")
    private String parentid;

    private String address;

    private String tell;

    private String fax;

    private String email;

    private String remark;

    private Integer sort;
}