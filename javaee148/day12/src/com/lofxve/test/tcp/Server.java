package com.lofxve.test.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Server
 * @Author lofxve
 * @Date 2020/12/27 18:03
 * @Version 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9527);
        while (true) {
            Socket socket = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        // 发送数据
                        OutputStream outputStream = socket.getOutputStream();
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                        outputStream.write(simpleDateFormat.format(new Date()).getBytes());
                        outputStream.write("你好客户端".getBytes());
                        //            socket.shutdownOutput();

                        // 接收数据
                        InputStream inputStream = socket.getInputStream();
                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = inputStream.read(bytes)) != -1) {
                            System.out.println("Client: " + new String(bytes, 0, len));
                        }
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}