package com.istic.service;

import com.istic.base.Result;

/**
 * @Author: sunwy
 * @Date: 2019/7/31 13:26
 */
public interface RulesService {
    /**
     *
     * @param count
     * @return
     */
    Result getRulesByCount(Integer count);

    /**
     * 详情
     * @param id
     * @return
     */
    Result getRulesDetail(String id);
}
