package com.istic.service.impl;

import com.istic.base.BaseService;
import com.istic.base.Result;
import com.istic.dao.UserMapper;
import com.istic.entity.User;
import com.istic.entity.vo.AddUser;
import com.istic.service.UserService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by hch on 2019/7/17.
 */
@Service
public class UserServiceImpl extends BaseService implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    DozerBeanMapper dozerBeanMapper;

    @Override
    public Result addUser(AddUser addUser) {
        User user = dozerBeanMapper.map(addUser, User.class);
        userMapper.insert(user);
        return success("");
    }
}
