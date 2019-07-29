package com.istic.service;

import com.istic.base.Result;
import com.istic.entity.vo.AddLeaveOrder;
import com.istic.entity.vo.UpdateStatus;

import java.util.Date;

/**
 * Created by hch on 2019/7/26.
 */
public interface LeaveOrderService {

    Result addLeaveOrder(AddLeaveOrder addLeaveOrder);

    Result iLeaveOrder(String operator, String type, Date startTime, Date endTime, Byte status);

    Result leaveOrder(Integer id);

    Result updateStatus(UpdateStatus updateStatus);
}
