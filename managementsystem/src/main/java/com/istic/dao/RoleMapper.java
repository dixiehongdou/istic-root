package com.istic.dao;

import com.istic.entity.Role;
import com.istic.util.TkMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* Created by Mybatis Generator on 2019/07/25
*/
public interface RoleMapper extends TkMapper<Role> {
    List<Role> selectRolesByName(@Param("roleName") String roleName);
}