package algorithm12_01_31.day_12_04.leetcode_74;

/**
 * @projectName: leetcode
 * @package: algorithm12_01_31.day_12_04.leetcode_74
 * @className: 搜索二维矩阵
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/12/4 18:33
 * @version: 1.0
 */

public class 搜索二维矩阵 {
    public static void main(String[] args) {
        int[][] grid = {{5, 5, 0}, {-5, -5, -5}};
        System.out.println(searchMatrix(grid,0));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix[0].length;
        int n = matrix.length;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == target) {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
