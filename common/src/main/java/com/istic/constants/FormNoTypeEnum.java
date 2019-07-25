package com.istic.constants;

import lombok.Data;

/**
 * Created by hch on 2019/7/24.
 */

public enum FormNoTypeEnum {

    //会议室
    HY_ORDER("HY", FormNoConstants.SERIAL_YYYYMMDD_PREFIX, 7, 20),
    //报刊
    BK_ORDER("BK", FormNoConstants.SERIAL_YYYYMMDD_PREFIX, 7, 20),
    //名片
    MP_ORDER("MP", FormNoConstants.SERIAL_YYYYMMDD_PREFIX, 7, 20),;

    /**
     * 单号前缀
     * 为空时填""
     */
    private String prefix;

    /**
     * 时间格式表达式
     * 例如：yyyyMMdd
     */
    private String datePattern;

    /**
     * 流水号长度
     */
    private Integer serialLength;

    /**
     * 总长度
     */
    private Integer totalLength;


    FormNoTypeEnum(String prefix, String datePattern, Integer serialLength, Integer totalLength) {
        this.prefix = prefix;
        this.datePattern = datePattern;
        this.serialLength = serialLength;
        this.totalLength = totalLength;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getDatePattern() {
        return datePattern;
    }

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }

    public Integer getSerialLength() {
        return serialLength;
    }

    public void setSerialLength(Integer serialLength) {
        this.serialLength = serialLength;
    }

    public Integer getTotalLength() {
        return totalLength;
    }

    public void setTotalLength(Integer totalLength) {
        this.totalLength = totalLength;
    }
}
