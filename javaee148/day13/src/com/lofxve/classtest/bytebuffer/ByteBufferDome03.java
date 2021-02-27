package com.lofxve.classtest.bytebuffer;

import com.sun.media.sound.SoftTuning;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;

/**
 * @ClassName ByteBufferDome03
 * @Author lofxve
 * @Date 2020/12/30 10:10
 * @Version 1.0
 */
public class ByteBufferDome03 {
    public static void main(String[] args) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        byteBuffer.put((byte)1);
        byteBuffer.put((byte)2);
        byteBuffer.put((byte)3);
        System.out.println(Arrays.toString(byteBuffer.array()));

        // remaining limit<remaining<position
        System.out.println(byteBuffer.remaining());
        // isReadOnly 是否只读
        System.out.println(byteBuffer.isReadOnly());
        // isDirect 是否是系统内存 还是堆内存
        System.out.println(byteBuffer.isDirect());

        // clear
        //- 将position设置为：0
        //- 将限制limit设置为容量capacity；
        //- 丢弃标记mark。
        byteBuffer.limit(5);
        System.out.println("position: "+byteBuffer.position()+" limit: "+byteBuffer.limit());
        byteBuffer.clear();
        System.out.println("position: "+byteBuffer.position()+" limit: "+byteBuffer.limit());

        //flip
        //- 将limit设置为当前position位置； [0, 1, 2, 0, 0, 0, 0, 0, 0, 0]  position=3 limit=10
        //- 将当前position位置设置为0；   position=0 limit=3  new String(bytes,0,len)
        //- 丢弃标记。
        System.out.println("position: "+byteBuffer.position()+" limit: "+byteBuffer.limit());
        byteBuffer.flip();
        System.out.println("position: "+byteBuffer.position()+" limit: "+byteBuffer.limit());



    }
}