package com.lofxve.classtest.file;

import java.io.File;

/**
 * @ClassName FileDome01
 * @Author lofxve
 * @Date 2020/12/22 15:20
 */
public class FileDome01 {
    public static void main(String[] args) {
        /**
         * constructor 构造方式一
         **/
        File file0 = new File("D:\\itheima\\javaee148\\day10\\src\\com\\lofxve\\classtest\\file\\data\\Date.java");

        // 底层使用getpath
        System.out.println(file0);
        System.out.println("------------------------------------------");
        // 绝对路径
        System.out.println("绝对路径 "+file0.getAbsoluteFile());
        System.out.println("------------------------------------------");
        // 路径
        System.out.println(file0.getPath());
        System.out.println("------------------------------------------");
        // 返回构造方法中传递路径末尾的文件、文件夹的名称
        System.out.println("文件名 "+file0.getName());
        System.out.println("------------------------------------------");

        /**
         * 字节大小 该方法只能返回文件的大小，不能返回文件夹的大小，文件夹没有大小概念
         **/
        System.out.println("length "+file0.length());
        System.out.println("------------------------------------------");

        /**
         * constructor 构造方式二
         **/
        File file1 = new File("D:\\itheima\\javaee148\\day10\\src\\com\\lofxve","\\classtest\\file\\data\\Date.java");
        // 文件是否存在
        if (file1.exists()){
            if (file1.isFile()){
                System.out.println("是文件");
            }
            if (file1.isDirectory()){
                System.out.println("是目录");
            }
        }else{
            file1.mkdirs();
        }
        System.out.println("------------------------------------------");

        /**
         * constructor 构造方式三
         **/
        File file2 = new File("D:\\itheima\\javaee148\\day10\\src\\com\\lofxve");
        File file3 = new File(file2, "\\classtest\\file\\data\\Date.java");
        
        System.out.println("------------------------------------------");
        String[] list = file2.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("------------------------------------------");
        File[] files = file2.listFiles();
        for (File file : files) {
            System.out.println(file);
        }

    }
}