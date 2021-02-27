package com.lofxve.dao;

import com.lofxve.domain.Account;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @ClassName AccountDao
 * @Author lofxve
 * @Date 2021/1/12 10:14
 * @Version 1.0
 */
public interface AccountDao {

    @Select("select * from account;")
    List<Account> findAll();
}
