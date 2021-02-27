package com.lofxve.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @ClassName Logger
 * @Author lofxve
 * @Date 2021/1/8 22:07
 * @Version 1.0
 */
@Component
@Aspect // 声明切面
public class Logger {
    // 定义一组规则, 用于在连接点中挑选切点
    @Pointcut("execution(* com.lofxve.service.impl.*.*(..))")
    public void pt(){}

    // 环绕通知是一种特殊的通知，他允许以编码的形式实现四大通知的效果
    @Around("pt()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        try {
            System.out.println("开启事务》");
            Object proceed = proceedingJoinPoint.proceed();
            System.out.println("提交事务》");
            return proceed;
        } catch (Throwable throwable) {
            System.out.println("回滚事务");
            throwable.printStackTrace();
        }finally {
            System.out.println("《关闭事务");
        }
        return null;
    }
}