package com.lofxve.task.task01.test02;

/**
 * @ClassName NewPhone
 * @Author 魏振东
 * @Date 2020/12/13 18:29
 */
public class NewPhone extends Phone implements Play{

    @Override
    public void call() {
        System.out.println("新手机打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("新手机发信息");
    }

    @Override
    public void playGame() {
        System.out.println("新手机玩游戏");
    }
}