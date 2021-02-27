package com.lofxve.leetcode20210222;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FindNumOfValidWords
 * @Author lofxve
 * @Date 2021/2/26 11:02
 * @Version 1.0
 */
public class FindNumOfValidWords {
    public static List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
        ArrayList<Integer> arr = new ArrayList<>();
        // 初始化
        for (int i = 0; i < puzzles.length; i++) {
            // 谜面
            String puzzle = puzzles[i];
            int k = 0;
            for (int j = 0; j < words.length; j++) {
                // 谜底
                String word = words[j];
                // 单词 word 中包含谜面 puzzle 的第一个字母
                if (word.contains(puzzle.charAt(0) + "")) {
                    // 单词 word 中的每一个字母都可以在谜面 puzzle 中找到。
                    int x = 0;
                    for (; x < word.length(); x++) {
                        if (!puzzle.contains(word.charAt(x) + "")) {
                            break;
                        }
                    }
                    if (x == word.length()) {
                        k++;
                    }
                }
            }
            arr.add(k);
        }
        return arr;
    }

    public static void main(String[] args) {
        String[] words = {"aaaa", "asas", "able", "ability", "actt", "actor", "access"};
        String[] puzzles = {"aboveyz","abrodyz","abslute","absoryz","actresz","gaswxyz"};
        System.out.println(findNumOfValidWords(words,puzzles).toString());
    }
}
