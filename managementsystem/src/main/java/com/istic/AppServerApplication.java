package com.istic;

import com.istic.constants.FormNoTypeEnum;
import com.istic.service.FormNoGenerateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.istic.dao")
public class AppServerApplication implements  CommandLineRunner{

    @Autowired
    FormNoGenerateService formNoGenerateService;

    public static void main(String[] args) {
        SpringApplication.run(AppServerApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        String s1 = formNoGenerateService.generateFormNo(FormNoTypeEnum.HY_ORDER);
        String s2 = formNoGenerateService.generateFormNo(FormNoTypeEnum.QJ_ORDER);
        System.out.println(s1);
        System.out.println(s2);
    }
}



