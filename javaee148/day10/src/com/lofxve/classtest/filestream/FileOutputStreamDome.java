package com.lofxve.classtest.filestream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName FileOutputStreamDome
 * @Author lofxve
 * @Date 2020/12/22 20:16
 */
public class FileOutputStreamDome {
    public static void main(String[] args) throws IOException {
        /**
         * 构建文件对象
         **/
        File file = new File("D:\\itheima\\javaee148\\day10\\src\\com\\lofxve\\classtest\\fileoutputstream\\data\\fileoutputstream.txt");
        // 是否续写
        boolean append = true;
        /**
         * 构建字节输出流
         **/
        FileOutputStream fileOutputStream = new FileOutputStream(file, append);

        /**
         *  一次写入一个字节
         **/
        fileOutputStream.write(97);

        /**
         * 一次写入一个字节数组
         **/
        fileOutputStream.write("fx\r\n".getBytes());


        /**
         *  刷新此输出流并强制任何缓冲的输出字节被写出。 
         **/
        fileOutputStream.flush();

        /**
         * 关闭此输出流并释放与此流相关联的任何系统资源。
         **/
        fileOutputStream.close();
    }
}