package com.istic.service.impl;

import com.istic.dao.SysOrganizationMapper;
import com.istic.entity.SysOrganization;
import com.istic.service.SysOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: sunwy
 * @Date: 2019/7/31 11:58
 */
@Service
public class SysOrganizationServiceImpl implements SysOrganizationService {
    @Autowired
    SysOrganizationMapper sysOrganizationMapper;

    @Override
    public SysOrganization getSysOrganizationByName(String deptName) {
        return sysOrganizationMapper.getSysOrganizationByName(deptName);
    }
}
