package com.istic.service.impl;

import com.istic.base.BaseService;
import com.istic.base.Result;
import com.istic.dao.RulesMapper;
import com.istic.entity.Rules;
import com.istic.service.RulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: sunwy
 * @Date: 2019/7/31 13:27
 */
@Service
public class RulesServiceImpl extends BaseService implements RulesService {

    @Autowired
    RulesMapper rulesMapper;

    @Override
    public Result getRulesByCount(Integer count) {
        List<Rules> rules = rulesMapper.getRulesByCount(count);
        return success("查询成功").setCode(0).setData(rules);
    }

    @Override
    public Result getRulesDetail(String id) {
        Rules rules = rulesMapper.selectByPrimaryKey(id);
        return success("查询成功").setCode(0).setData(rules);
    }
}
