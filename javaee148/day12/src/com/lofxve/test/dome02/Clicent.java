package com.lofxve.test.dome02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @ClassName Clicent
 * @Author lofxve
 * @Date 2020/12/27 17:29
 * @Version 1.0
 */
public class Clicent {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9527);
        byte[] bytes = new byte[1024];
        int len = 0;

        // 发送数据
        OutputStream outputStream = socket.getOutputStream();
        // 获取本地数据
        FileInputStream fileInputStream = new FileInputStream("day12/upload/person.txt");
        while ((len = fileInputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,len);
        }
        socket.shutdownOutput();

        // 接收数据
        InputStream inputStream = socket.getInputStream();
        while ((len = inputStream.read(bytes))!=-1){
            System.out.println("Server: " + new String(bytes,0,len));
        }
        socket.close();
    }
}