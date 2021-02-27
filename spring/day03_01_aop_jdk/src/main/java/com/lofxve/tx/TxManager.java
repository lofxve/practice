package com.lofxve.tx;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @ClassName TxManager
 * @Author lofxve
 * @Date 2021/1/8 20:30
 * @Version 1.0
 */
@Component
public class TxManager {

    @Autowired
    private DruidDataSource druidDataSourc;
    
    // 本地集合临时存储连接对象的集合
    ThreadLocal<Connection> th = new ThreadLocal<Connection>();
    
    // 获取链接
    public Connection getConnection() throws SQLException {
        Connection connection = th.get();
        if (connection == null) {
            connection = druidDataSourc.getConnection();
            th.set(connection);
        }
        return connection;
    }
    //开启事务
    public void begin() {
        try {
            getConnection().setAutoCommit(false);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //提交事务
    public void commit() {
        try {
            getConnection().commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //回滚事务
    public void rollback() {
        try {
            getConnection().rollback();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //关闭事务
    public void close() {
        try {
            getConnection().close();
            th.remove();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}