package com.istic.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: sunwy
 * @Date: 2019/7/31 16:00
 */
@Configuration
@ConfigurationProperties(prefix = "sso")
@Data
public class SSOConfig {
    //oa系统单点登录url
    private String oaLoginUrl;
    //邮件系统登录地址
    private String mailLoginUrl;
    //科研系统单点登录url
    private String keyanLoginUrl;
}
