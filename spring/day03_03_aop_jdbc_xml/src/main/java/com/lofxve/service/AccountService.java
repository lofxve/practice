package com.lofxve.service;

import com.lofxve.domin.Account;

import java.util.List;

public interface AccountService {

    void save(Account account);

    List<Account> findAll();

    Account findById(Integer integer);

    void deleteByID(Integer integer);

    void update(Account account);
}