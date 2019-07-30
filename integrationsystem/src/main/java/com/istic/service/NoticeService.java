package com.istic.service;

import com.istic.base.Result;

/**
 * @Author: sunwy
 * @Date: 2019/7/30 15:54
 */
public interface NoticeService {
    Result getNoticeByCount(Integer count);
    Result getDetailsById(String id);
}
