package com.lofxve.com.didi;

import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    /**
     * @return void
     * @Author weizhendong
     * @Description //TODO 冒泡排序
     * @Date 20:21 2020/9/12
     * @Param [arr]
     **/
    public static void b(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * @return java.util.LinkedList<java.lang.Integer>
     * @Author weizhendong
     * @Description //TODO 字符串翻转k位 34562 ==>62345
     * @Date 20:21 2020/9/12
     * @Param [link, k]
     **/
    public static LinkedList<Integer> s(LinkedList<Integer> link, int k) {
        for (int i = 0; i < k; i++) {
            link.addFirst(link.removeLast());
        }
        return link;
    }

    public static void paPaTest() {
        int[] arr = {1, 8, 9, 3, 5, 7, 6, 5, 3, 4};
        b(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void main(String[] args) {
//        冒泡排序
//        paPaTest();

        LinkedList<Integer> link = new LinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
            Scanner input = new Scanner(System.in);
            int m = input.nextInt();
            link.addLast(m);
        }
        LinkedList<Integer> ll = s(link, 2);
        for (Integer i : ll) {
            System.out.print(i + " ");
        }
    }
}
