package com.lofxve.classtest.socketdome.dome02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @ClassName ClientRunnableimpl
 * @Author lofxve
 * @Date 2020/12/27 10:59
 * @Version 1.0
 */
public class ClientRunnableimpl implements Runnable{
    private Socket socket;

    ClientRunnableimpl(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        while (true) {
            try {
                OutputStream outputStream = socket.getOutputStream();
                // 数据发送
                if (!Client.copyOnWriteArrayList.isEmpty()) {
                    outputStream.write(Client.copyOnWriteArrayList.toString().getBytes());
                }
                // 数据接收打印
                InputStream inputStream = socket.getInputStream();
                byte[] bytes = new byte[1024];
                int len = 0;
                while ((len = inputStream.read(bytes))!=-1){
                    System.out.println("Server:" + new String(bytes, 0, len));
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}