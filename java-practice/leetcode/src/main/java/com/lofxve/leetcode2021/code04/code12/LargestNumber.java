package com.lofxve.leetcode2021.code04.code12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @ProjectName: java-practice
 * @Package: com.lofxve.leetcode2021.code04.code12
 * @ClassName: LargestNumber
 * @Author: lofxve
 * @Description:
 * @Date: 2021/4/12 15:43
 * @Version: 1.0
 */
public class LargestNumber {
    public static String largestNumber(int[] nums) {

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10) {
                arr.add(nums[i]);
            } else {
                while (nums[i] >= 10) {
                    arr.add(nums[i] % 10);
                    nums[i] = nums[i] / 10;
                }
                if (nums[i] < 10) {
                    arr.add(nums[i]);
                }
            }
        }
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        arr.forEach(o->{
            stringBuilder.append(o);
        });
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = largestNumber(new int[]{3, 30, 34, 5, 9});
        System.out.println(s);
    }
}
