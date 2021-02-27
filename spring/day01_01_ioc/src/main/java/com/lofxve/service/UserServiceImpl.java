package com.lofxve.service;

import com.lofxve.dao.UserDao;
import com.lofxve.dao.impl.UserDaoImpl;
import com.lofxve.factory.BeanFactory;
import org.junit.Test;

/**
 * @ClassName UserServiceImpl
 * @Author lofxve
 * @Date 2021/1/3 19:23
 * @Version 1.0
 */
public class UserServiceImpl {
    /**
     * ioc 控制反转 就是我们不能控制对象的创建，我们需要就向ioc容器去要
     */
    @Test
    public void save1() {
        /**
         * 对象创建原始方式
         */
        UserDao userDao = new UserDaoImpl();
        userDao.save("对象创建原始方式");
    }

    @Test
    public void save2() {
        /**
         *工厂解耦 多例 浪费空间
         */
        UserDao userDao = (UserDao) BeanFactory.getBean("userDao");
        userDao.save("工厂解耦");
    }

    @Test
    public void save3(){
        /**
         *优化工厂 单例
         *对象直接从工厂中获取，不需要自己new，直接向工厂要
         */
        UserDao userDao = (UserDao) BeanFactory.getBean("userDao");
        userDao.save("优化工厂");
    }

}