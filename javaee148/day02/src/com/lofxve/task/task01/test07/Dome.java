package com.lofxve.task.task01.test07;

/**
 * @ClassName Dome
 * @Author 魏振东
 * @Date 2020/12/13 19:37
 */
public class Dome {
    public static void main(String[] args) {
        Phone phone = new Phone() {
            @Override
            public void call() {
                System.out.println("新手机打电话");
            }

            @Override
            public void sendMessage() {
                System.out.println("旧手机发短信");
            }
        };
        phone.call();
        phone.sendMessage();
    }
}