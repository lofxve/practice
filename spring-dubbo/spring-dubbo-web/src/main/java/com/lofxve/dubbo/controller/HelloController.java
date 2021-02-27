package com.lofxve.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lofxve.dubbo.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HelloController
 * @Author lofxve
 * @Date 2021/1/20 18:50
 * @Version 1.0
 */
@Controller
public class HelloController {
    @Reference
    private HelloService helloService;

    @ResponseBody
    @RequestMapping("sayHello")
    public String sayHello(String name) {
        return helloService.sayHello(name);
    }
}