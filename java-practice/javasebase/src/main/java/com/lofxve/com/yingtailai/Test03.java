package com.lofxve.com.yingtailai;


import java.sql.SQLOutput;
import java.util.ArrayList;

/**
 * @ClassName Test03
 * @Author lofxve
 * @Date 2021/3/17 19:44
 * @Version 1.0
 */
public class Test03 {
    public static void main(String[] args) {
        ArrayList<Yang> yangs = new ArrayList<>();
        yangs.add(new Yang(1));
        for (int j = 0; j < yangs.size(); j++) {
            Yang yang = yangs.get(j);
            yang.age++;
            if (yang.age == 2 || yang.age == 4) {
                yangs.add(new Yang(1));
            }
            if (yang.age == 5) {
                yangs.remove(yang);
            }
        }
        System.out.println(yangs.size());
    }
}

class Yang {
    public int age;

    Yang(int age) {
        this.age = age;
    }
}
