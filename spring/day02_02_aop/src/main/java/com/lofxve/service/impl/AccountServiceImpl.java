package com.lofxve.service.impl;

import com.lofxve.dao.AccountDao;
import com.lofxve.domin.Account;
import com.lofxve.service.AccountService;
import com.lofxve.tx.TxManager;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    @Autowired
    private TxManager txManager;

    public void transfer(String name, String name1, float d) {
        try {
            // 开启事务
            txManager.begin();
            Account byName = accountDao.findByName(name);
            Account byName1 = accountDao.findByName(name1);

            byName.setBalane(byName.getBalane() - d);
            byName1.setBalane(byName1.getBalane() + d);

            accountDao.update(byName);
            accountDao.update(byName1);
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
    }

    public void save(Account account) {
        accountDao.save(account);
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public Account findByName(String name) {
        return accountDao.findByName(name);
    }

    public void update(Account account) {
        accountDao.update(account);
    }

    public void deleteByName(String name) {
        accountDao.deleteByName(name);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
}
