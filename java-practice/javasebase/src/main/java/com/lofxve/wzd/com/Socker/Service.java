package com.lofxve.wzd.com.Socker;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Service {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9898);
        int reqCount = 0;
        while(true) {

            Socket socket = server.accept();
            new Thread(
                    new Runnable() {
                        @Override
                        public void run() {
                            try {
                                while(true) {

                                    InputStream inputStream =  socket.getInputStream();
                                    byte[] b = new byte[1024];
                                    int len;
                                    StringBuffer sb = new StringBuffer();
                                    //一次交互完成后，while循环过来，在此阻塞，即监听
                                    while ((len = inputStream.read(b)) != -1) {
                                        sb.append(new String(b, 0, len));
                                        //单次交互结束标识，跳出监听
                                        if(new String(b, 0, len).indexOf("over")>=0){
                                            break;
                                        }
                                    }
                                    String content = sb.toString();
                                    System.out.println("接收到客户端消息" + content.substring(0,content.length()-4));

                                    //往客户端发送数据
                                    long nowtime = (new Date()).getTime();
                                    socket.getOutputStream().write((nowtime+"over").getBytes("UTF-8"));
                                    socket.getOutputStream().flush();
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }
            ).start();
        }
    }
}