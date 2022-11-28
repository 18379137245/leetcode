package algorithm11_01_30.day_11_27.leetcode;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_27.leetcode
 * @className: 旋转图像
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/27 19:38
 * @version: 1.0
 */

public class 旋转图像 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
    }

    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] matrixNew = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                //把一排的第一个元素放到最后，第二个放到倒数第二个以此类推
                //得到新的矩阵
                matrixNew[j][n - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                //题目需要原地替换就是说还是要原来的数组
                matrix[i][j] = matrixNew[i][j];
            }
        }
    }
}
