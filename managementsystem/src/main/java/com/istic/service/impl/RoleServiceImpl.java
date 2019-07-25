package com.istic.service.impl;

import com.istic.base.BaseService;
import com.istic.base.Result;
import com.istic.dao.RoleMapper;
import com.istic.entity.Role;
import com.istic.entity.vo.AddRole;
import com.istic.entity.vo.UpdateRole;
import com.istic.service.RoleService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hch on 2019/7/25.
 */
@Service
public class RoleServiceImpl extends BaseService implements RoleService {
    @Autowired
    RoleMapper roleMapper;
    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Override
    public Result addRole(AddRole addRole) {
        Role map = dozerBeanMapper.map(addRole, Role.class);
        int i = roleMapper.insertSelective(map);
        if (i > 0)
            return success("");
        return error("");
    }

    @Override
    public Result updateRole(UpdateRole updateRole) {
        Role map = dozerBeanMapper.map(updateRole, Role.class);
        int i = roleMapper.updateByPrimaryKeySelective(map);
        if (i > 0)
            return success("");
        return error("");
    }

    @Override
    public Result selectRolesByName(String roleName) {
        List<Role> roleList = roleMapper.selectRolesByName(roleName);
        return success("").setData(roleList);
    }
}
