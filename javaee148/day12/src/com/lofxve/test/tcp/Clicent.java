package com.lofxve.test.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName Clicent
 * @Author lofxve
 * @Date 2020/12/27 18:15
 * @Version 1.0
 */
public class Clicent {
    public static CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9527);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String s = scanner.nextLine();
            Clicent.copyOnWriteArrayList.add(s);
            if (!Clicent.copyOnWriteArrayList.isEmpty()) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            // 发送数据
                            OutputStream outputStream = socket.getOutputStream();
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                            outputStream.write(simpleDateFormat.format(new Date()).getBytes());
                            for (String s : Clicent.copyOnWriteArrayList) {
                                outputStream.write(s.getBytes());
                            }
                            Clicent.copyOnWriteArrayList.clear();
                            // 接收数据
                            InputStream inputStream = socket.getInputStream();
                            byte[] bytes = new byte[1024];
                            int len = 0;
                            while ((len = inputStream.read(bytes)) != -1) {
                                System.out.println("Server: " + new String(bytes, 0, len));
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        }
    }
}