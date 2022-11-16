package algorithm8_01_31.day_8_19.leetcode_566;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_19.leetcode_566
 * @className: 重塑矩阵
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/19 20:47
 * @version: 1.0
 */

public class 重塑矩阵 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};

        int[][] ints = matrixReshape(mat, 1, 4);
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.println(ints[i][j]);
            }
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        //总长度不一样返回原数组
        if (r * c != m * n) {
            return mat;
        }
        //定义新的数组
        int[][] arr = new int[r][c];
        for (int i = 0; i < m * n; i++) {
            //赋值
            arr[i / c][i % c] = mat[i / n][i % n];
        }
        return arr;
    }
}
