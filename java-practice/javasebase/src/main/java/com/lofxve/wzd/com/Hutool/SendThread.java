package com.lofxve.wzd.com.Hutool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SendThread extends Thread{

    PrintWriter out;
    BufferedReader userin;
    boolean isServer;

    public SendThread(PrintWriter out,BufferedReader userin,boolean isServer) {
        this.out = out;
        this.userin = userin;
        this.isServer = isServer;
    }

    @Override
    public void run() {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            while(true){
                if(isServer){
                    out.println("Server  "+sf.format(new Date())+"\n\t"+ userin.readLine());
                }else{
                    out.println("client  "+sf.format(new Date())+"\n\t"+ userin.readLine());
                }
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }






}