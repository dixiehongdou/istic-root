package com.istic.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2019/07/30
*/
@Table(name = "rules_category")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RulesCategory {
    private String id;

    @Column(name = "superior_Id")
    private String superiorId;

    private String name;

    private String comment;

    private Integer sort;
}