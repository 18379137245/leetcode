package algorithm11_01_30.day_11_18.面试题08;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_18.面试题08
 * @className: 零矩阵
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/18 20:29
 * @version: 1.0
 */

public class 零矩阵 {

    public static void main(String[] args) {
        int[][] matrix = {{5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 0, 6, 7},
                {15, 14, 12, 16}};
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        //行
        boolean[] row = new boolean[m];
        //列
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println();
    }
}
