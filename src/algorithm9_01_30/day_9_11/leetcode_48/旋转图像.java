package algorithm9_01_30.day_9_11.leetcode_48;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_11.leetcode_48
 * @className: 旋转图像
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/11 20:46
 * @version: 1.0
 */

public class 旋转图像 {
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3},{4,5,6},{ 7,8,9}};
        rotate(matrix);
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] matrix_new = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                //把一排的第一个元素放到最后，第二个放到倒数第二个以此类推
                //得到新的矩阵
                matrix_new[j][n - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                //题目需要原地替换就是说还是要原来的数组
                matrix[i][j] = matrix_new[i][j];
            }
        }
    }

}
