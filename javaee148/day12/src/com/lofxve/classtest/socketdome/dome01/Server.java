package com.lofxve.classtest.socketdome.dome01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8824);
        Socket socket = serverSocket.accept();

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello wzd".getBytes());
        socket.shutdownOutput();

        InputStream inputStream = socket.getInputStream();
        String filename = "com.lofxve"+System.currentTimeMillis()+new Random(9999).nextInt();
        try(FileOutputStream fileOutputStream = new FileOutputStream("day12/download/"+filename+".txt")){
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = inputStream.read(bytes))!=-1){
                fileOutputStream.write(bytes,0,len);
            }
            socket.shutdownInput();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
