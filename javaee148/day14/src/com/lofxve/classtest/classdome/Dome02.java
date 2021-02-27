package com.lofxve.classtest.classdome;

import com.sun.media.sound.SoftTuning;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @ClassName Dome02
 * @Author lofxve
 * @Date 2020/12/31 9:48
 * @Version 1.0
 */
public class Dome02 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName("com.lofxve.classtest.classdome.Person");

        /**
         * 构造方法
         */
        // getConstructors 获取构造方法
        clazz.getConstructors();

        //getDeclaredConstructors  获取全部构造方法
        clazz.getDeclaredConstructors();

        // 空参数构造方法
        Constructor constructor1 = clazz.getConstructor();

        // 全参数构造方法
        Constructor constructor2 = clazz.getConstructor(String.class,String.class,String.class);

        // 私有带参数构造方法
        Constructor constructor3 = clazz.getDeclaredConstructor(String.class);

        /**
         * 实例化对象
         */
        // 空参数构造方法
        Object o = constructor1.newInstance();
        if (o instanceof Person){
            Person person = (Person)o;
            System.out.println("空参数构造方法");
            System.out.println(person);
        }

        // 全参数构造方法
        Object o1 = constructor2.newInstance("fx", "女", "18");
        if (o1 instanceof Person){
            Person person = (Person)o1;
            System.out.println("全参数构造方法");
            System.out.println(person);
        }
        // 私有带参数构造方法
        // 暴力反射，取消java语言访问检查
        constructor3.setAccessible(true);
        Object o3 = constructor3.newInstance("wzd");
        if (o3 instanceof Person){
            Person person = (Person)o3;
            System.out.println("不建议使用，私有带参数构造方法,暴力反射，取消java语言访问检查");
            System.out.println(person);
        }

        /**
         * 快速实例化
         */
        Object o2 = clazz.newInstance();
        System.out.println(o2);

        if (o2 instanceof Person){
            Person person = (Person)o2;
            System.out.println(person);
            person.setAge("18");
            person.setName("wzd");
            person.setSex("男");
        }
        /**
         * 获取成员方法
         */
        Method getName = clazz.getMethod("getName");
        Method setName = clazz.getMethod("setName", String.class);
        // 使用invoke执行方法
        setName.invoke(o2,"胡歌");
        Object invoke = getName.invoke(o2);
        System.out.println(invoke);
    }
}