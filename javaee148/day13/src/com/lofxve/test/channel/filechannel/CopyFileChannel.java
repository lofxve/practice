package com.lofxve.test.channel.filechannel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @ClassName CopyFileChannel
 * @Author lofxve
 * @Date 2020/12/30 20:49
 * @Version 1.0
 */
public class CopyFileChannel {
    /**
     * 读取、写入、映射和操作文件的通道
     *
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws IOException {
        // 文件输入输出流
        FileInputStream fileInputStream = new FileInputStream("D:\\itheima\\javaee148\\day13\\src\\com\\lofxve\\test\\channel\\filechannel\\data\\1.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\itheima\\javaee148\\day13\\src\\com\\lofxve\\test\\channel\\filechannel\\data\\3.jpg");

        // 获取通道
        FileChannel fileInputStreamChannel = fileInputStream.getChannel();
        FileChannel fileOutputStreamChannel = fileOutputStream.getChannel();

        // 读写克隆
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        int len = 0;
        while ((len = fileInputStreamChannel.read(byteBuffer)) != -1) {
            System.out.println("flip前==>position:"+byteBuffer.position()+",limit:"+byteBuffer.limit());
            byteBuffer.flip();
            System.out.println("flip后==>position:"+byteBuffer.position()+",limit:"+byteBuffer.limit());
            System.out.println("write方法写:"+byteBuffer.position()+"到"+byteBuffer.limit()+"之间的数据!");
            fileOutputStreamChannel.write(byteBuffer);
            System.out.println("clear前==>position:"+byteBuffer.position()+",limit:"+byteBuffer.limit());
            byteBuffer.clear();
            System.out.println("clear后==>position:"+byteBuffer.position()+",limit:"+byteBuffer.limit());
            System.out.println("-------------------------------------------------------------");
        }

        // 释放资源
        fileOutputStreamChannel.close();
        fileInputStreamChannel.close();
        fileInputStream.close();
        fileOutputStream.close();
    }
}