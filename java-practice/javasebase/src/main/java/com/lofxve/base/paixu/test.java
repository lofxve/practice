package com.lofxve.base.paixu;

public class test {

    public static void Swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
//    冒泡排序
    public static void BubbleSort(int[] arr)
    {
        boolean flag= false;
        for (int i=0;i<arr.length;i++)
        {
            // 每次遍历标志位都要先置为false，才能判断后面的元素是否发生了交换
            flag = false;
            for(int j =0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    Swap(arr,j,j+1);
                    flag = true;    //只要有发生了交换，flag就置为true
                }
            }
            // 判断标志位是否为false，如果为false，说明后面的元素已经有序，就直接return
            if(!flag) break;
        }
    }
//    选择排序
    public static void Select_Sort(int[] arr)
    {
        for (int i=0;i<arr.length-1;i++)
        {

            int minindex = i;
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minindex])
                {
                    minindex =j;
                }
            }
            if (minindex!=i)
            {
                Swap(arr,i,minindex);
            }
        }
    }
//    插入排序
    public static void Insert_Sort(int[] arr)
    {
        for (int i=0;i<arr.length-1;i++)
        {
            for(int j =i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                   Swap(arr,j,j-1);
                }
                else
                    break;
            }
        }
    }
//    快速排序
    public static void quicksort(int[] arr,int l,int r)
    {
        int i = l;
        int j = r;
        int x = arr[i];
        while (i<j)
        {
            while(i<j&&arr[j]>=x)
            j--;
            if(i<j)
            {
                arr[i++]=arr[j];
            }
            while(i<j&&arr[i]<x)
                i++;
            if(i<j)
            {
                arr[j--]=arr[i];
            }

            arr[i] = x;
            quicksort(arr,l,i-1);
            quicksort(arr,i+1,r);
        }
    }
    public static void main(String[] args)
    {
        int[] arr = new int[10];
        for(int i =0;i<arr.length;i++)
        {
            arr[i] = (int)(Math.random()*100);
        }
        for(int a:arr)
        {
            System.out.print(a+",");
        }
        System.out.println();
//        System.out.print("冒泡排序：");
//        BubbleSort(arr);
//        System.out.print("选择排序：");
//        Select_Sort(arr);
//        System.out.print("插入排序：");
//        Insert_Sort(arr);
        System.out.print("快速排序：");
        quicksort(arr,0,arr.length-1);
        for(int a:arr)
        {
            System.out.print(a+",");
        }

    }
}
