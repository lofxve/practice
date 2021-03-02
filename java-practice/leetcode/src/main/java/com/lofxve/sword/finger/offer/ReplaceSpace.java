package com.lofxve.sword.finger.offer;

/**
 * @ClassName ReplaceSpace
 * @Author lofxve
 * @Date 2021/2/27 23:40
 * @Version 1.0
 */
public class ReplaceSpace {
    public static String replaceSpace(String s) {
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                stringBuffer.append("%20");
            } else {
                stringBuffer.append(c);
            }
        }
        return stringBuffer.toString();
    }

    public static String replaceSpace1(String str) {
        if (str == null) {
            return "";
        }
//        字符串总长
        int oldlen = str.length();
//        计算空格数量
        int kong = 0;
        for (int i = 0; i < oldlen; i++) {
            if (str.charAt(i) == ' ') {
                kong++;
            }
        }
//        新字符串长度
        int newlength = oldlen + kong * 2;
//        创建字符数组
        char[] array = new char[newlength];

        int oldIndex = oldlen - 1;
        int newIndex = newlength - 1;

//        从后往前挪动
        while (oldIndex >= 0 && oldIndex <= newIndex) {
            char c = str.charAt(oldIndex);
            if (c == ' ') {
                array[newIndex--] = '0';
                array[newIndex--] = '2';
                array[newIndex--] = '%';
            } else {

                array[newIndex--] = c;
            }
            oldIndex--;
        }
        return String.valueOf(array);
    }

    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace1(s));
    }
}
