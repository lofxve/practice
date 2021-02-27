package com.lofxve;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

/**
 * @ClassName DruidApplication
 * @Author lofxve
 * @Date 2021/1/20 21:32
 * @Version 1.0
 */
@Slf4j
@SpringBootApplication
public class DruidApplication implements CommandLineRunner {
    @Autowired
    private DataSource dataSource;
//    @Autowired
//    private JdbcTemplate jdbcTemplate;

    public static void main(String[] args) {
        SpringApplication.run(DruidApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info(dataSource.toString());
    }
}