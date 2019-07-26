package com.istic.service.impl;

import com.istic.base.BaseService;
import com.istic.base.Result;
import com.istic.constants.FormNoTypeEnum;
import com.istic.dao.LeaveOrderMapper;
import com.istic.dao.OrderTraceMapper;
import com.istic.entity.LeaveOrder;
import com.istic.entity.OrderTrace;
import com.istic.entity.vo.AddLeaveOrder;
import com.istic.service.FormNoGenerateService;
import com.istic.service.LeaveOrderService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hch on 2019/7/26.
 */
@Service
public class LeaveOrderServiceImpl extends BaseService implements LeaveOrderService {

    @Autowired
    LeaveOrderMapper leaveOrderMapper;

    @Autowired
    OrderTraceMapper orderTraceMapper;

    @Autowired
    DozerBeanMapper dozerBeanMapper;
    @Autowired
    FormNoGenerateService formNoGenerateService;

    @Override
    @Transactional
    public Result addLeaveOrder(AddLeaveOrder addLeaveOrder) {
        LeaveOrder map = dozerBeanMapper.map(addLeaveOrder, LeaveOrder.class);
        String orderId = formNoGenerateService.generateFormNo(FormNoTypeEnum.QJ_ORDER);
        map.setOrderId(orderId);
        int i = leaveOrderMapper.insertSelective(map);
        OrderTrace build = OrderTrace.builder().operator(addLeaveOrder.getOperator()).result("订单提交").build();
        orderTraceMapper.insertSelective(build);
        if (i > 0) {
            return success("");
        }
        return error("");
    }
}
