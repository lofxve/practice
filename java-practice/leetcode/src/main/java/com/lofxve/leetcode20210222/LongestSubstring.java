package com.lofxve.leetcode20210222;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName LongestSubstring
 * @Author lofxve
 * @Date 2021/2/27 23:12
 * @Version 1.0
 */
public class LongestSubstring {
    public static int longestSubstring(String s, int k) {
        if (s.length() < k) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        // 统计字频
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (char c : map.keySet()) {
            // 如果字符出现次数小于k，则进行分割
            if (map.get(c) < k) {
                int res = 0;
                for (String t : s.split(String.valueOf(c))) {
                    // 取出分割子串的最大值
                    res = Math.max(res, longestSubstring(t, k));
                }
                return res;
            }
        }
        return s.length();
    }

    public static void main(String[] args) {
        String str = "ababbc";
        longestSubstring(str, 2);
    }
}
