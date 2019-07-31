package com.istic.service;

import com.istic.base.Result;

/**
 * @Author: sunwy
 * @Date: 2019/7/31 9:31
 */
public interface DownloadService {
    /**
     * 获取下载列表
     * @param count
     * @return
     */
    Result getDownloadList(Integer count);
}
