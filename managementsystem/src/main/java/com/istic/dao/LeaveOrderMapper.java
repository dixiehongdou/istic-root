package com.istic.dao;

import com.istic.base.Result;
import com.istic.entity.LeaveOrder;
import com.istic.util.TkMapper;

import java.util.HashMap;
import java.util.List;

/**
* Created by Mybatis Generator on 2019/07/29
*/
public interface LeaveOrderMapper extends TkMapper<LeaveOrder> {
    List<LeaveOrder> iLeaveOrder(HashMap<String, Object> mapWithExpectedSize);
}