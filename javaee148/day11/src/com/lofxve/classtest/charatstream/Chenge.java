package com.lofxve.classtest.charatstream;

import java.io.*;

/**
 * @ClassName Chenge
 * @Author lofxve
 * @Date 2020/12/25 12:03
 * @Version 1.0
 */
public class Chenge {
    public static void main(String[] args) throws IOException {
        String openpath = "day11/1.txt";
        String closenpath = "day11/2.txt";
        String openCharSet = "UTF-8";
        String closeCharSet = "GBK";

        fun(openpath, closenpath,openCharSet, closeCharSet);
        System.out.println(openCharSet+"===>"+closeCharSet+"转换完成");
    }

    private static void fun(String openpath, String closenpath, String openCharSet, String closeCharSet) {
        try (
                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(openpath), openCharSet);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(closenpath), closeCharSet);
        ) {
            char[] chars = new char[1024];
            int len = 0;
            while ((len = inputStreamReader.read(chars)) != -1) {
                outputStreamWriter.write(chars,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}