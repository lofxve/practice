package com.lofxve.classtest.channel.data;

import java.io.IOException;
import java.io.RandomAccessFile;
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
        RandomAccessFile inraf = new RandomAccessFile("D:\\itheima\\javaee148\\day13\\src\\com\\lofxve\\channel\\data\\1.jpg", "rw");
        RandomAccessFile outraf = new RandomAccessFile("D:\\itheima\\javaee148\\day13\\src\\com\\lofxve\\channel\\data\\2.jpg", "rw");
        FileChannel irwChannel = inraf.getChannel();
        FileChannel orwChannel = outraf.getChannel();

        long size = irwChannel.size();
        // 实现从内存到内存的读写，不设计到硬盘，效率高
        MappedByteBuffer imb = irwChannel.map(FileChannel.MapMode.READ_ONLY,0,size);
        MappedByteBuffer omb = orwChannel.map(FileChannel.MapMode.READ_WRITE,0,size);

        for (int i = 0; i < size; i++) {
            byte b = imb.get();
            omb.put(i,b);
        }
        irwChannel.close();
        orwChannel.close();
        inraf.close();
        outraf.close();
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }
}