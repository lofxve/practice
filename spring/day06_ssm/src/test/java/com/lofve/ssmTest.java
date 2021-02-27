package com.lofve;

import com.lofxve.dao.AccountDao;
import com.lofxve.domain.Account;
import com.lofxve.service.AccountService;
import com.sun.media.sound.SoftTuning;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName ssmTest
 * @Author lofxve
 * @Date 2021/1/11 21:37
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:ApplicationContext.xml")
public class ssmTest {
    @Autowired
    private AccountService accountService;

    @Test
    public void springTest(){
        List<Account> all = accountService.findAll();
        if (all != null) {
            for (Account account : all) {
                System.out.println(account);
            }
        }
    }

    @Test
    public void mybatisTest() throws IOException {
        //1. 读取配置文件,将文件读成一个输入流
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");

        //2. 创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //3. 获取sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //4. 获取dao的代理对象,可以操作
        AccountDao accountDao = sqlSession.getMapper(AccountDao.class);
        List<Account> accounts = accountDao.findAll();
        for (Account account : accounts) {
            System.out.println(account);
        }

        //5. 提交事务
        sqlSession.commit();

        //6. 释放资源
        sqlSession.close();
    }
}