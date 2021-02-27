package com.lofxve.task.task02;


import java.util.Arrays;

/**
 * @ClassName Test15
 * @Author 魏振东
 * @Date 2020/12/14 18:24
 */
public class Test15 {
    public static void main(String[] args) {
        int[] arr = {55,77,0,88,22,44,33};
        int[] newarr = new int[7];

        System.arraycopy(arr,0,newarr,0,2);
        System.arraycopy(arr,3,newarr,2,4);
        System.arraycopy(arr,2,newarr,6,1);

        System.out.println(Arrays.toString(newarr));
    }

}