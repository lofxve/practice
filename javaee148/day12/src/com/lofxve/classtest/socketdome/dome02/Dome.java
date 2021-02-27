package com.lofxve.classtest.socketdome.dome02;

public class Dome {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Client.copyOnWriteArrayList.add("第"+i+"次提交数据");
            System.out.println(i);
        }
    }
}
