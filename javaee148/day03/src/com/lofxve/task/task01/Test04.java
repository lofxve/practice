package com.lofxve.task.task01;

/**
 * @ClassName Test04
 * @Author 魏振东
 * @Date 2020/12/14 14:17
 */
public class Test04 {
    public static void main(String[] args) {
        char[] chars = {'i','t','c','a','s','a'};
        System.arraycopy(chars,1,chars,5,1);
        System.out.println(new String(chars));
    }
}