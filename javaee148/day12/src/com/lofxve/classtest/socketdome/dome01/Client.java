package com.lofxve.classtest.socketdome.dome01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8824);
        OutputStream outputStream = socket.getOutputStream();

        try(FileInputStream fileInputStream = new FileInputStream("day12/upload/person.txt")){
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fileInputStream.read(bytes))!=-1){
                outputStream.write(bytes,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        socket.shutdownInput();
        socket.close();
    }
}
