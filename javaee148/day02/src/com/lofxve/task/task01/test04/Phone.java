package com.lofxve.task.task01.test04;

/**
 * @ClassName Phone
 * @Author 魏振东
 * @Date 2020/12/13 18:56
 */
public class Phone implements Fun{

    @Override
    public void start() {
        System.out.println("手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("手机关机");
    }

    @Override
    public void playgame() {
        System.out.println("手机玩游戏");
    }
}