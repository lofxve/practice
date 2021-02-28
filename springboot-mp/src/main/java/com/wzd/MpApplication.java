package com.wzd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName MpApplication
 * @Author lofxve
 * @Date 2021/1/29 18:40
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.wzd.mapper")
public class MpApplication {
    public static void main(String[] args) {
        SpringApplication.run(MpApplication.class, args);
    }
}