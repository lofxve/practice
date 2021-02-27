package com.lofxve.algorithrm.leetcode;

/***
 * @Author weizhendong
 * @Description //TODO 翻转二叉树
 * @Date 14:06 2020/9/17
 * @Param 
 * @return 
 **/
public class invertTree {
    public static void inorderTree(TreeNode root){
        if (root == null)
            return;
        TreeNode temp1 = root.left;
        root.left = root.right;
        root.right = temp1;
        inorderTree(root.right);
        inorderTree(root.left);
    }
    public TreeNode invertTree(TreeNode root) {
        inorderTree(root);
        return root;
    }
}
