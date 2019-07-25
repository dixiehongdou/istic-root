package com.istic.dao;

import com.istic.entity.Department;
import com.istic.util.TkMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* Created by Mybatis Generator on 2019/07/25
*/
public interface DepartmentMapper extends TkMapper<Department> {
    List<Department> selectDepartsByName(@Param("departName") String departName);
}