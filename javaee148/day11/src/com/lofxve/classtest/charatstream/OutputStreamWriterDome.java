package com.lofxve.classtest.charatstream;

import java.io.*;

/**
 * @ClassName OutputStreamWriterDome
 * @Author lofxve
 * @Date 2020/12/25 11:56
 * @Version 1.0
 */
public class OutputStreamWriterDome {
    public static void main(String[] args) throws IOException {
        String str = "#Properties Test\n" +
                "#Fri Dec 25 10:41:01 CST 2020\n" +
                "靳东=41\n" +
                "霍建华=40\n" +
                "胡歌=38\n" +
                "沈腾=45\n";
        writerWithGBK(str);
//        writerWithUTF8(str);
    }

    private static void writerWithUTF8(String str) throws IOException {
        OutputStreamWriter utf8 = new OutputStreamWriter(new FileOutputStream("day11/1.txt"), "UTF8");
        utf8.write(str);
        utf8.flush();
        utf8.close();
    }

    private static void writerWithGBK(String str) throws IOException{
        OutputStreamWriter utf8 = new OutputStreamWriter(new FileOutputStream("day11/1.txt"), "GBK");
        utf8.write(str);
        utf8.flush();
        utf8.close();
    }
}