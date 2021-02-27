package com.lofxve.algorithrm.leetcode;

import java.util.ArrayList;
import java.util.List;

/***
 * @Author weizhendong
 * @Description //TODO 中序遍历二叉树
 * @Date 16:45 2020/9/14
 * @Param 
 * @return 
 **/
public class InorderTraversal {
    /**
     * @Author weizhendong
     * @Description //TODO 中序递归遍历二叉树
     * @Date 17:06 2020/9/14
     * @Param [root, arr]
     * @return void
     **/
    public static void inorderTree(TreeNode root,List<Integer> arr){
        if (root == null)
            return;
        inorderTree(root.left, arr);
        arr.add(root.val);
        inorderTree(root.right, arr);
    }
    
    /**
     * @Author weizhendong
     * @Description //TODO 中序遍历并将所得值加入到list中
     * @Date 17:07 2020/9/14
     * @Param [root]
     * @return java.util.List<java.lang.Integer>
     **/
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if(root==null)
            return arr;
        inorderTree(root,arr);
        return arr;
    }
}
