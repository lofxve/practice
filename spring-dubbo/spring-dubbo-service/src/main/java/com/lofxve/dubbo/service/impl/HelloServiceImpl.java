package com.lofxve.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lofxve.dubbo.service.HelloService;

/**
 * @ClassName HelloServiceImpl
 * @Author lofxve
 * @Date 2021/1/20 18:44
 * @Version 1.0
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello," + name;
    }
}