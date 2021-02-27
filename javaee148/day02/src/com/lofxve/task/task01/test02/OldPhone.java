package com.lofxve.task.task01.test02;

/**
 * @ClassName OldPhone
 * @Author 魏振东
 * @Date 2020/12/13 18:28
 */
public class OldPhone extends Phone{
    @Override
    public void call() {
        System.out.println("旧手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("旧手机发信息");
    }
}