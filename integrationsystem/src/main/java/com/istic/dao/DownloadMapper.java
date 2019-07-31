package com.istic.dao;

import com.istic.entity.Download;
import com.istic.util.TkMapper;

import java.util.List;

/**
* Created by Mybatis Generator on 2019/07/30
*/
public interface DownloadMapper extends TkMapper<Download> {
    /**
     * 获取下载列表
     * @param count
     * @return
     */
    List<Download> getDownloadList(int count);
}