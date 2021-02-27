package com.lofxve.base.chazhao;

import static com.lofxve.base.paixu.test.Insert_Sort;

public class test {
//    顺序查找
    public static int sequential(int[] arr,int key)
    {
        arr[0] = key;
        int i = arr.length-1;
        while(arr[i] != key)
        {
            i--;
        }
        return i;
    }
//    二分查找
    public static int Binarysearch(int[] arr,int key,int low,int high)
    {
        int mid =(low+high)/2;
        if (arr[mid]==key)
            return mid;
        else if (arr[mid]>key)
        {
            return Binarysearch(arr,key,low,mid-1);
        }
        else
        {
            return Binarysearch(arr,key,mid+1,high);
        }
    }
//    插值查找
    public static int InsertionSearch(int[] arr,int key,int low,int high)
    {
        int mid =low+(key-arr[low])/(arr[high]-arr[low])*(high-low);
        if (arr[mid]==key)
            return mid;
        else if (arr[mid]>key)
        {
            return InsertionSearch(arr,key,low,mid-1);
        }
        else
        {
            return InsertionSearch(arr,key,mid+1,high);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = (int)(Math.random()*100);
        }
//        Scanner input = new Scanner(System.in);
//        int k = input.nextInt();
        Insert_Sort(arr);
        for(int a:arr)
        {
            System.out.print(a+",");
        }
        System.out.println();
        int k = sequential(arr,7);
        System.out.print("顺序查找："+k);

        System.out.println();
        int kb = Binarysearch(arr,arr[5],0,arr.length-1);
        System.out.print("二分查找："+kb);

        System.out.println();
        int ki = InsertionSearch(arr,arr[5],0,arr.length-1);
        System.out.print("插入查找："+ki);
    }
}
