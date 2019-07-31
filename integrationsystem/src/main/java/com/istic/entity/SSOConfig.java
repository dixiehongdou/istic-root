package com.istic.entity;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @Author: sunwy
 * @Date: 2019/7/31 16:00
 */
@Configuration
@ConfigurationProperties(prefix = "sso")
public  class SSOConfig {

    //oa系统单点登录url
    private  String oaLoginUrl;
    //科研系统单点登录url
    private String scientificResearchLoginUrl;

    public String getOaLoginUrl() {
        return oaLoginUrl;
    }
    public String getScientificResearchLoginUrl() {
        return scientificResearchLoginUrl;
    }


    public void setScientificResearchLoginUrl(String scientificResearchLoginUrl) {
        this.scientificResearchLoginUrl = scientificResearchLoginUrl;
    }

    public void setOaLoginUrl(String oaLoginUrl) {
        this.oaLoginUrl = oaLoginUrl;
    }
}
