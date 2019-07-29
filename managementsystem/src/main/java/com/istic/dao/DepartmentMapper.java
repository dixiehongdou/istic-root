package com.istic.dao;

import com.istic.entity.Department;
import com.istic.util.TkMapper;

import java.util.List;

/**
* Created by Mybatis Generator on 2019/07/29
*/
public interface DepartmentMapper extends TkMapper<Department> {
    List<Department> selectDepartsByName(String departName);
}