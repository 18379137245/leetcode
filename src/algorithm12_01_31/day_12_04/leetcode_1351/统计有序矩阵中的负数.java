package algorithm12_01_31.day_12_04.leetcode_1351;

/**
 * @projectName: leetcode
 * @package: algorithm12_01_31.day_12_04.leetcode_1351
 * @className: 统计有序矩阵中的负数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/12/4 18:19
 * @version: 1.0
 */

public class 统计有序矩阵中的负数 {
    public static void main(String[] args) {
        int[][] grid = {{5, 5, 0}, {-5, -5, -5}};
        System.out.println(countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {
        int m = grid[0].length;
        int n = grid.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] < 0) {
                    count++;
                }
            }
        }
        return count;

    }
}
