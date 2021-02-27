package com.lofxve.service.impl;

import com.lofxve.dao.AccountDao;
import com.lofxve.domain.Account;
import com.lofxve.service.AccountService;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AccountServiceIml
 * @Author lofxve
 * @Date 2021/1/11 22:06
 * @Version 1.0
 */
@Service
public class AccountServiceIml implements AccountService {
    // TODO: 2021/1/11 等待spring和mybatis整合
    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        return accountDao.findAll();
//        System.out.println("查询所有...");
//        return null;
    }

    public void save(Account account) {
        accountDao.save(account);
    }

    public Account findById(Integer aid) {
        return accountDao.findById(aid);
    }

    public void update(Account account) {
        accountDao.update(account);
    }

    public void delete(Integer aid) {
        accountDao.delete(aid);
    }
}