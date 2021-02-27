package com.lofxve.sms.autoconfigure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName SmsTemplate
 * @Author lofxve
 * @Date 2021/1/18 11:18
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SmsTemplate {
    private String username;
    private String password;

    public void send(){
        System.out.println("发送短信");
    }
}