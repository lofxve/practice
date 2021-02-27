package com.lofxve.classtest.bytebuffer;

import com.sun.media.sound.SoftTuning;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.nio.ByteBuffer;

/**
 * @ClassName ByteBufferDome02
 * @Author lofxve
 * @Date 2020/12/30 9:19
 * @Version 1.0
 */
public class ByteBufferDome02 {
    public static void main(String[] args) {
        // capacity
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        System.out.println(byteBuffer.capacity());

        ByteBuffer byteBuffer1 = ByteBuffer.allocate(15);
        System.out.println(byteBuffer1.capacity());

        // limit 限制位置后的位置将不可用 0-capacity
        System.out.println(byteBuffer.limit());
        byteBuffer.limit(9);
        System.out.println(byteBuffer.limit());

        // position 索引获取当前可写入位置索引。 0-limit
        System.out.println(byteBuffer.position());
        byteBuffer.position(7);
        System.out.println(byteBuffer.position());

        // mark 获取当前position的值并记录下来，更新position的值，reset将position的值重置为更新前mark记录的值
        System.out.println(byteBuffer.mark());
        byteBuffer.put((byte)10);
        System.out.println(byteBuffer.position());
        byteBuffer.reset();
        System.out.println(byteBuffer.position());



    }
}