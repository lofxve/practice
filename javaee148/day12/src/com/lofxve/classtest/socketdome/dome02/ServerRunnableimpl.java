package com.lofxve.classtest.socketdome.dome02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @ClassName ServerRunnableimpl
 * @Author lofxve
 * @Date 2020/12/27 10:46
 * @Version 1.0
 */
public class ServerRunnableimpl implements Runnable {
    private Socket socket;

    ServerRunnableimpl(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            while (true){
                OutputStream outputStream = socket.getOutputStream();
//            outputStream.write("嗯，我收到了".getBytes());

                InputStream inputStream = socket.getInputStream();

                byte[] bytes = new byte[1024];
                int len = 0;
                while ((len = inputStream.read(bytes))!=-1){
                    System.out.println("Client:" + new String(bytes, 0, len));
                }

                outputStream.close();
                inputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}