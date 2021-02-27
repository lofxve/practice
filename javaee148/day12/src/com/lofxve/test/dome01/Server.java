package com.lofxve.test.dome01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName Server
 * @Author lofxve
 * @Date 2020/12/27 17:37
 * @Version 1.0
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9527);
        Socket socket = serverSocket.accept();

        // 发送数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("你好客户端".getBytes());
        socket.shutdownOutput();

        // 接收数据
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(bytes))!=-1){
            System.out.println("Client: " + new String(bytes,0,len));
        }
        socket.close();
        serverSocket.close();
    }
}