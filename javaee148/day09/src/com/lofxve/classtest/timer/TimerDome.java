package com.lofxve.classtest.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName TimerDome
 * @Author lofxve
 * @Date 2020/12/18 20:43
 */
public class TimerDome {
    public static void main(String[] args) {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("哈哈");
            }
        },0,1000*30);
    }
}