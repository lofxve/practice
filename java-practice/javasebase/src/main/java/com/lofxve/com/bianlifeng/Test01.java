package com.lofxve.com.bianlifeng;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * 给定一组词组，每个词组包含id和字符串的映射，现输入另一组词组，要求找出新的词组与老的词组的diff关系，diff要求如下：
 * 1、id相同且字符串相同的两个词组视为相同
 * 2、id相同，且字符串不同的输出modify+id
 * 3、新的词组id在老的词组id中不存在的，视为新增，输出add+id
 * 4、老的词组id在新的词组id中不存在的，视为删除，输出delete+id
 *
 *
 * 输入描述
 * 第一行代表老的词组，第二行代表新的词组
 *
 * 每一行是id-字符串的组合，多个词组以逗号分隔
 *
 * 如：1-a,2-b,3-c
 * 输出描述
 * 一个字符串，多个结果按字符串排序后（直接使用string的compareTo方法比较大小即可）以逗号分隔，如：add-2,delete-22
 *
 *
 * 样例输入
 * 1-a,2-b,3-c
 * 1-a,2-bb,3-c
 * 样例输出
 * modify-2
 *
 * 提示
 * 输入：
 * 1-a,2-b,3-c
 * 1-a,2-bb
 * 输出:
 * modify-2,delete-3
 *
 *
 * 输入：
 * 1-a
 * 1-a,2-b
 * 输出:
 * add-2
 * @ClassName Test01
 * @Author lofxve
 * @Date 2021/3/20 14:26
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String m = sc.nextLine();
        String[] oldString = s.split(",");
        String[] newString = m.split(",");

        ArrayList<String> oldarr = new ArrayList<>();
        ArrayList<String> newarr = new ArrayList<>();

        StringBuilder aid = new StringBuilder();
        aid.append("add-");
        StringBuilder did = new StringBuilder();
        did.append("delete-");
        StringBuilder modifyid = new StringBuilder();
        modifyid.append("modify-");
        for (int i = 0; i < oldString.length; i++) {
            for (int j = 0; j < newString.length; j++) {
                List<String> istrings = Arrays.asList(oldString[i].split("-"));
                List<String> jstrings = Arrays.asList(newString[j].split("-"));
                String id1 = istrings.get(0);
                String id2 = jstrings.get(0);
                String s1 = istrings.get(1);
                String s2 = jstrings.get(1);
                //1、id相同且字符串相同的两个词组视为相同
                if (id1.equals(id2) && s1.equals(s2)) {
                    continue;
                }
                //2、id相同，且字符串不同的输出modify+id
                else if (id1.equals(id2) && !s1.equals(s2)) {
                    modifyid.append(id1);
                }
                oldarr.add(id1);
                newarr.add(id2);
            }
        }
        //3、新的词组id在老的词组id中不存在的，视为新增，输出add+id
        for (String s2 : oldarr) {
            if (!newarr.contains(s2)) {
                did.append(s2);
            }
        }
        //4、老的词组id在新的词组id中不存在的，视为删除，输出delete+id
        for (String s1 : newarr) {
            if (!oldarr.contains(s1)) {
                aid.append(s1);
            }
        }
        List<String> strings = new ArrayList<>();

        if (aid.length() > 4) {
            strings.add(aid.toString());
        }
        if (did.length() > 7) {
            strings.add(did.toString());
        }
        if (modifyid.length() > 7) {
            strings.add(modifyid.toString());
        }
        String[] strings1 = new String[strings.size()];
        Arrays.sort(strings.toArray(strings1));
        for (int i = 0; i < strings1.length; i++) {
            if (i == strings1.length - 1) {
                System.out.print(strings1[i]);
            } else {
                System.out.print(strings1[i] + ",");
            }
        }
    }
}
