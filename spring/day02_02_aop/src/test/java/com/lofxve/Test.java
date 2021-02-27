package com.lofxve;

import com.lofxve.domin.Account;
import com.lofxve.service.AccountService;
import com.sun.media.sound.SoftTuning;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


/**
 * @ClassName Test
 * @Author lofxve
 * @Date 2021/1/2 22:57
 * @Version 1.0
 */
public class Test {

    @org.junit.Test
    public void testTransfer() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        AccountService accountService = ac.getBean(AccountService.class);

        accountService.transfer("441","4545",1f);

        for (Account account : accountService.findAll()) {
            System.out.println(account);
        }
    }
}