package com.lofxve.wzd.com.Hutool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class Client {


    public static void main(String[] args) {
        try {
            Socket server = new Socket("localhost", 9999);
            BufferedReader in = new BufferedReader(new InputStreamReader(server.getInputStream()));

            PrintWriter out=new PrintWriter(server.getOutputStream());


            BufferedReader userin = new BufferedReader(new InputStreamReader(System.in));

            new SendThread(out,userin,false).start();
            new ReceiveTread(server,in,out,userin).start();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}