package com.lofxve.dao;

import com.lofxve.domin.Account;

import java.util.List;

public interface AccountDao {

    void save(Account account);

    List<Account> findAll();

    Account findById(Integer integer);

    void deleteByID(Integer integer);

    void update(Account account);
}