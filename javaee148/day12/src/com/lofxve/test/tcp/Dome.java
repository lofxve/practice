package com.lofxve.test.tcp;

public class Dome {

    public static void main(String[] args) {
        int i = 0;
        while (true) {
            Clicent.copyOnWriteArrayList.add("第" + i++ + "次提交数据");
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
