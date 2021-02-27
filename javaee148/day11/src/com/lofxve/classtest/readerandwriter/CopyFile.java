package com.lofxve.classtest.readerandwriter;

import java.io.*;

/**
 * @ClassName CopyFile
 * @Author lofxve
 * @Date 2020/12/24 16:04
 */
public class CopyFile {
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
        /**
         *  try后边的小括号中不是所有的对象都可以放,对象所在的类必须实现AutoCloseable接口,才可以自动释放资源 
         **/
        try (
                FileReader fileReader = new FileReader(file);
                FileWriter fileWriter = new FileWriter(file1);
        ) {
            char[] chars = new char[1024];
            int len = 0;
            while ((len = fileReader.read()) != -1) {
                fileWriter.write(chars,0,len);
            }
            System.out.println("文件复制完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}