package com.lofxve.sword.finger.offer;

/**
 * 面试题 01.06. 字符串压缩
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，
 * 字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。
 * 你可以假设字符串中只包含大小写英文字母（a至z）。
 *
 * @ClassName CompressString
 * @Author lofxve
 * @Date 2021/3/2 22:51
 * @Version 1.0
 */
public class CompressString {
    public static String compressString(String s) {
        if (s == "") {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer("");
        int len = s.length();
        int i = 0;

        // 遍历字符串
        while (i < len) {
            // 从新的位置计算
            int j = i;
            while (j < len && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            // 存储
            stringBuffer.append(s.charAt(i));
            stringBuffer.append(j - i);
            // 更新位置
            i = j;
        }
        return stringBuffer.length() < len ? stringBuffer.toString() : s;
    }

    public static void main(String[] args) {
        System.out.println(compressString("aabcccccaaa"));
    }
}
