package com.lofxve.base.paixu;

import java.util.ArrayList;

public class Test2 {
    //二分查找
    public static int bisearch(Integer[] arr, int low, int hight, int k){
        int mid = (low + hight)/2;
        if (k > arr[mid]){
            return bisearch(arr,mid+1,hight,k);
        }else if (k < arr[mid]){
            return bisearch(arr,low,mid-1,k);
        }
        return mid;
    }
    //选择排序
    public static void searchsort(Integer[] arr){
        int len = arr.length;
        for(int i = 0; i < len-1 ; i++){
            int min = i; // 遍历的区间最小的值
            for (int j = i + 1; j < len ;j++){
                if(arr[j] < arr[min]){
                    // 找到当前遍历区间最小的值的索引
                    min = j;
                }
            }
            if(min != i){
                // 发生了调换
                int temp =  arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
    //插入排序
    public static void insertsort(Integer[] arr){
        int len = arr.length;
        for (int i = 1;i<len;i++){
            for(int j = i;j>0;j--){
                if(arr[j-1]>arr[j]){
                    Integer temp =  arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    public static void insertsort1(Integer[] arr){
        int len = arr.length;
        for (int i = 1;i<len;i++){
            for (int j = i ;j>0;j--){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    //冒泡排序
    public static void bubblesort(Integer[] arr){
        int len = arr.length;
        for (int i = 0;i<len;i++){
            for (int j = 1; j<len-i;j++){
                if(arr[j-1] > arr[j]){
                    Integer temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }
    //快速排序
    public static void quicksort(Integer[] arr ,int low,int high){
        if (low>high){
            return;
        }
        int i = low;
        int j = high;
        int x = arr[low];
        while(i<j){
            while (i<j&&arr[j]>=x)
                j--;
            while(i<j&&arr[i]<=x)
                i++;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[i];
        arr[i] = x;
        quicksort(arr,low,j-1);
        quicksort(arr,j+1,high);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0;i<10;i++){
            arr.add((int) (Math.random()*100));
        }
        Integer[] intArray = arr.toArray(new Integer[arr.size()]);
        //冒泡
//        bubblesort(intArray);
        //选择
//        searchsort(intArray);
        //插入
//        insertsort(intArray);
        insertsort1(intArray);
        //快排
//        quicksort(intArray,0,intArray.length-1);
        for (Object o :intArray) {
            System.out.print(o+" ");
        }
    }
}