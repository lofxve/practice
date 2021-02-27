package com.lofxve.controller;

import com.lofxve.config.UserConfig;
import com.lofxve.domain1.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName IndexController
 * @Author lofxve
 * @Date 2021/1/17 8:56
 * @Version 1.0
 */
@Controller
public class IndexController {

    @ResponseBody
    @RequestMapping("/index")
    public String dome01() {
        return "Hello SpringBoot!";
    }


//        方式一: Environment（了解）
//        此对象是Spring框架提供的，用来表示整个应用运行时的环境，可以读取配置文件中的属性值并逐个注入到Bean对象的对应属性中
    @Autowired
    private Environment environment;
//        方式二: @Value
//        此注解是Spring框架提供的，用来读取配置文件中的属性值并逐个注入到Bean对象的对应属性中
    @Value("${sms.username}")
    private String username;
    @Value("${sms.password}")
    private String password;

//        方式三: @Configuration
//        此注解是SpringBoot框架提供的，用来快速、方便地将配置文件中的自定义属性值批量注入到某个Bean对象的多个对应属性中
    @Autowired
    private UserConfig userConfig;
    @ResponseBody
    @RequestMapping("/index01")
    public String dome02() {
//        方式一: Environment（了解）
//        此对象是Spring框架提供的，用来表示整个应用运行时的环境，可以读取配置文件中的属性值并逐个注入到Bean对象的对应属性中
        System.out.println(environment.getProperty("sms.username") + "====>" + environment.getProperty("sms.password"));
//        方式二: @Value
//        此注解是Spring框架提供的，用来读取配置文件中的属性值并逐个注入到Bean对象的对应属性中
        System.out.println(username + "====>" + password);
//        方式三: @Configuration
//        此注解是SpringBoot框架提供的，用来快速、方便地将配置文件中的自定义属性值批量注入到某个Bean对象的多个对应属性中
        System.out.println(userConfig.getUsername() + "====>" + userConfig.getPassword());
        return "Hello SpringBoot!";
    }

    @RequestMapping("/index02")
    public String dome03(HttpServletRequest request) {
        //1. 模拟数据
        List<User> users = new ArrayList<User>();
        users.add(new User(1, "张三", "admin"));
        users.add(new User(2, "李四", "admin"));
        users.add(new User(3, "王五", "admin"));
        users.add(new User(4, "赵六", "admin"));
        users.add(new User(5, "孙七", "admin"));
        users.add(new User(6, "钱八", "admin"));

        //2 放入request域
        request.setAttribute("users", users);

        //3. 页面转发
        return "user_list";
    }
}