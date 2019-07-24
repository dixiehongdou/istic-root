package com.istic.service.impl;

import com.istic.constants.FormNoConstants;
import com.istic.constants.FormNoTypeEnum;
import com.istic.service.FormNoGenerateService;
import com.istic.util.FormNoSerialUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.support.atomic.RedisAtomicLong;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by hch on 2019/7/24.
 */
@Service
public class FormNoGenerateServiceImpl implements FormNoGenerateService {
    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public String generateFormNo(FormNoTypeEnum formNoTypeEnum) {
        //获得单号前缀
        //格式 固定前缀 +时间前缀 示例 ：YF20190101
        String formNoPrefix = FormNoSerialUtil.getFormNoPrefix(formNoTypeEnum);
        //获得缓存key
        String cacheKey = FormNoSerialUtil.getCacheKey(formNoPrefix);
        //获得当日自增数
        Long incrementalSerial = getIncr(cacheKey, getCurrent2TodayEndMillisTime());
        //设置失效时间 7天
        redisTemplate.expire(cacheKey, FormNoConstants.DEFAULT_CACHE_DAYS, TimeUnit.DAYS);
        //组合单号并补全流水号
        return FormNoSerialUtil
                .completionSerial(formNoPrefix, incrementalSerial, formNoTypeEnum);
    }

    public Long getIncr(String key, long liveTime) {
        RedisAtomicLong entityIdCounter = new RedisAtomicLong(key, redisTemplate.getConnectionFactory());
        Long increment = entityIdCounter.getAndIncrement();
        if ((null == increment || increment.longValue() == 0) && liveTime > 0) {//初始设置过期时间
            entityIdCounter.expire(liveTime, TimeUnit.MILLISECONDS);//单位毫秒
        }
        return increment;
    }

    //现在到今天结束的毫秒数
    public Long getCurrent2TodayEndMillisTime() {
        Calendar todayEnd = Calendar.getInstance();
        // Calendar.HOUR 12小时制
        // HOUR_OF_DAY 24小时制
        todayEnd.set(Calendar.HOUR_OF_DAY, 23);
        todayEnd.set(Calendar.MINUTE, 59);
        todayEnd.set(Calendar.SECOND, 59);
        todayEnd.set(Calendar.MILLISECOND, 999);
        return todayEnd.getTimeInMillis() - new Date().getTime();
    }


}
