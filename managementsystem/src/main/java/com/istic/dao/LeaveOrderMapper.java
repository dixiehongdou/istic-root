package com.istic.dao;

import com.istic.base.Result;
import com.istic.entity.LeaveOrder;
import com.istic.util.TkMapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.HashMap;

/**
* Created by Mybatis Generator on 2019/07/25
*/
public interface LeaveOrderMapper extends TkMapper<LeaveOrder> {
    Result iLeaveOrder(HashMap hashMap);
}