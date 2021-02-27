package com.lofxve.controller;

import com.lofxve.domain.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName UserController
 * @Author lofxve
 * @Date 2021/2/12 12:46
 * @Version 1.0
 */
@RestController
public class UserController {

    //模拟从数据库查询
    private static ArrayList<User> list = new ArrayList<User>();

    static {
        list.add(new User("张三", "123"));
        list.add(new User("李四", "123"));
    }

    //查询所有
    @Cacheable(value = "tanhua", key = "'user'")
    @RequestMapping("/findAll")
    public List<User> findAll() {
        System.out.println("从数据库中查询数据.............");
        return list;
    }

    //更新
    @CacheEvict(value = "tanhua",allEntries = true)
    @RequestMapping("/save")
    public String save() {
        System.out.println("从数据库中保存.............");
        list.add(new User("王五", "123"));
        return "OK";
    }


    //分页查询
    @RequestMapping("/findByPage")
    @Cacheable(value = "tanhua", key = "'user'+#pageNum+'_'+#pageSize")
    public List<User> findByPage(Integer pageNum, Integer pageSize) {
        System.out.println("从数据库中查询数据,第" + pageNum + "页,每页" + pageSize + "条");
        return list;
    }
}