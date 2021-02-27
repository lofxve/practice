package com.lofxve.classtest.arraysdome;


import java.util.Arrays;

/**
 * @ClassName ArraysDome
 * @Author 魏振东
 * @Date 2020/12/14 15:55
 */
public class ArraysDome {
    public static void main(String[] args) {
        char[] chars = {'i', 't', 'c', 'a', 's', 'a'};

        /**
         *  参数升序排序
         **/
        Arrays.sort(chars);

        /**
         *  char 数组转 string
         **/
        System.out.println(Arrays.toString(chars));

        /**
         *  char 转 string
         **/
        System.out.println(new String(chars));
    }
}