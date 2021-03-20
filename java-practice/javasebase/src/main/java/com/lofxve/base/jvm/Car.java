package com.lofxve.base.jvm;

/**
 * @ClassName Car
 * @Author lofxve
 * @Date 2021/3/17 15:46
 * @Version 1.0
 */
public class Car {
    public static void main(String[] args) {
        /**
         * 类是模板，对象是具体的
         * 栈是目录，存放对象的引用，堆是文章，存放对象本身
         **/
        // 获取Class对象
        //方法一
        Class<Car> carClass = Car.class;
        //方法二
        Car car = new Car();
        Class<? extends Car> aClass = car.getClass();
        //方法三
        try {
            Class<?> aClass1 = Class.forName("com.lofxve.base.jvm");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 类加载器
        // AppClassLoader 应用程序加载器
        ClassLoader classLoader = carClass.getClassLoader();
        System.out.println("AppClassLoader=>应用程序加载器 : " + classLoader);

        // ExtClassLoader 扩展类加载器
        ClassLoader parent = classLoader.getParent();
        System.out.println("ExtClassLoader=>扩展类加载器 : " + parent);

        // null java程序获取不到  所在位置：rt.jar
        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
    }
}
