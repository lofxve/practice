package com.lofxve.dubbo.controller;

import com.lofxve.dubbo.service.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName HelloController
 * @Author lofxve
 * @Date 2021/1/20 19:26
 * @Version 1.0
 */
@Controller
public class HelloController {
    @Reference
    private HelloService helloService;

    @ResponseBody
    @RequestMapping("/say")
    public String sayHello(String name){
        return helloService.sayHello(name);
    }
}