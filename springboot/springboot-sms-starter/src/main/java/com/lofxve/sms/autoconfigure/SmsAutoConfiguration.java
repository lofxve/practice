package com.lofxve.sms.autoconfigure;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName SmsAutoConfiguration
 * @Author lofxve
 * @Date 2021/1/18 11:17
 * @Version 1.0
 */
@Configuration
@EnableConfigurationProperties({SmsProperties.class})
public class SmsAutoConfiguration {

    @Bean
    public SmsTemplate smsTemplate(SmsProperties smsProperties) {
        SmsTemplate smsTemplate = new SmsTemplate();
        smsTemplate.setUsername(smsProperties.getUsername());
        smsTemplate.setPassword(smsProperties.getPassword());
        return smsTemplate;
    }
}