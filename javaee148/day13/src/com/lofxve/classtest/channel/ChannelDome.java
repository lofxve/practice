package com.lofxve.classtest.channel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @ClassName ChannelServerSocketDome
 * @Author lofxve
 * @Date 2020/12/30 10:48
 * @Version 1.0
 */
public class ChannelDome {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\itheima\\javaee148\\day13\\src\\com\\lofxve\\channel\\data\\1.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\itheima\\javaee148\\day13\\src\\com\\lofxve\\channel\\data\\2.jpg");
        FileChannel fileInputStreamChannel = fileInputStream.getChannel();
        FileChannel fileOutputStreamChannel = fileOutputStream.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

        int len = 0;
        while ((len = fileInputStreamChannel.read(byteBuffer))!=-1){
            System.out.println("position: "+byteBuffer.position()+" limit: "+byteBuffer.limit());
            byteBuffer.flip(); // 缩小limit的范围
            System.out.println("position: "+byteBuffer.position()+" limit: "+byteBuffer.limit());
            System.out.println("写"+byteBuffer.position()+"到limit: "+byteBuffer.limit());
            fileOutputStreamChannel.write(byteBuffer);
            System.out.println("position: "+byteBuffer.position()+" limit: "+byteBuffer.limit());
            byteBuffer.clear(); // 还原bytebufff
            System.out.println("position: "+byteBuffer.position()+" limit: "+byteBuffer.limit());
            System.out.println("------------------------------------------------------------------");
        }
        fileOutputStreamChannel.close();
        fileInputStreamChannel.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}