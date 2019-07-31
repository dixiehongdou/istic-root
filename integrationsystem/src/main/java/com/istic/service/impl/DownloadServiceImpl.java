package com.istic.service.impl;

import com.istic.base.BaseService;
import com.istic.base.Result;
import com.istic.dao.DownloadMapper;
import com.istic.entity.Download;
import com.istic.service.DownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: sunwy
 * @Date: 2019/7/31 9:32
 */
@Service
public class DownloadServiceImpl extends BaseService implements DownloadService {

    @Autowired
    DownloadMapper downloadMapper;

    @Override
    public Result getDownloadList(Integer count) {
        if (count <= 0||count>=100) count = 10;
        List<Download> lst = downloadMapper.getDownloadList(count);
        return success("查询成功").setCode(0).setData(lst);
    }
}
