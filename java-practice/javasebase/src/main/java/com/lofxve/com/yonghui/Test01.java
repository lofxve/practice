package com.lofxve.com.yonghui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * LL今天心情特别好,因为他去买了一副扑克牌,发现里面居然有2个大王,2个小王(一副牌原本是54张^_^)...
 * 他随机从中抽出了5张牌,想测测自己的手气,看看能不能抽到顺子,如果抽到的话,他决定去买体育彩票,嘿嘿！！
 * “红心A,黑桃3,小王,大王,方片5”,“Oh My God!”不是顺子.....LL不高兴了,他想了想,决定大\小 王可以看成任何数字,
 * 并且A看作1,J为11,Q为12,K为13。上面的5张牌就可以变成“1,2,3,4,5”(大小王分别看作2和4),“So Lucky!”。LL决定去买体育彩票啦。
 * 现在,要求你使用这幅牌模拟上面的过程,然后告诉我们LL的运气如何， 如果牌能组成顺子就输出true，否则就输出false。
 *
 * @ClassName Test01
 * @Author lofxve
 * @Date 2021/3/14 14:42
 * @Version 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] split = s.split(",");
        Arrays.sort(split);
        ArrayList<Integer> arr = new ArrayList<>();
        for (String s1 : split) {
            arr.add(Integer.valueOf(s1));
        }
        boolean flag = fun(arr);
        System.out.println(flag);
    }

    private static boolean fun(ArrayList<Integer> arr) {
        int k = 0;
        int j = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) <= 0) {
                k++;
            } else {
                j = i;
                break;
            }
        }
        for (; j < arr.size()-1; j++) {
            if (arr.get(j) + 1 != arr.get(j + 1)) {
                if (k != 0) {
                    arr.add(j + 1, arr.get(j) + 1);
                    k--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
