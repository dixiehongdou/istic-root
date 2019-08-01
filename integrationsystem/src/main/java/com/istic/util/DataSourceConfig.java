package com.istic.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;


/**
 * @Author: sunwy
 * @Date: 2019/8/1 10:50
 */
@Configuration
public class DataSourceConfig {
    @Bean(name = "oadatasource")
    @ConfigurationProperties(prefix = "spring.datasource.oa")
    public DataSource oaDataSource(){
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "keyandatasource")
    @ConfigurationProperties(prefix = "spring.datasource.keyan")
    public DataSource keyanDataSource(){
        return DataSourceBuilder.create().build();
    }
    /**
     * 动态数据源: 通过AOP在不同数据源之间动态切换
     * @return
     */
    @Primary
    @Bean(name = "dynamicDataSource")
    public DataSource dynamicDataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        // 默认数据源
        dynamicDataSource.setDefaultTargetDataSource(oaDataSource());
        // 配置多数据源
        Map<Object, Object> dsMap = new HashMap();
        dsMap.put("oadatasource", oaDataSource());
        dsMap.put("keyandatasource", keyanDataSource());

        dynamicDataSource.setTargetDataSources(dsMap);
        return dynamicDataSource;
    }

    /**
     * 配置@Transactional注解事物
     * @return
     */
    @Bean
    public PlatformTransactionManager transactionManager() {
        return new DataSourceTransactionManager(dynamicDataSource());
    }
}
