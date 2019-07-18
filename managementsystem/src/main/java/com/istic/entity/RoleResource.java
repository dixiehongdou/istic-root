package com.istic.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* Created by Mybatis Generator on 2019/07/18
*/
@Table(name = "role_resource")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleResource {
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "resource_id")
    private Integer resourceId;
}