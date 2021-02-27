package com.lofxve.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName UserConfig
 * @Author lofxve
 * @Date 2021/1/18 17:22
 * @Version 1.0
 */
@Data
@Configuration
@ConfigurationProperties("sms")
public class UserConfig {
    @Value("${sms.username}")
    private String username;
    @Value("${sms.password}")
    private String password;
}