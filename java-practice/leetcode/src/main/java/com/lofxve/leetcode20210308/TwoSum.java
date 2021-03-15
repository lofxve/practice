package com.lofxve.leetcode20210308;

import java.util.HashMap;

/**
 * @ClassName TwoSum
 * @Author lofxve
 * @Date 2021/3/14 9:36
 * @Version 1.0
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
