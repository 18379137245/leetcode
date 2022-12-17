package algorithm12_01_31.day_12_16.leetcode_498;

import java.util.Arrays;

public class 对角线遍历 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(findDiagonalOrder(mat)));
    }

    public static int[] findDiagonalOrder(int[][] mat) {
        // m行数 n列数
        int m = mat.length;
        int n = mat[0].length;

        int[] arr = new int[m * n];
        // index为结果数组arr的索引
        int index = 0;

        // sum表示矩阵中元素横纵坐标之和 对角线上的元素横纵坐标之和相等
        for (int sum = 0; sum <= m + n; sum++) {
            if (sum % 2 == 0) {//方向为右上,横坐标i递减，相对纵坐标sum - i递增;定i为自变量，最大值为min(sum, m - 1). 方向右下同理
                for (int i = Math.min(sum, m - 1); i >= 0 && sum - i < n; i--) {//i >= 0 && sum - i < n为方向向上边界条件
                    arr[index++] = mat[i][sum - i];
                }
            } else {//方向为左下，纵坐标i递减...
                for (int i = Math.min(sum, n - 1); sum - i < m && i >= 0; i--) {
                    arr[index++] = mat[sum - i][i];
                }
            }
        }
        return arr;
    }
}
