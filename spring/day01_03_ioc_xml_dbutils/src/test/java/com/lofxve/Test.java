package com.lofxve;

import com.lofxve.domin.Account;
import com.lofxve.service.AccountService;
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
    ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");

    private AccountService accountService = ac.getBean(AccountService.class);

    // 依赖set注入
//    public void setAccountService(AccountService accountService) {
//        this.accountService = accountService;
//    }

    @org.junit.Test
    public void testFindAll() {
        List<Account> all = accountService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }

    @org.junit.Test
    public void testSave() {
        Account account = new Account();
        account.setName("4545");
        account.setBalance(12.56d);
        accountService.save(account);
    }

}