package com.lofxve.dao.impl;

import com.lofxve.dao.AccountDao;
import com.lofxve.domin.Account;
import com.sun.media.sound.SoftTuning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName AccountServiceImpl
 * @Author lofxve
 * @Date 2021/1/5 16:16
 * @Version 1.0
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(Account account) {
        jdbcTemplate.update("insert into account value(NULL ,?,?)", account.getName(), account.getBalane());
    }

    public List<Account> findAll() {
        return jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));

    }

    public Account findById(Integer integer) {
        return jdbcTemplate.queryForObject("select * from account where aid = ?", new BeanPropertyRowMapper<Account>(Account.class), integer);
    }

    public void deleteByID(Integer integer) {
        jdbcTemplate.update("delete from account where aid = ?", integer);
    }

    public void update(Account account) {
        jdbcTemplate.update("update account set balane = ? where aid = ?", account.getBalane(), account.getAid());
    }
}