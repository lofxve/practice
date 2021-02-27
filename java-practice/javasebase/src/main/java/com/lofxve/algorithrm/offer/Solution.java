package com.lofxve.algorithrm.offer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {

    private static Stack<Integer> stack1 = new Stack<Integer>();
    private static Stack<Integer> stack2 = new Stack<Integer>();
    public static void push (int node){
        stack1.add(node);
    }
    public static int pop(){
        if(stack2.size()<0){
            while (!stack1.isEmpty()){
                stack2.add(stack1.pop());
            }
        }else if(stack2.size()==0){
            return -1;
        }
        return stack2.pop();
    }
    private static LinkedList<Integer> queue1 = new LinkedList<Integer>();
    private static LinkedList<Integer> queue2 = new LinkedList<Integer>();

     /*
data:2020515
author:魏振东
fun：在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，
判断数组中是否含有该整数。
* */
    public static boolean Find(int target, int [][] array) {
        boolean found = false;
//        选取右上角的点
//        行
        int row = 0;
//        列
        int cols = array[0].length-1;

        while(row<array.length&&cols>=0)
        {
            if(array[row][cols]==target)
            {
                found = true;
                return found;
            }
//            如果数组中的数大于target，则列向左移动
            else if(array[row][cols]>target)
            {
                cols--;
            }
//            如果数组中的数小于target，表示target可能在这列，则向下移动
            else{
                row++;
            }
        }
        return found;
    }
//    java字符数组char[]和字符串String之间的转换
//    使用String.valueOf()将字符数组转换成字符串
//    void (){
//        char[] s={'A','G','C','T'};
//        String st=String.valueOf(s);
//        System.out.println("This is : "+st);
//    }
//    使用.toCharArray()将字符串转换成字符数组
//    String st="AGCT";
//    char[] s=st.toCharArray();
//        for (int i=0;i<st.length();i++){
//        System.out.println("This s[i]"+i+s[i]);
//    }
//    替换空格
    public static String replaceSpace(StringBuffer str) {
//        return str.toString().replace(" ", "%20");
        if(str==null)
            return "";
//        字符串总长
        int oldlen=str.length();
//        计算空格数量
        int kong=0;
        for(int i=0;i<oldlen;i++)
        {
            if(str.charAt(i)==' ')
            {
                kong++;
            }
        }
//        新字符串长度
        int newlength = oldlen+kong*2;
//        创建字符数组
        char[] array = new char[newlength];

        int oldIndex = oldlen - 1;
        int newIndex = newlength - 1;

//        从后往前挪动
        while(oldIndex>=0 && oldlen<=newlength)
        {
            char c=str.charAt(oldIndex);
            if (c==' ')
            {
                array[newIndex--]='0';
                array[newIndex--]='2';
                array[newIndex--]='%';
            }else{

                array[newIndex--]=c;
            }
            oldIndex--;
        }
        return String.valueOf(array);
    }
//    替换空格
    public static String replaceSpace1(StringBuffer str)
    {
        StringBuffer s = new StringBuffer("");
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                s.append("%20");
            }
            else
            {
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }
//    重建二叉树
//    public TreeNode reConstructBinaryTree(int [] pre,int [] in)
//    {
//        if(pre.length==0)
//            return null;
//        int rootval = pre[0];
//        //数组长度仅为1的时候就要处理
//        if(pre.length==1)
//            return new TreeNode(rootval);
//        TreeNode root = new TreeNode(rootval);
//        int rootIndex = 0;
//        //我们先找到root所在的位置，确定好前序和中序中左子树和右子树序列的范围
//        for(int i=0;i<in.length;i++)
//        {
//            if (in[i]==rootval)
//            {
//                rootIndex =i;
//                break;;
//            }
//        }
//        //递归，假设root的左右子树都已经构建完毕，那么只要将左右子树安到root左右即可
//        //这里注意Arrays.copyOfRange(int[],start,end)是[)的区间
//        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,rootIndex+1),Arrays.copyOfRange(in,0,rootIndex));
//        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,rootIndex+1,pre.length),Arrays.copyOfRange(in,rootIndex+1,in.length));
//        return root;
//    }
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
//    二叉树的下一个节点
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null)
            return null;
//        创建指向下一个节点的引用
        TreeLinkNode pnext = null;
//        情况1：如果节点拥有右子树
        if(pNode.right!=null)
        {
//            创建右子树引用
            TreeLinkNode pr=pNode.right;
//            查找右子树最左子节点
            while(pr.left!=null)
                pr=pr.left;
//            将找到的节点赋给pnext
            pnext=pr;
        }
        else
        {
//            该节点
            TreeLinkNode pc=pNode;
//            此节点的父节点
            TreeLinkNode pp=pNode.next;
//            情况2：没有右子树，该节点是其父节点的左子树，不进入循环，直接将其父节点，交给pnext;
//            情况3:没有右子树，并且该节点并不是其父节点的左子树，进入循环，找到一个是它父节点左子树的节点，跳出循环赋给pnext;
            while(pp!=null && pc==pp.right)
            {
                pc=pp;
                pp=pp.next;
            }
            pnext=pp;
        }
        return pnext;
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] array =new int[nums.length];
        int[] l = new int[nums.length];
        int[] r = new  int[nums.length];
        l[0]=1;
        for(int i =1;i<nums.length;i++)
        {
            l[i]=l[i-1]*nums[i-1];
        }
        for(int i =nums.length-2;i>=0;i--)
        {
            r[i]=r[i+1]*nums[i+1];
        }
        r[nums.length - 1] = 1;
        for (int i =0;i<nums.length;i++)
        {
            array[i]=l[i]*r[i];
        }
        return array;
    }
    public static void main(String args[])
    {
        int[] array = {1, 2, 3, 4, 5};
        int[] arrayCopy = Arrays.copyOfRange(array, 0,3);
        System.out.println(Arrays.toString(arrayCopy)); //[1, 2, 3]
        int[] a =productExceptSelf(array);
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

//        StringBuffer s = new StringBuffer("hello world");
//        System.out.println(replaceSpace1(s));
    }
}
