package com.lofxve.test;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lofxve.domain1.User;
import com.lofxve.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName Test
 * @Author lofxve
 * @Date 2021/1/18 8:57
 * @Version 1.0
 */
@Slf4j
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class Test {
    @Autowired
    private UserMapper userMapper;

    @org.junit.Test
    public void test() {
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123");
        userMapper.insert(user);
    }

    @org.junit.Test
    public void test1() {
        User user = userMapper.selectById(1L);
        System.out.println(user);
        log.info(user.toString());
    }

    @org.junit.Test
    public void test2() {
//        设置查询条件
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
//        id>1
        userQueryWrapper.gt("id", 1).groupBy("id","username");
//        userQueryWrapper.eq("username", "张三");
//        userQueryWrapper.like("password", "admin");
//        userQueryWrapper.likeLeft("password", "admin");
//        userQueryWrapper.between("id", 1, 3);
//        userQueryWrapper.in("id", Arrays.asList(1, 2, 3, 4, 5 ));

//        执行查询
        List<User> userList = userMapper.selectList(userQueryWrapper);
//        查看结果
        userList.forEach(e -> {
            log.info(e.toString());
        });
    }
}