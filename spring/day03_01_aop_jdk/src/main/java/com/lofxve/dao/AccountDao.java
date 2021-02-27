package com.lofxve.dao;

import com.lofxve.domin.Account;

import java.util.List;

public interface AccountDao {

    void save(Account account);

    List<Account> findAll();

    Account findByName(String name);

    void update(Account account);

    void deleteByName(String name);

}
