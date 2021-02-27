package com.lofxve.classtest.propertiesdome;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName PropertiesDome01
 * @Author lofxve
 * @Date 2020/12/25 10:19
 * @Version 1.0
 */
public class PropertiesDome {
    public static void main(String[] args) throws IOException {
        Properties propstore = new Properties();
        // 添加键值对
        propstore.setProperty("品名","Iphone11 Pro Max");
        propstore.setProperty("颜色","暗夜绿");
        propstore.setProperty("存储容量","256G");
        propstore.setProperty("价格","10899");

        // store把集合中的数据写入到硬盘中保存(内存==>硬盘)
//        propstore.store(new FileWriter("day11/1.properties"),"Properties Test");
        propstore.store(new FileOutputStream("day11/1.properties"),"Properties Test");
        // load把硬盘中保存的键值对读取到集合中使用(硬盘==>内存)
        Properties propload = new Properties();

        // 从输入字节流读取属性列表（键和元素对）。
        propload.load(new FileInputStream("day11/1.properties"));
        Set<String> strings = propload.stringPropertyNames();
        for (String string : strings) {
            String property = propload.getProperty(string);
            System.out.println(string+" "+property);
        }
    }
}