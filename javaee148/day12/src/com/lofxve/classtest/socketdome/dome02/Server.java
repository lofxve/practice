package com.lofxve.classtest.socketdome.dome02;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8824);
        Socket socket = serverSocket.accept();
        new Thread(new ServerRunnableimpl(socket)).start();
        System.out.println("服务端启动");
    }
}
