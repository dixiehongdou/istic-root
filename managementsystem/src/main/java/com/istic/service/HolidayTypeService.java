package com.istic.service;

import com.istic.base.Result;
import com.istic.entity.vo.AddHolidayType;
import com.istic.entity.vo.EnableHoloday;

/**
 * Created by hch on 2019/7/29.
 */
public interface HolidayTypeService {
    Result addHolidayType(AddHolidayType addHolidayType);

    Result enableOrDisable(EnableHoloday enableHoloday);

    Result holidayTypeList();

    Result enableHolidayTypeList();
}
