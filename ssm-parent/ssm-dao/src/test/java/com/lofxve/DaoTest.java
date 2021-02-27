package com.lofxve;

import com.lofxve.dao.AccountDao;
import com.lofxve.domain.Account;
import com.sun.media.sound.SoftTuning;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName DaoTest
 * @Author lofxve
 * @Date 2021/1/12 10:19
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext-dao.xml")
public class DaoTest {
    @Autowired
    private AccountDao accountDao;

    @Test
    public void test() {
        for (Account account : accountDao.findAll()) {
            System.out.println(account);
        }
    }
}