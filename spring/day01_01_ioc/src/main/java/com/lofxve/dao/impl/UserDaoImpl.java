package com.lofxve.dao.impl;

import com.lofxve.dao.UserDao;

/**
 * @ClassName UserDaoImpl
 * @Author lofxve
 * @Date 2021/1/3 19:21
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {

    @Override
    public void save(String name) {
        System.out.println("以《"+name+"》的方式创建对象....");
        System.out.println("用户保存成功..");
    }
}