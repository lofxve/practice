package com.lofxve.sword.finger.offer;

import java.util.Arrays;

/**
 * 剑指 Offer 07. 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * @ClassName BuildTree
 * @Author lofxve
 * @Date 2021/3/2 23:32
 * @Version 1.0
 */
public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) {
            return null;
        }

        // 获取根节点的值
        int rootval = preorder[0];
        // 如果只剩一个值，则直接返回
        if (preorder.length == 1) {
            return new TreeNode(rootval);
        }

        // 初始化根节点，以及根节点的坐标
        TreeNode root = new TreeNode(rootval);
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (rootval == inorder[i]) {
                index = i;
            }
        }
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
        root.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));

        return root;
    }
}
