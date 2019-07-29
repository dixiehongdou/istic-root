package com.istic.dao;

import com.istic.entity.HolidayType;
import com.istic.entity.vo.EnableHoloday;
import com.istic.util.TkMapper;

/**
* Created by Mybatis Generator on 2019/07/29
*/
public interface HolidayTypeMapper extends TkMapper<HolidayType> {
    int enableOrDisable(EnableHoloday enableHoloday);
}