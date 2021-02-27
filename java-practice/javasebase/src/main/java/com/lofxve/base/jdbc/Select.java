package com.lofxve.base.jdbc;

import java.sql.*;

public class Select {
    public static void main(String[] args) throws SQLException {
        // JDBC连接的URL, 不同数据库有不同的格式:
        String JDBC_URL = "jdbc:mysql://localhost:3306/yht?useSSL=false&characterEncoding=utf8";
        String JDBC_USER = "root";
        String JDBC_PASSWORD = "root1";
        // 获取连接:
        try(Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)){
            String sql="select * from bmi where id=?";
//            第一步，通过Connection提供的createStatement()方法创建一个Statement对象，用于执行一个查询；
            try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                preparedStatement.setObject(1, 1); // 注意：索引从1开始
                //    第二步，执行Statement对象提供的executeQuery("SELECT * FROM students")并传入SQL语句，执行查询并获得返回的结果集，使用ResultSet来引用这个结果集；
                ResultSet resultSet = preparedStatement.executeQuery();
//            第三步，反复调用ResultSet的next()方法并读取每一行结果。
                while (resultSet.next()){
                    System.out.println(resultSet.toString());
                }
            }

        }
    }
}
