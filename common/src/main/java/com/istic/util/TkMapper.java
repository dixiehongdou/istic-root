package com.istic.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by hch on 2017/7/11.
 */
//接口不能被扫描到，否则会出错
public interface TkMapper<T>  extends Mapper<T>, MySqlMapper<T>{
}
