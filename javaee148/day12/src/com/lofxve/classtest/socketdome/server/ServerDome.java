package com.lofxve.classtest.socketdome.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ClassName ServerDome
 * @Author lofxve
 * @Date 2020/12/27 15:55
 * @Version 1.0
 */
public class ServerDome {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8824);
        Socket socket = serverSocket.accept();
        while (true){
            new Thread(new ServerRunnableimpl(socket)).start();
        }
    }
}