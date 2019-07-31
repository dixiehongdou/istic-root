package com.istic.dao;

import com.istic.entity.SysUser;
import com.istic.entity.vo.AddSysUserVo;
import com.istic.util.TkMapper;

/**
* Created by Mybatis Generator on 2019/07/30
*/
public interface SysUserMapper extends TkMapper<SysUser> {
    /**
     * 同步用户到oa系统
     * @param addSysUserVo
     */
    void  syncOASysUser(AddSysUserVo addSysUserVo);
    /**
     * 根据名称获取oa用户信息
     * @param username
     * @return
     */
    SysUser getUserByName(String username);
}