package com.lofxve.classtest.socketdome.server;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * @ClassName ServerRunnableimpl
 * @Author lofxve
 * @Date 2020/12/27 15:57
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
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("hello wzd".getBytes());
            socket.shutdownOutput();

            InputStream inputStream = socket.getInputStream();
            String filename = "com.lofxve" + System.currentTimeMillis() + new Random(9999).nextInt();
            FileOutputStream fileOutputStream = new FileOutputStream("day12/download/" + filename + ".txt");
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = inputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
            socket.shutdownInput();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}