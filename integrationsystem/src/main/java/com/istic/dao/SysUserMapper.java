package com.istic.dao;

import com.istic.entity.SysUser;
import com.istic.entity.vo.AddSysUserVo;
import com.istic.entity.vo.UpdateSysUserVo;
import com.istic.util.TkMapper;

/**
* Created by Mybatis Generator on 2019/07/30
*/
public interface SysUserMapper extends TkMapper<SysUser> {

    /**
     * 根据名称获取oa用户信息
     * @param username
     * @return
     */
    SysUser getUserByName(String username);

    /**
     * 更新oa用户状态
     * @param updateSysUserVo
     */
    void  updateOASysUserStatus(UpdateSysUserVo updateSysUserVo);
}