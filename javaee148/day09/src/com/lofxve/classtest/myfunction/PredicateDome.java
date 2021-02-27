package com.lofxve.classtest.myfunction;

import java.util.function.Predicate;

/**
 * @ClassName PredicateDome
 * @Author lofxve
 * @Date 2020/12/22 11:57
 */
public class PredicateDome {
    /**
     *  Predicate接口的泛型使用什么类型,就可以使用test方法判断数据是否满足要求
     **/
    public static void main(String[] args) {
        method(o->{
            Integer integer = Integer.valueOf(o);
            return integer>5;
        },"22");
    }
    public static void method(Predicate<String> pre, String string){
        boolean test = pre.test(string);
        System.out.println(test);
    }
}