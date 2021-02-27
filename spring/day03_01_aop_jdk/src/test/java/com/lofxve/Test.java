package com.lofxve;

import com.lofxve.config.SpringConfig;
import com.lofxve.domin.Account;
import com.lofxve.service.AccountService;
import com.lofxve.tx.TxManager;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


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

    @Autowired
    private TxManager txManager;

    @org.junit.Test
    public void testTransfer() {
        // 增强逻辑
        InvocationHandler invocationHandler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object obj = null;
                try {
                    // 开启事务
                    txManager.begin();
                    // 执行原有方法
                    obj = method.invoke(accountService, args);
                    // 提交事务
                    txManager.commit();
                } catch (Exception e) {
                    // 回滚事务
                    txManager.rollback();
                    e.printStackTrace();
                } finally {
                    // 关闭事务
                    txManager.close();
                }

                return obj;
            }
        };
        // 创建代理对象
        AccountService invocationHandlerAccountService = (AccountService) Proxy.newProxyInstance(
                accountService.getClass().getClassLoader(),
                accountService.getClass().getInterfaces(),
                invocationHandler);
        // 调用方法
        invocationHandlerAccountService.transfer("441", "4545", 1f);

        for (Account account : invocationHandlerAccountService.findAll()) {
            System.out.println(account);
        }
    }
}