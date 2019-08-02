package com.istic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: sunwy
 * @Date: 2019/8/1 9:46
 */
@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.istic.dao")
@EnableFeignClients
public class PayServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayServerApplication.class, args);
    }
}
