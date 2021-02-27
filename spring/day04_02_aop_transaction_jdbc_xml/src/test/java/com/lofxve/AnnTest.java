package com.lofxve;

import com.lofxve.domin.Account;
import com.lofxve.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @ClassName AnnTest
 * @Author lofxve
 * @Date 2021/1/8 21:42
 * @Version 1.0
 */
public class AnnTest {

    @org.junit.Test
    public void test(){
        ApplicationContext act = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        AccountService accountService = act.getBean(AccountService.class);
        accountService.transfer(2,3,1f);
        List<Account> all = accountService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }
}