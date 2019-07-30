package com.istic.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2019/07/30
*/
@Table(name = "sys_position")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SysPosition {
    @Id
    private String id;

    private String name;

    private Integer num;

    private String oid;

    private String pid;

    private String description;

    private Integer isprincipal;

    private Integer sort;
}