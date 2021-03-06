package com.istic.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.istic.base.BaseService;
import com.istic.base.Result;
import com.istic.constants.FormNoTypeEnum;
import com.istic.dao.LeaveOrderMapper;
import com.istic.dao.LeaveOrderStatusMapper;
import com.istic.dao.OrderTraceMapper;
import com.istic.entity.LeaveOrder;
import com.istic.entity.LeaveOrderStatus;
import com.istic.entity.OrderTrace;
import com.istic.entity.vo.AddLeaveOrder;
import com.istic.entity.vo.UpdateStatus;
import com.istic.service.FormNoGenerateService;
import com.istic.service.LeaveOrderService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

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
    LeaveOrderStatusMapper leaveOrderStatusMapper;

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
        insertLeaveOrderStatus(map.getId(), addLeaveOrder.getApplyUsercode(), addLeaveOrder.getApproverUsercode());
        OrderTrace build = OrderTrace.builder().operator(addLeaveOrder.getOperator()).result("订单提交").build();
        orderTraceMapper.insertSelective(build);
        if (i > 0) {
            return success("");
        }
        return error("");
    }

    private void insertLeaveOrderStatus(Integer leaveOrderId, String applyUsercode, String approverUsercode) {
        LeaveOrderStatus applyUsercodeStatus = LeaveOrderStatus.builder().username(applyUsercode).leaveOrderId(leaveOrderId).build();
        LeaveOrderStatus approverUsercodeStatus = LeaveOrderStatus.builder().username(approverUsercode).leaveOrderId(leaveOrderId).build();
        leaveOrderStatusMapper.insertSelective(applyUsercodeStatus);
        leaveOrderStatusMapper.insertSelective(approverUsercodeStatus);
    }


    @Override
    public Result iLeaveOrder(String operator, String type, Long startTime, Long endTime, Byte status) {
        HashMap<String, Object> mapWithExpectedSize = Maps.newHashMapWithExpectedSize(8);
        mapWithExpectedSize.put("operator", operator);
        mapWithExpectedSize.put("startTime", new Date(startTime));
        mapWithExpectedSize.put("endTime", new Date(endTime));
        mapWithExpectedSize.put("type", type);
        mapWithExpectedSize.put("status", status);
        List<LeaveOrder> leaveOrderList = leaveOrderMapper.iLeaveOrder(mapWithExpectedSize);
        return success("").setData(leaveOrderList);
    }

    @Override
    public Result leaveOrder(Integer id) {
        LeaveOrder leaveOrder = leaveOrderMapper.selectByPrimaryKey(id);
        List<OrderTrace> orderTraceList = orderTraceMapper.select(OrderTrace.builder().orderId(id).build());
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("leaveOrder", leaveOrder);
        jsonObject.put("leaveOrder", orderTraceList);
        return success("").setData(jsonObject);
    }

    @Override
    @Transactional
    public Result updateStatus(UpdateStatus updateStatus) {
        LeaveOrder map = dozerBeanMapper.map(updateStatus, LeaveOrder.class);
        int i = leaveOrderMapper.updateByPrimaryKey(map);
        OrderTrace build = OrderTrace.builder().operator(updateStatus.getOperator()).result(result(updateStatus.getStatus())).build();
        orderTraceMapper.insertSelective(build);
        if (i > 0) {
            return success("");
        }
        return error("");
    }

    private String result(Byte status) {
        String result = "";
        switch (status) {
            case 0:
                result = "待审批";
                break;
            case 1:
                result = "审批通过";
                break;
            case 2:
                result = "已撤回";
                break;
            case 3:
                result = "审批未通过";
                break;
            case 4:
                result = "已退回";
                break;
        }
        return result;
    }
}
