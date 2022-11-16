package algorithm10_06_31.day_10_08.leetcode_74;

import sun.rmi.transport.tcp.TCPTransport;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_08.leetcode_73
 * @className: 矩阵置零
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/8 19:06
 * @version: 1.0
 */

public class 搜索二维矩阵 {
    public static void main(String[] args) {
        int[][] matrix = {{1,3}}; int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
