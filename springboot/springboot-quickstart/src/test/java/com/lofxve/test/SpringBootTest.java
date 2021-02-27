package com.lofxve.test;

import com.lofxve.domain1.User;
import com.lofxve.mapper.UserMapper;
import com.lofxve.sms.autoconfigure.SmsTemplate;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName SpringBootTest
 * @Author lofxve
 * @Date 2021/1/17 10:03
 * @Version 1.0
 */
// 主类包下面
@Slf4j
@org.springframework.boot.test.context.SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringBootTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void findAllUser() {
        List<User> userList = userMapper.findAll();
        for (User user : userList) {
            log.info(user.toString());
        }
    }

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void rdeisTest() {
        // 从缓存中获取数据
        List<User> userList = (List<User>) redisTemplate.opsForValue().get("users");
        // 如果缓存中不存在数据，则从数据库中查找
        if (userList == null) {
            System.out.println("从数据库查询");
            userList = userMapper.findAll();
            redisTemplate.opsForValue().set("users", userList);
        }
        // 数据展示
        for (User user : userList) {
            System.out.println(user);
        }
    }
    @Autowired
    private SmsTemplate smsTemplate;
    @Test
    public void starterTest(){
        smsTemplate.send();
    }

}