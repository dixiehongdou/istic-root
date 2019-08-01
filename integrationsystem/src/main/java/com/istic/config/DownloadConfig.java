package com.istic.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: sunwy
 * @Date: 2019/8/1 15:39
 */
@Configuration
@ConfigurationProperties(prefix = "download")
@Data
public class DownloadConfig {
    //下载链接域名
    private  String downloadUrl;
}
