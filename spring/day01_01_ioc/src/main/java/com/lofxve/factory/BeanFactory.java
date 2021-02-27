package com.lofxve.factory;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * @ClassName BeanFactory
 * @Author lofxve
 * @Date 2021/1/3 19:27
 * @Version 1.0
 */
public class BeanFactory {

    static Map<String, Object> map = new HashMap<String, Object>();

    /**
     * 优化工厂
     * 一次性创建所有配置文件中的类，需要的用的时候直接获取响应的对象
     * 单例
     */
    public static Object getBean(String beanId) {
        return map.get(beanId);
    }

    static {
        try {
            // 读取配置文件
            ResourceBundle resourceBundle = ResourceBundle.getBundle("beans");
            // 获取所有key
            Enumeration<String> keys = resourceBundle.getKeys();
            // 遍历key
            while (keys.hasMoreElements()) {
                // 获取当前name
                String name = keys.nextElement();

                // 根据name 获取 classname
                String classname = resourceBundle.getString(name);

                // 反射获取class对象
                Class clazz = Class.forName(classname);

                // 根据class对象创建类，放入map中
                map.put(name, clazz.newInstance());
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }


    /**
     * 工厂解耦
     * 创建需要的对象
     * 多例
     */
    /*public static Object getBean(String beanId) {
        try {
            // 读取配置文件
            ResourceBundle resourceBundle = ResourceBundle.getBundle("beans");

            // 获取classname，类的全限定名
            String classname = resourceBundle.getString(beanId);

            // 获取全限定名的class
            Class clazz = Class.forName(classname);

            // 创建对象
            return clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }*/
}