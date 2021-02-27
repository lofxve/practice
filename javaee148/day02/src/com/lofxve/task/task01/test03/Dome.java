package com.lofxve.task.task01.test03;

/**
 * @ClassName Dome
 * @Author 魏振东
 * @Date 2020/12/13 18:33
 */
public class Dome {
    public static void main(String[] args) {
        new Smoke(){
            @Override
            public void smoking() {
                System.out.println("抽烟学生");
            }
        }.smoking();

    }
}