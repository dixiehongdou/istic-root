package com.istic.service;

import com.istic.base.Result;
import com.istic.entity.SysUser;
import com.istic.entity.vo.AddSysUserVo;
import com.istic.entity.vo.UpdateSysUserVo;

/**
 * @Author: sunwy
 * @Date: 2019/7/31 12:00
 */
public interface SysUserService {
    /**
     * 同步用户到oa系统
     * @param addSysUserVo
     */
    Result addOASysUser(AddSysUserVo addSysUserVo);

    /**
     * 根据username查询用户信息
     * @param username
     * @return
     */
    SysUser getUserByName(String username);
    /**
     * 获取单点登录的url
     * @param uid
     * @param to
     * @return
     */
    Result getSSOLoginUrl(String uid, String to);

    /**
     * 更新用户状态
     * @param updateSysUserVo
     * @return
     */
    Result updateOASysUserStatus(UpdateSysUserVo updateSysUserVo);
}
