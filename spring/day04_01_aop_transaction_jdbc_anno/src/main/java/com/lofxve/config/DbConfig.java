package com.lofxve.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @ClassName DbConfig
 * @Author lofxve
 * @Date 2021/1/8 21:31
 * @Version 1.0
 */
@Component
@PropertySource("db.properties")
public class DbConfig {
    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;

    @Bean("druidDataSource")
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
    public JdbcTemplate createJdbcTemplate(@Qualifier("druidDataSource") DruidDataSource druidDataSource){
      return new JdbcTemplate(druidDataSource);
    }
}