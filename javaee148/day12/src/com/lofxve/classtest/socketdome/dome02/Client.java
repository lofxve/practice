package com.lofxve.classtest.socketdome.dome02;

import java.io.IOException;

import java.net.Socket;
import java.util.concurrent.CopyOnWriteArrayList;

public class Client {
    public static CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws IOException {
        //当Client创建对象的时候，进行三次握手
        Socket socket = new Socket("127.0.0.1", 8824);
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Client.copyOnWriteArrayList.add("第"+i+"次提交数据");
            System.out.println(i);
        }
        while (true){
            new Thread(new ClientRunnableimpl(socket)).start();
        }


    }
}
