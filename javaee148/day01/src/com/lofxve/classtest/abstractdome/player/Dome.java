package com.lofxve.classtest.abstractdome.player;

/**
 * @ClassName Dome
 * @Author 魏振东
 * @Date 2020/12/11 15:22
 */
public class Dome {
    public static void main(String[] args) {
        lanqiuPlayer lanqiuPlayer = new lanqiuPlayer();
        lanqiuPlayer.setName("1q");
        lanqiuPlayer.setAge("2");
        lanqiuPlayer.setSex("3");
        lanqiuPlayer.setBallage("4");
        lanqiuPlayer.work();

        lanqiujiaolian lanqiujiaolian = new lanqiujiaolian();
        lanqiujiaolian.setName("1");
        lanqiujiaolian.setAge("2");
        lanqiujiaolian.setSex("3");
        lanqiujiaolian.setBallage("4");
        lanqiujiaolian.work();

        pingpangPlayer pingpangPlayer = new pingpangPlayer();
        pingpangPlayer.setName("1");
        pingpangPlayer.setAge("2");
        pingpangPlayer.setSex("3");
        pingpangPlayer.setBallage("4");
        pingpangPlayer.work();

        pingpangjiaolian pingpangjiaolian = new pingpangjiaolian();
        pingpangjiaolian.setName("1");
        pingpangjiaolian.setAge("2");
        pingpangjiaolian.setSex("3");
        pingpangjiaolian.setBallage("4");
        pingpangjiaolian.work();

    }
}