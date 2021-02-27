package com.lofxve.classtest.systemdome;

/**
 * @ClassName SystemDome
 * @Author 魏振东
 * @Date 2020/12/14 15:44
 */
public class SystemDome {
    public static void main(String[] args) {
        /**
         java.lang.System类
         System 类包含一些有用的类字段和方法。它不能被实例化(创建对象)。
         System类私有了空参数构造方法,不让我们创建对象使用
         里边提供的方法都是静态类,通过类名.方法名()可以直接使用
         常用方法:
         static void exit(int status) 终止当前正在运行的 Java 虚拟机。
         static long currentTimeMillis() 返回以毫秒为单位的当前时间。
         static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 数组复制
         */
        char[] chars = {'i', 't', 'c', 'a', 's', 'a'};

        /**
         *  数组复制
         **/
        // src 原数组
        // srcPos 原数组起始位置
        // dest 新数组
        // destPos 新数组其实位置
        // length 复制长度
        System.arraycopy(chars, 1, chars, 5, 1);
        System.out.println(new String(chars));

        /**
         * 获取系统时间的毫秒值
         **/
        System.out.println(System.currentTimeMillis());

        /**
         *  Process finished with exit code 500
         **/
        System.exit(500);
    }
}