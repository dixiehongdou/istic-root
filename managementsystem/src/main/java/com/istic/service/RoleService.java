package com.istic.service;

import com.istic.base.Result;
import com.istic.entity.vo.AddRole;
import com.istic.entity.vo.UpdateRole;

/**
 * Created by hch on 2019/7/25.
 */
public interface RoleService {
    Result addRole(AddRole addRole);

    Result updateRole(UpdateRole updateRole);

    Result selectRolesByName(String roleName);
}
