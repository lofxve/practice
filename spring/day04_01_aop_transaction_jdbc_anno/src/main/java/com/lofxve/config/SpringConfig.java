package com.lofxve.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName SpringConfig
 * @Author lofxve
 * @Date 2021/1/8 21:40
 * @Version 1.0
 */
@ComponentScan("com.lofxve")
@Import(DbConfig.class)
//@EnableAspectJAutoProxy // 激活切面自动代理
@EnableTransactionManagement // 启用事务管理
public class SpringConfig {
    @Bean
    public DataSourceTransactionManager transactionManager(@Qualifier("druidDataSource") DruidDataSource druidDataSource) {
        // 创建数据源事务管理器
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        // 配置数据源
        transactionManager.setDataSource(druidDataSource);
        return transactionManager;
    }
}