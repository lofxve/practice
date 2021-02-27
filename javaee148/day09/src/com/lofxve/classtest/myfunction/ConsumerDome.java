package com.lofxve.classtest.myfunction;

import java.util.function.Consumer;

/**
 * @ClassName ConsumerDome
 * @Author lofxve
 * @Date 2020/12/22 11:54
 */
public class ConsumerDome {
    /**
     * Consumer接口的泛型使用什么类型,就可以使用accept方法消费(使用)一个什么类型的
     **/
    public static void main(String[] args) {
        method(o->{
            Integer integer = Integer.valueOf(o);
            System.out.println(integer*2);
        },"23");
    }
    public static void method(Consumer<String> con,String string){
        con.accept(string);
    }
}