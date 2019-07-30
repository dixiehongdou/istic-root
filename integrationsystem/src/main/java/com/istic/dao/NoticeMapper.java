package com.istic.dao;

import com.istic.base.Result;
import com.istic.entity.Notice;
import com.istic.util.TkMapper;

import java.util.List;

/**
 * Created by Mybatis Generator on 2019/07/30
 */
public interface NoticeMapper extends TkMapper<Notice> {
    /**
     * 根据条数查询通知公告
     *
     * @param count
     * @return
     */
    List<Notice> getNoticeByCount(Integer count);

    /**
     * 查看详情
     * @param id
     * @return
     */
    Notice getDetailsById(String id);
}