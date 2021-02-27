package com.lofxve.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

/**
 * @ClassName SpringConfig
 * @Author lofxve
 * @Date 2021/1/8 21:40
 * @Version 1.0
 */
@ComponentScan("com.lofxve")
@Import(DbConfig.class)
@EnableAspectJAutoProxy // 激活切面自动代理
public class SpringConfig {
}