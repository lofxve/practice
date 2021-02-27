package com.lofxve;

import com.lofxve.config.SpringConfig;
import com.lofxve.domin.Account;
import com.lofxve.service.AccountService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName AnnTest
 * @Author lofxve
 * @Date 2021/1/8 21:42
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AnnTest {

    @Autowired
    private AccountService accountService;

    @org.junit.Test
    public void test(){
        List<Account> all = accountService.findAll();
        accountService.transfer(2,3,1f);
        for (Account account : all) {
            System.out.println(account);
        }
    }

}