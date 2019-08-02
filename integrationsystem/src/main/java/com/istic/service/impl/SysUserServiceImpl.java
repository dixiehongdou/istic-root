package com.istic.service.impl;

import com.istic.base.BaseService;
import com.istic.base.Result;
import com.istic.dao.SysUserMapper;
import com.istic.config.SSOConfig;
import com.istic.entity.SysUser;
import com.istic.entity.vo.AddSysUserVo;
import com.istic.entity.vo.UpdateSysUserVo;
import com.istic.service.SysUserService;
import com.istic.util.DESUtil;
import com.istic.util.DS;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

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
    @DS("oadatasource")
    public Result addOASysUser(AddSysUserVo addSysUserVo) {
        SysUser user = dozerBeanMapper.map(addSysUserVo, SysUser.class);
        SysUser sysUser = getUserByName(user.getUsername());
        if (sysUser == null) {
            user.setId(UUID.randomUUID().toString().toUpperCase());
            sysUserMapper.insert(user);
        } else {
            return success(String.format("%s用户已经存在OA系统", addSysUserVo.getUsername()));
        }
        return success("同步oa用户成功");
    }

    @Override
    @DS("oadatasource")
    public SysUser getUserByName(String username) {
        return sysUserMapper.getUserByName(username);
    }

    @Override

    public Result getSSOLoginUrl(String uid, String to) {
        Result result = success("查询成功").setCode(0).setData("");
        if ("mail".equals(to)) {
            SysUser sysUser = sysUserMapper.getUserByName(uid);
            String ticket = "";
            try {
                ticket = DESUtil.encrypt(sysUser.getPassword());
            } catch (Exception e) {
                e.printStackTrace();
            }
            result.setData(String.format(ssoConfig.getMailLoginUrl(), sysUser.getEmailUsername(),
                    sysUser.getEmailPassword(), ticket));
        } else if ("keyan".equals(to)) {
            try {
                result.setData(String.format(ssoConfig.getKeyanLoginUrl(), DESUtil.encrypt(uid)));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if ("oa".equals(to.toLowerCase())) {

        } else {
            result.setData("").setCode(1).setMessage("参数错误");
        }
        return result;
    }

    @Override
    public Result updateOASysUserStatus(UpdateSysUserVo updateSysUserVo) {
        sysUserMapper.updateOASysUserStatus(updateSysUserVo);
        return success("更新OA用户状态成功");
    }
}
