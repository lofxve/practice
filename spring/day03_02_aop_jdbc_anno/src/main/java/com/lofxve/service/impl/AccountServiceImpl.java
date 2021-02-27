package com.lofxve.service.impl;

import com.lofxve.dao.AccountDao;
import com.lofxve.domin.Account;
import com.lofxve.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AccountServiceImpl
 * @Author lofxve
 * @Date 2021/1/5 16:16
 * @Version 1.0
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public void save(Account account) {
        accountDao.save(account);
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public Account findById(Integer integer) {
        return accountDao.findById(integer);
    }

    public void deleteByID(Integer integer) {
        accountDao.deleteByID(integer);
    }

    public void update(Account account) {
        accountDao.update(account);
    }
}