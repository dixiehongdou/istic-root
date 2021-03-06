package com.istic.dao;

import com.istic.entity.SysOrganization;
import com.istic.util.TkMapper;

/**
* Created by Mybatis Generator on 2019/07/30
*/
public interface SysOrganizationMapper extends TkMapper<SysOrganization> {
    /**
     * 根据部门名称查找部门详细信息
     * @param deptName
     * @return
     */
    SysOrganization getSysOrganizationByName(String deptName);

}

