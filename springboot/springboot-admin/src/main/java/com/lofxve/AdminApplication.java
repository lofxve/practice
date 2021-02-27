package com.lofxve;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName AdminApplication
 * @Author lofxve
 * @Date 2021/1/18 20:30
 * @Version 1.0
 */
@SpringBootApplication
@EnableAdminServer//开启服务支持
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
    }
}