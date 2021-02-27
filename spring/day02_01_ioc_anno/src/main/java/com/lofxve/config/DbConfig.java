package com.lofxve.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName DbConfig
 * @Author lofxve
 * @Date 2021/1/5 23:27
 * @Version 1.0
 */
@Configuration // 被此注解标注的类,会被Spring认为是配置类
@PropertySource("db.properties") // 用于引入其它的properties配置文件
public class DbConfig {
    @Value("${jdbc.driver}") // bean的简单属性注入
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean("daraSource")  //该注解只能写在方法上，表明使用此方法创建一个对象
    public DruidDataSource createDruidDataSource(){
        try {
            DruidDataSource druidDataSource = new DruidDataSource();
            druidDataSource.setDriverClassName(driver);
            druidDataSource.setUrl(url);
            druidDataSource.setUsername(username);
            druidDataSource.setPassword(password);
            return druidDataSource;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Bean
    public QueryRunner createQueryRunner(@Qualifier("daraSource")DruidDataSource druidDataSource){
        return new QueryRunner(druidDataSource);
    }
}