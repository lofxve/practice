package com.lofxve.classtest.filestream;

import java.io.*;

/**
 * @ClassName CopyFile
 * @Author lofxve
 * @Date 2020/12/22 20:54
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        String path = "D:\\itheima\\javaee148\\day10\\src\\com\\lofxve\\classtest\\filestream\\data\\fileoutputstream.txt";

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

        try (
                // 创建文件输入和输出流
                FileInputStream fileInputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(file1);
        ) {
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
            }
            System.out.println("复制成功！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}