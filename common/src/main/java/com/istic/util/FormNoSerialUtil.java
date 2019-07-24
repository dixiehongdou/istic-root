package com.istic.util;

import com.istic.constants.FormNoConstants;
import com.istic.constants.FormNoTypeEnum;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by hch on 2019/7/24.
 */
public class FormNoSerialUtil {
    /**
     * 生成单号前缀
     */
    public static String getFormNoPrefix(FormNoTypeEnum formNoTypeEnum) {
        //格式化时间
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formNoTypeEnum.getDatePattern());
        StringBuffer sb = new StringBuffer();
        sb.append(formNoTypeEnum.getPrefix());
        sb.append(formatter.format(LocalDateTime.now()));
        return sb.toString();
    }

    /**
     * 构建流水号缓存Key
     *
     * @param serialPrefix 流水号前缀
     * @return 流水号缓存Key
     */
    public static String getCacheKey(String serialPrefix) {
        return FormNoConstants.SERIAL_CACHE_PREFIX.concat(serialPrefix);
    }

    /**
     * 补全流水号
     *
     * @param serialPrefix      单号前缀
     * @param incrementalSerial 当天自增流水号
     */
    public static String completionSerial(String serialPrefix, Long incrementalSerial,
                                          FormNoTypeEnum formNoTypeEnum) {
        StringBuffer sb = new StringBuffer(serialPrefix);

        //需要补0的长度=流水号长度 -当日自增计数长度
        int length = formNoTypeEnum.getSerialLength() - String.valueOf(incrementalSerial).length();
        //补零
        for (int i = 0; i < length; i++) {
            sb.append("0");
        }
        //redis当日自增数
        sb.append(incrementalSerial);
        return sb.toString();
    }

}
