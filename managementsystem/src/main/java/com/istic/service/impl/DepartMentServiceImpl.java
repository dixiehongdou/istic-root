package com.istic.service.impl;

import com.istic.base.BaseService;
import com.istic.base.Result;
import com.istic.dao.DepartmentMapper;
import com.istic.dao.OrderTraceMapper;
import com.istic.entity.Department;
import com.istic.entity.Role;
import com.istic.entity.vo.AddDepart;
import com.istic.entity.vo.UpdateDepart;
import com.istic.service.DepartMentService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hch on 2019/7/25.
 */
@Service
public class DepartMentServiceImpl extends BaseService implements DepartMentService {
    @Autowired
    DepartmentMapper departmentMapper;


    @Autowired
    DozerBeanMapper dozerBeanMapper;



    @Override
    public Result addDepart(AddDepart addDepart) {
        Department map = dozerBeanMapper.map(addDepart, Department.class);
        int i = departmentMapper.insertSelective(map);
        if (i > 0) {
            return success("");
        }
        return error("");
    }

    @Override
    public Result updateDepart(UpdateDepart updateDepart) {
        Department map = dozerBeanMapper.map(updateDepart, Department.class);
        int i = departmentMapper.updateByPrimaryKeySelective(map);
        if (i > 0) {
            return success("");
        }
        return error("");
    }

    @Override
    public Result selectDepartsByName(String departName) {
        List<Department> departmentList = departmentMapper.selectDepartsByName(departName);
        return success("").setData(departmentList);
    }
}
