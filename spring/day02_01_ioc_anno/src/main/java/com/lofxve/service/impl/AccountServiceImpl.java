package com.lofxve.service.impl;

import com.lofxve.dao.AccountDao;
import com.lofxve.domin.Account;
import com.lofxve.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service
@Scope("prototype") // 多例
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

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

    //@PostConstruct @PreDestroy 这两个注解标注方法分别在对象的创建之后和销毁之前执行。
    @PostConstruct
    public void init() {
        System.out.println("对象创建之后");
    }

    @PreDestroy
    public void des() {
        System.out.println("对象销毁之前");
    }
}
