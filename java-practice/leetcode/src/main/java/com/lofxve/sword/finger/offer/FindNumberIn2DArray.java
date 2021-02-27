package com.lofxve.sword.finger.offer;

/**
 * 二维数组中的查找
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * @ClassName FindNumberIn2DArray
 * @Author lofxve
 * @Date 2021/2/26 10:18
 * @Version 1.0
 */
public class FindNumberIn2DArray {
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        // 行
        int row = 0;
        // 列
        int cols = matrix[0].length - 1;
        // 选取右上角的节点进行比较
        while (row < matrix.length && cols >= 0) {
            if (matrix[row][cols] == target) {
                return true;
                // 如果数组中的数大于target则向左移动
            } else if (matrix[row][cols] > target) {
                cols--;
                // 如果数组中的数小于target则向下移动
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String args[]) {
//        int[][] array = new int[][]{{1, 2, 8, 9}, {4, 7, 10, 13}};
        int[][] array = new int[][]{};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[0].length; j++) {
//                System.out.print(array[i][j]);
//            }
//            System.out.println();
//        }

        System.out.println(findNumberIn2DArray(array, 7));

    }
}
