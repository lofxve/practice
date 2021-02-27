package com.lofxve;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName QuickStartApplication
 * @Author lofxve
 * @Date 2021/1/17 8:58
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.lofxve.mapper")
public class QuickStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(QuickStartApplication.class, args);
    }
}