package com.lofxve.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lofxve.domain1.User;
import com.lofxve.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName IndexController
 * @Author lofxve
 * @Date 2021/1/18 20:23
 * @Version 1.0
 */
@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/index")
    @ResponseBody
    public List<User> index() {
        List<User> userList = userMapper.selectList(new QueryWrapper<User>());

        return userList;
    }
}