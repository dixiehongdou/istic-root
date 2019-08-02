package com.istic.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: sunwy
 * @Date: 2019/8/2 18:56
 */
@Configuration
@ConfigurationProperties(prefix = "spring")
@Data
public class RedisConfig {
    private int port;
    private  String ip;
    private String password;
}
