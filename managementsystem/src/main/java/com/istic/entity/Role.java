package com.istic.entity;

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
public class Role {
    @Id
    private Integer id;

    @Column(name = "role_name")
    private String roleName;
}