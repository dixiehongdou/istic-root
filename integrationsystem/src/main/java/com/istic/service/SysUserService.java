package com.istic.service;

import com.istic.base.Result;
import com.istic.entity.SysUser;
import com.istic.entity.vo.AddSysUserVo;

/**
 * @Author: sunwy
 * @Date: 2019/7/31 12:00
 */
public interface SysUserService {
    /**
     * 同步用户到oa系统
     * @param addSysUserVo
     */
    Result syncOASysUser(AddSysUserVo addSysUserVo);

    /**
     * 获取单点登录的url
     * @param uid
     * @param to
     * @return
     */
    Result getSSOLoginUrl(String uid, String to);
}
