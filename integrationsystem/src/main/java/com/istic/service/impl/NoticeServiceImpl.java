package com.istic.service.impl;

import com.istic.base.BaseService;
import com.istic.base.Result;
import com.istic.dao.NoticeMapper;
import com.istic.entity.Notice;
import com.istic.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: sunwy
 * @Date: 2019/7/30 15:55
 */
@Service
public class NoticeServiceImpl extends BaseService implements NoticeService {
    @Autowired
    NoticeMapper noticeMapper;
    @Override
    public Result getNoticeByCount(Integer count) {
        List<Notice> notices = noticeMapper.getNoticeByCount(count);
        Result result = success("查询成功").setCode(0).setData(notices);
        return result;
    }

    @Override
    public Result getDetailsById(String id) {
       Notice notice= noticeMapper.getDetailsById(id);
       Result result=success("查询成功").setCode(0).setData(notice);
       return  result;
    }
}
