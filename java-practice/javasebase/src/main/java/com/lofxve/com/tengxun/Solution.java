package com.lofxve.com.tengxun;


import java.util.*;
public class Solution {
    public static String countSubstrings(String s, int k) {
        int len = s.length();
        int p = 1;
        for(int i = 0; i < len; i++){
            for (int j = i+1; j<=len; j++){
                if(p == k)
                    return s.substring(i,j);
                else{
                    p++;
                }
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int k = input.nextInt();
        System.out.println(countSubstrings(str,k));
    }


    /**647 回文子串
     * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
     * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
     **/

    //取得所有子串
    public static int countSubstrings(String s, HashSet<String> set) {
        int len = s.length();
        int k =0;

        for (int j = 1; j<=len; j++){
            String str = s.substring(0,j);
            System.out.println("------"+str);
            if(ispalindromic(str) && set.add(str)){
//                    System.out.println(s.substring(i,j));
                k++;
            }
        }
       return k;
    }
    //判断回文字符串
    public static boolean ispalindromic(String s){
        int i = 0;
        int j = s.length() -1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String str = input.nextLine();
//        int n = input.nextInt();
//
//        for (int i = 0;i<n;i++){
//            HashSet<String> set = new HashSet<>();
//            int l = input.nextInt();
//            int r = input.nextInt();
//            System.out.println(countSubstrings(str.substring(l-1,r),set));
//        }
//    }

}