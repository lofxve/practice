package com.lofxve.classtest.exceptiondome.register;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @ClassName RegisterDome
 * @Author lofxve
 * @Date 2020/12/20 14:35
 */
public class RegisterDome {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,"张三","李四","java","c++");

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        checkNanme(arrayList,name);
    }

    private static void checkNanme(ArrayList<String> arrayList, String name) {
        for (String s : arrayList) {
            if (name.equals(s)){
                throw new RegisterEexception("您输入的用户名{"+name+"],已经被注册了");
            }else{
                arrayList.add(name);
                System.out.println("恭喜您{"+name+"],注册成功");;
            }
        }
    }
}