package com.lofxve.algorithrm.offer;

public class duplicate_test {
/*
data:2020515
author:魏振东
fun：在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，
 * 但不知道有几个数字是重复的。也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
* */
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
//        判断数组是否为空或者长度是否小于零
        if(numbers==null||length<=0)
        {
            return false;
        }
//        判断数字是否在范围内
        for(int i=0;i<length;++i)
        {
            if(numbers[i]<=0||numbers[i]>length-1)
                return false;
        }
        for(int i=0;i<length;++i)
        {
//            如果当第i个数字不等于numbers[i]
            while(numbers[i]!=i)
            {
//                第i个位置的值为numbers[i] = x ,第x的位置的值是否等于x,如果等于说明重复，不等则交换
                if(numbers[i]==numbers[numbers[i]])
                {
                    duplication[0] = numbers[i];
                    return true;
                }
                int temp = numbers[i];
                numbers[i]=numbers[temp];
                numbers[temp]=temp;
            }
        }
        return false;
    }
}
