package com.lofxve;

import com.lofxve.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName com.lofxve.MongoTest
 * @Author lofxve
 * @Date 2021/2/8 17:22
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class MongoTest {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void testSave() {
        for (int i = 0; i < 10; i++) {
            User hrb = User.builder().username("张三" + i).age(18 + i).address("hrb").build();
            mongoTemplate.save(hrb);
            System.out.println(hrb.getId());
        }
    }

    @Test
    public void findById() {
        User byId = mongoTemplate.findById("602103d14442e10ba4d7c83d", User.class);
        System.out.println(byId);
    }

    @Test
    public void findAll() {
        List<User> all = mongoTemplate.findAll(User.class);
        for (User user : all) {
            System.out.println(user);
        }
    }

    @Test
    public void update() {
        //1. 设置更新条件 where
        Query query = new Query(
                Criteria.where("username").is("张三").and("age").gt(1)
        );

        //2. 设置要更新的字段 set
        Update update = new Update();
        update.set("age", 12);
        update.set("address", "北京昌平");

        //3. 执行更新
        mongoTemplate.updateFirst(query, update, User.class);
    }

    //删除 delete from user where age=12 and address="昌平"
    @Test
    public void testDelete() {
        //1. 设置删除条件 where
        Query query = new Query(
                Criteria.where("age").is(12).and("address").is("北京昌平")
        );

        //2. 执行更新
        mongoTemplate.remove(query, User.class);
    }

    //条件查询(分页 排序)
    @Test
    public void testFindByCondition() {
        //1. 设置查询条件 where
        Query query = new Query(
                Criteria.where("age").gt(19)
        ).with(Sort.by(Sort.Order.desc("age")))//order by age desc
                .skip(0).limit(3);//limit 0,3

        //2. 执行更新
        List<User> userList = mongoTemplate.find(query, User.class);
        for (User user : userList) {
            System.out.println(user);
        }
    }
}