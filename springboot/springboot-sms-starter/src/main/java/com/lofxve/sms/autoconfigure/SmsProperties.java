package com.lofxve.sms.autoconfigure;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName SmsProperties
 * @Author lofxve
 * @Date 2021/1/18 11:19
 * @Version 1.0
 */
@Data
@ConfigurationProperties(
        prefix = "sms"
)
public class SmsProperties {
    private String username;
    private String password;
}