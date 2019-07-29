package com.istic.service.impl;

import com.istic.base.BaseService;
import com.istic.base.Result;
import com.istic.dao.HolidayTypeMapper;
import com.istic.entity.HolidayType;
import com.istic.entity.vo.AddHolidayType;
import com.istic.service.HolidayTypeService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hch on 2019/7/29.
 */
@Service
public class HolidayTypeServiceImpl extends BaseService implements HolidayTypeService {
    @Autowired
    HolidayTypeMapper holidayTypeMapper;
    @Autowired
    DozerBeanMapper dozerBeanMapper;
    @Override
    public Result addHolidayType(AddHolidayType addHolidayType) {
        HolidayType map = dozerBeanMapper.map(addHolidayType, HolidayType.class);
        int i = holidayTypeMapper.insertSelective(map);
        if (i > 0) {
            return success("");
        }
        return error("");
    }
}
