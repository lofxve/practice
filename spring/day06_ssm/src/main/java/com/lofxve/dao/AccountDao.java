package com.lofxve.dao;

import org.apache.ibatis.annotations.Param;

import com.lofxve.domain.Account;

import java.util.List;

/**
 * @ClassName AccountDao
 * @Author lofxve
 * @Date 2021/1/11 17:59
 * @Version 1.0
 */
public interface AccountDao {

    List<Account> findAll();

    void save(Account account);

    Account findById(Integer aid);

    void update(Account account);

    void delete(Integer aid);
}