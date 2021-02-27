package com.lofxve.classtest.tcpserver;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName WebSocketRunnableImpl
 * @Author lofxve
 * @Date 2020/12/27 16:40
 * @Version 1.0
 */
public class WebSocketRunnableImpl implements Runnable {
    private Socket socket;

    WebSocketRunnableImpl(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // 打印客户端请求信息
            String line = bufferedReader.readLine();
            String[] arr = line.split(" ");
            String substring = arr[1].substring(1);

            System.out.println(substring);

            FileInputStream fileInputStream = new FileInputStream(substring);

            OutputStream outputStream = socket.getOutputStream();

            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fileInputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,len);
            }

            // 关闭资源
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}