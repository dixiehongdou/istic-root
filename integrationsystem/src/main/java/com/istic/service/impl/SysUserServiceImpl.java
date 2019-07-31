package com.istic.service.impl;

import ch.qos.logback.core.joran.conditional.ElseAction;
import com.istic.base.BaseService;
import com.istic.base.Result;
import com.istic.dao.SysUserMapper;
import com.istic.entity.SSOConfig;
import com.istic.entity.SysUser;
import com.istic.entity.vo.AddSysUserVo;
import com.istic.service.SysUserService;
import com.istic.util.DESUtil;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: sunwy
 * @Date: 2019/7/31 12:00
 */
@Service
public class SysUserServiceImpl extends BaseService implements SysUserService {

    @Autowired
    SysUserMapper sysUserMapper;
    @Autowired
    DozerBeanMapper dozerBeanMapper;
    @Autowired
    SSOConfig ssoConfig;

    @Override
    public Result syncOASysUser(AddSysUserVo addSysUserVo) {
        SysUser user = dozerBeanMapper.map(addSysUserVo, SysUser.class);

        sysUserMapper.insert(user);
        return success("同步oa用户成功");
    }

    @Override
    public Result getSSOLoginUrl(String uid, String to) {
        Result result = success("查询成功").setCode(0).setData("");
        if ("oa".equals(to)) {
            SysUser sysUser = sysUserMapper.getUserByName(uid);
            String ticket = "";
            try {
                ticket = DESUtil.encrypt(sysUser.getPassword());
            } catch (Exception e) {
                e.printStackTrace();
            }
            result.setData(String.format(ssoConfig.getOaLoginUrl(), sysUser.getEmailUsername(),
                    sysUser.getEmailPassword(), ticket));
        } else if ("scientific".equals(to)) {
            try {
                result.setData(String.format(ssoConfig.getScientificResearchLoginUrl(),DESUtil.encrypt(uid)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            result.setData("").setCode(1).setMessage("参数错误");
        }
        return  null;
    }
}
