package com.istic.service.impl;

import com.istic.base.BaseService;
import com.istic.base.Result;
import com.istic.config.DownloadConfig;
import com.istic.dao.DownloadMapper;
import com.istic.entity.Download;
import com.istic.entity.vo.DownloadVo;
import com.istic.service.DownloadService;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

/**
 * @Author: sunwy
 * @Date: 2019/7/31 9:32
 */
@Service
public class DownloadServiceImpl extends BaseService implements DownloadService {

    @Autowired
    DownloadMapper downloadMapper;
    @Autowired
    DownloadConfig downloadConfig;

    @Override
    public Result getDownloadList(Integer count) {
        if (count <= 0 || count >= 100) count = 10;
        List<Download> lst = downloadMapper.getDownloadList(count);
        List<DownloadVo> result = new LinkedList<DownloadVo>();
        for (Download item : lst) {
            DownloadVo downloadVo = new DownloadVo();
            downloadVo.setCategoryId(item.getCategoryId());
            downloadVo.setCreateDate(item.getCreateDate());
            downloadVo.setDownloadUrl(String.format(downloadConfig.getDownloadUrl(), item.getId(), item.getType()));
            downloadVo.setName(item.getName());
            downloadVo.setSize(item.getSize());
            downloadVo.setSort(item.getSort());
            downloadVo.setType(item.getType());
            result.add(downloadVo);
        }
        return success("查询成功").setCode(0).setData(result);
    }
}
