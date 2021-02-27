package com.lofxve.test;

import jdk.nashorn.internal.ir.ReturnNode;

import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName Test
 * @Author lofxve
 * @Date 2020/12/24 17:17
 */
public class Test {
    /*
    练习:文本排序
    分析:
        1.创建一个ArrayList集合对象,泛型使用String
        2.创建字符缓冲输人流BufferedReader对象,构造方法中传递FileReader对象
        3.创建字符缓冲输出流BufferedWriter对象,构造方法中传递FileWriter对象
        4.使用BufferedReader对象中的方法readLine,以行的方式读取文件
        5.把读取的每行文本存储到ArrayList集合中
        6.使用Collections集合工具类中的方法sort,根据比较器产生的规则对集合中的元素进行排序
        7.遍历ArrayList集合,获取每一行文本
        8.使用BufferedWriter对象中的方法write,把每一行文本写入到内存缓冲区中
        9.使用BufferedWriter对象中的方法newLine,没写一行文本之后,写一个换行
        10.释放资源
 */
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\itheima\\javaee148\\day11\\src\\com\\lofxve\\data\\lofxve.txt"));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\itheima\\javaee148\\day11\\src\\com\\lofxve\\data\\lofxve_copy.txt"));
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                arrayList.add(line);
            }
            Collections.sort(arrayList, ((o1, o2) -> o1.compareTo(o2)));
            arrayList.forEach(s -> System.out.println(s));
            for (String s : arrayList) {
                bufferedWriter.write(s + "\r\n");
            }
            bufferedReader.close();
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}