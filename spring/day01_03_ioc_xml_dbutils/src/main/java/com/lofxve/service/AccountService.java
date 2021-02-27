package com.lofxve.service;

import com.lofxve.domin.Account;

import java.util.List;

/**
 * @ClassName AccountService
 * @Author lofxve
 * @Date 2021/1/2 22:52
 * @Version 1.0
 */
public interface AccountService {
    void save(Account account);

    List<Account> findAll();

    Account findByName(String name);

    void update(Account account);

    void deleteByName(String name);

}