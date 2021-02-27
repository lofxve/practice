package com.lofxve.test.dome01;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName Clicent
 * @Author lofxve
 * @Date 2020/12/27 17:29
 * @Version 1.0
 */
public class Clicent {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9527);

        // 发送数据
        OutputStream outputStream = socket.getOutputStream();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        outputStream.write(simpleDateFormat.format(new Date()).getBytes());
        outputStream.write("你好服务器".getBytes());
        socket.shutdownOutput();

        // 接收数据
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(bytes))!=-1){
            System.out.println("Server: " + new String(bytes,0,len));
        }
        socket.close();
    }
}