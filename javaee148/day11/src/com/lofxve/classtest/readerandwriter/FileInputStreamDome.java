package com.lofxve.classtest.readerandwriter;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName FileInputStreamDome
 * @Author lofxve
 * @Date 2020/12/25 8:47
 * @Version 1.0
 */
public class FileInputStreamDome {
    /**
     *     使用字节输入流读取含有中文的文件
     *     文件的编码UTF-8:一个中文占用3个字节
     *     文件的编码GBK:一个中文占用2个字节
     */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day11\\1.txt");
        int len = 0;
        while ((len = fis.read())!=-1){
            System.out.print((char)len);//ä½ å¥½a1 一次读取1个字节,把中文的1/3转换为字符,在编码表查询不到,出现异常
        }
        fis.close();
    }
}