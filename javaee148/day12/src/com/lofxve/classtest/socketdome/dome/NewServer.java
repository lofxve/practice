package com.lofxve.classtest.socketdome.dome;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName NewServer
 * @Author lofxve
 * @Date 2020/12/27 12:14
 * @Version 1.0
 */
public class NewServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9527);
        Socket socket = serverSocket.accept();

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("sadsf".getBytes());

        InputStream inputStream = socket.getInputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read())!=-1){
            System.out.println(new String(bytes,0,len));
        }
    }
}