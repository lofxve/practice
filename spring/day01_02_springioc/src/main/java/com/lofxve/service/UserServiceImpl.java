package com.lofxve.service;

import com.lofxve.dao.UserDao;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName UserServiceImpl
 * @Author lofxve
 * @Date 2021/1/3 19:23
 * @Version 1.0
 */
public class UserServiceImpl {
    /**
     * 一个方法
     *      getBean
     *          getBean("id")                     使用bean的id从容器中查找对象
     * 	        getBean(Bean.class)           使用bean的class类型从容器中查找对象
     * 	        getBean("id", Bean.class)   使用bean的id 和 class类型从容器中查找对象
     * 两个接口
     *      BeanFactory
     *          这是SpringIOC容器的顶级接口，它定义了SpringIOC的最基础的功能，但是其功能比较简单，一般面向Spring自身使用
     * 	        BeanFactroy在第一次使用到某个Bean时(调用getBean())，才对该Bean进行加载实例化
     *      ApplicationContext
     *          这是在BeanFactory的子接口，它扩展了BeanFactory的功能，一般面向程序员使用
     * 	        ApplicationContext是在容器启动时，一次性创建并加载了所有的Bean
     * 	   上面两种方式创建的对象都是单例，只是创建对象的时机不同
     * 三个方法
     *      - ClassPathXmlApplicationContext         读取类路径下的xml作为配置文件
     * 	    - FileSystemXmlApplicationContext        读取本地目录下的xml作为配置文件
     * 	    - AnnotationConfigApplicationContext     读取一个注解配置作为配置文件
     *
     * 两种依赖注入方式:构造方法、set注入
     * 三种对象创建方式：new，静态工厂，实例化工厂
     * 五种bean作用范围：singleton、prototype、request、session、globalSession
     */
    @Test
    public void save(){
        // 读取配置文件，创建spring的ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // 从容器中获取对象
        UserDao userDao = applicationContext.getBean("userDao", UserDao.class);

        // 调用对象的方法
        userDao.save("Spring Ioc 容器创建对象");
    }
}