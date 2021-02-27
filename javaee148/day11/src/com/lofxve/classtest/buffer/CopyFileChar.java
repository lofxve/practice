package com.lofxve.classtest.buffer;

import java.io.*;

/**
 * @ClassName CopyFileChar
 * @Author lofxve
 * @Date 2020/12/24 17:14
 */
public class CopyFileChar {
    public static void main(String[] args) throws IOException {
        String path = "D:\\itheima\\javaee148\\day11\\src\\com\\lofxve\\data\\lofxve.txt";

        File file = new File(path);
        if (!file.exists()) {
            throw new IOException("文件不存在");
        }

        // 创建新的文件路径
        String name = file.getName();
        String copy = name.substring(0, name.indexOf(".")).concat("_copy").concat(name.substring(name.indexOf(".")));
        String newpath = file.getPath().replace(file.getName(), copy);
        File file1 = new File(newpath);

        // 如果所要复制的文件已经存在，则删除他
        if (file1.exists()) {
            file1.delete();
        }

        // 创建文件输入和输出流
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));
        ) {
//            char[] chars = new char[1024];
//            int len = 0;
            // 读取
//            while ((len = bufferedReader.read(chars)) != -1) {
//                // 写入
//                bufferedWriter.write(chars,0,len);
//            }
            String str = null;
            while ((str = bufferedReader.readLine())!=null){
                bufferedWriter.write(str+"\r\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}