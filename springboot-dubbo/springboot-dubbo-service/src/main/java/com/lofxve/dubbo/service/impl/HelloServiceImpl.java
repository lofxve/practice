package com.lofxve.dubbo.service.impl;

import com.lofxve.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @ClassName HelloServiceImpl
 * @Author lofxve
 * @Date 2021/1/20 19:21
 * @Version 1.0
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello," + name;
    }
}