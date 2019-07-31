package com.istic.service;

import com.istic.entity.SysOrganization;

/**
 * @Author: sunwy
 * @Date: 2019/7/31 11:57
 */
public interface SysOrganizationService {
    /**
     * 根据部门名称查找部门详细信息
     * @param deptName
     * @return
     */
    SysOrganization getSysOrganizationByName(String deptName);
}
