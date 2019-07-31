package com.istic.dao;

import com.istic.entity.Rules;
import com.istic.util.TkMapper;

import java.util.List;

/**
* Created by Mybatis Generator on 2019/07/30
*/
public interface RulesMapper extends TkMapper<Rules> {

    /**
     * 根据条数查询规章制度
     * @param count
     * @return
     */
    List<Rules> getRulesByCount(Integer count);
}