package com.lofxve;

import com.lofxve.dao.AccountDao;
import com.lofxve.domain.Account;
import com.lofxve.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName com.lofxve.DaoTest
 * @Author lofxve
 * @Date 2021/1/12 10:19
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:ApplicationContext-*.xml")
public class DaoTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void test() {
        for (Account account : accountService.findAll()) {
            System.out.println(account);
        }
    }
}