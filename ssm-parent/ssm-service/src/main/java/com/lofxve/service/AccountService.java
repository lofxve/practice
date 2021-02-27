package com.lofxve.service;

import com.lofxve.domain.Account;

import java.util.List;

/**
 * @ClassName AccountService
 * @Author lofxve
 * @Date 2021/1/11 22:05
 * @Version 1.0
 */
public interface AccountService {
    List<Account> findAll();

//    void save(Account account);
//
//    Account findById(Integer aid);
//
//    void update(Account account);
//
//
//    void delete(Integer aid);
}