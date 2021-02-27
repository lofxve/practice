package com.lofxve.dao.impl;

import com.lofxve.dao.AccountDao;
import com.lofxve.domin.Account;
import com.lofxve.tx.TxManager;
import com.sun.media.sound.SoftTuning;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName AccountDaoImpl
 * @Author lofxve
 * @Date 2021/1/2 22:34
 * @Version 1.0
 */
@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private QueryRunner queryRunner;

    @Autowired
    private TxManager txManager;

    public void save(Account account) {
        try {
            queryRunner.update(txManager.getConnection(),"insert into account value(NULL ,?,?)", account.getName(), account.getBalane());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Account> findAll() {
        try {
            return queryRunner.query(txManager.getConnection(),"select * from account", new BeanListHandler<Account>(Account.class));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public Account findByName(String name) {
        try {
            return queryRunner.query(txManager.getConnection(),"select aid,account.name,balane from account where name = ?", new BeanHandler<Account>(Account.class), name);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public void update(Account account) {
        try {
            queryRunner.update(txManager.getConnection(),"update account set balane = ? where name = ?", account.getBalane(), account.getName());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void deleteByName(String name) {
        try {
            queryRunner.update(txManager.getConnection(),"delete from account where name = ?", name);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}