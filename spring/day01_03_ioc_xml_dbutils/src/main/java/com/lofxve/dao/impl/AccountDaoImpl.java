package com.lofxve.dao.impl;

import com.lofxve.dao.AccountDao;
import com.lofxve.domin.Account;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName AccountDaoImpl
 * @Author lofxve
 * @Date 2021/1/2 22:34
 * @Version 1.0
 */
public class AccountDaoImpl implements AccountDao {
    private QueryRunner queryRunner;

    // 依赖set注入
    public void setQueryRunner(QueryRunner queryRunner) {
        this.queryRunner = queryRunner;
    }

    public void save(Account account) {
        try {
            queryRunner.update("insert into account value(NULL ,?,?)", account.getName(), account.getBalance());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public List<Account> findAll() {
        try {
            return queryRunner.query("select * from account", new BeanListHandler<Account>(Account.class));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public Account findByName(String name) {
        try {
            return queryRunner.query("select * from account where name = ?", new BeanHandler<Account>(Account.class), name);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public void update(Account account) {
        try {
            queryRunner.update("update account set balance = ? where name = ?", account.getBalance(), account.getName());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    public void deleteByName(String name) {
        try {
            queryRunner.update("delete from account where name = ?", name);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}