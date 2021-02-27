package com.lofxve.task.task01.test04;

/**
 * @ClassName Computer
 * @Author 魏振东
 * @Date 2020/12/13 19:00
 */
public class Computer implements Fun{

    @Override
    public void start() {
        System.out.println("电脑开机");
    }

    @Override
    public void shutdown() {
        System.out.println("电脑关机");
    }

    @Override
    public void playgame() {
        System.out.println("电脑玩游戏");
    }
}