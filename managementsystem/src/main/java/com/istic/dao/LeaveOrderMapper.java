package com.istic.dao;

import com.istic.base.Result;
import com.istic.entity.LeaveOrder;
import com.istic.util.TkMapper;

import java.util.HashMap;

/**
* Created by Mybatis Generator on 2019/07/29
*/
public interface LeaveOrderMapper extends TkMapper<LeaveOrder> {
    Result iLeaveOrder(HashMap<String, Object> mapWithExpectedSize);
}