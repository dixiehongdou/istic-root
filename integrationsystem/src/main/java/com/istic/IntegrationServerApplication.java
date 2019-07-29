package com.istic;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.istic.dao")
@EnableFeignClients
public class IntegrationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntegrationServerApplication.class, args);
    }


}



