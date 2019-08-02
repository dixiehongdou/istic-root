package com.istic.service.impl;

import com.istic.base.BaseService;
import com.istic.dao.AlipayOrderMapper;
import com.istic.entity.AlipayOrder;
import com.istic.service.AlipayOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: sunwy
 * @Date: 2019/8/1 9:59
 */
@Service
public class AlipayOrderServiceImpl extends BaseService implements AlipayOrderService {
    @Autowired
    AlipayOrderMapper alipayOrderMapper;

    @Override
    public void addAlipayOrder(AlipayOrder alipayOrder) {
        alipayOrderMapper.insert(alipayOrder);
    }
}
