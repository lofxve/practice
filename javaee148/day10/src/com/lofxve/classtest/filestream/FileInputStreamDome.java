package com.lofxve.classtest.filestream;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName FileInputStreamDome
 * @Author lofxve
 * @Date 2020/12/22 20:29
 */
public class FileInputStreamDome {
    public static void main(String[] args) throws IOException {
        /**
         * 构建文件对象
         **/
        File file = new File("D:\\itheima\\javaee148\\day10\\src\\com\\lofxve\\classtest\\filestream\\data\\fileoutputstream.txt");
        FileInputStream fileInputStream = new FileInputStream(file);


        /**
         * 循环读取直到-1停止读取
         **/
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fileInputStream.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }

        fileInputStream.close();
    }
}