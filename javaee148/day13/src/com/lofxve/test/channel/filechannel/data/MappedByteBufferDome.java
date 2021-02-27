package com.lofxve.test.channel.filechannel.data;

import sun.java2d.pipe.OutlineTextRenderer;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @ClassName MappedByteBufferDome
 * @Author lofxve
 * @Date 2020/12/30 11:12
 * @Version 1.0
 */
public class MappedByteBufferDome {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        // 创建RandomAccessFile对象,构造方法中绑定要读取的数据源和设置只读模式("r")
        RandomAccessFile inrandomAccessFile = new RandomAccessFile("D:\\itheima\\javaee148\\day13\\src\\com\\lofxve\\test\\channel\\filechannel\\data\\1.jpg", "r");
        RandomAccessFile outrandomAccessFile = new RandomAccessFile("D:\\itheima\\javaee148\\day13\\src\\com\\lofxve\\test\\channel\\filechannel\\data\\2.jpg", "rw");

        // 获取channel对象
        FileChannel inrandomAccessFileChannel = inrandomAccessFile.getChannel();
        FileChannel outrandomAccessFile1Channel = outrandomAccessFile.getChannel();

        // 复制文件
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        int len = 0;
        while ((len = inrandomAccessFileChannel.read(allocate)) != -1){
            allocate.flip();
            outrandomAccessFile1Channel.write(allocate);
            allocate.clear();
        }

        //关闭资源
        outrandomAccessFile1Channel.close();
        inrandomAccessFileChannel.close();
        outrandomAccessFile.close();
        inrandomAccessFile.close();
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}