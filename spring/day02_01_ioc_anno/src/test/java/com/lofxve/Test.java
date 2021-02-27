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
 * @ClassName Test
 * @Author lofxve
 * @Date 2021/1/2 22:57
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class) // 将junit运行期切换成Spring运行器
@ContextConfiguration(classes = SpringConfig.class) // 向Spring的运行器传递配置类，Spring运行期就会自动启动spring容器
public class Test {

    @Autowired
    private AccountService accountService;

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