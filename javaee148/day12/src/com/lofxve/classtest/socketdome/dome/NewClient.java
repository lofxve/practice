package com.lofxve.classtest.socketdome.dome;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @ClassName NewClient
 * @Author lofxve
 * @Date 2020/12/27 12:09
 * @Version 1.0
 */
public class NewClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.186.28", 1234);
        Scanner scanner = new Scanner(System.in);

        String str = null;
        while (!"q".equals(str)){
            OutputStream outputStream = socket.getOutputStream();
            str = scanner.nextLine();
            outputStream.write(str.getBytes());

            InputStream inputStream = socket.getInputStream();
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = inputStream.read())!=-1){
                System.out.println(new String(bytes,0,len));
            }
        }
    }
}