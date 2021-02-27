package com.lofxve.base.Stream;

import java.io.*;

public class ReadAndWrite {
    public static String readAsString(File file) throws IOException {
        String s = null;
        try(InputStream input = new FileInputStream(file)){
            int n;
            StringBuilder sb = new StringBuilder();
            // 读取字节并赋值给n,若等于-1则跳出循环
            while ((n = input.read()) != -1) {
                sb.append((char) n);
            }
            s=sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
    public static void writeAsString(File file,String str,boolean apppend){
        try(OutputStream output = new FileOutputStream(file,apppend)){
            // 将字符串写入
            output.write(str.getBytes("UTF-8"));
            // 强制把缓冲区内容刷新
            output.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\java\\javase idea\\src\\Stream\\data\\a.txt");
        String string = readAsString(file);
        System.out.println(string);
        File file1 = new File("D:\\java\\javase idea\\src\\Stream\\data\\b.txt");
        // 如果此文件不存在，则创建新文件，不追加写入，然后写入文件，否则直接追加写入
        if (!file1.isFile()){
            if (file1.createNewFile()){
                writeAsString(file1,string,false);
            }
        }else {
            writeAsString(file1,string,true);
        }
    }
}
