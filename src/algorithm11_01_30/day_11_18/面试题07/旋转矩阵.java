package algorithm11_01_30.day_11_18.面试题07;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_18.面试题07
 * @className: 旋转矩阵
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/18 20:16
 * @version: 1.0
 */

public class 旋转矩阵 {

    public static void main(String[] args) {
        int[][] matrix = {{5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}};
        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        // 水平翻转
        for (int i = 0; i < n / 2; ++i) {
            for (int j = 0; j < n; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - i - 1][j];
                matrix[n - i - 1][j] = temp;
            }
        }
        // 主对角线翻转
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
