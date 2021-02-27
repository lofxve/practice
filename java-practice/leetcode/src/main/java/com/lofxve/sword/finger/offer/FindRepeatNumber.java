package com.lofxve.sword.finger.offer;

/**
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，
 * 但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * @ClassName FindRepeatNumber
 * @Author lofxve
 * @Date 2021/2/24 22:17
 * @Version 1.0
 */
public class FindRepeatNumber {
    public static int findRepeatNumber(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 || nums[i] > nums.length - 1) {
                return -1;
            }
            // 如果当第i个数字不等于numbers[i]
            while (nums[i] != i) {
                // 第i个位置的值为nums[i] = x ,第x的位置的值是否等于x,如果等于说明重复，不等则交换
                if (nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(arr));
    }
}
