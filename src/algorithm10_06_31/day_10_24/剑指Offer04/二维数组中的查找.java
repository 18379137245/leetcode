package algorithm10_06_31.day_10_24.剑指Offer04;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_24.剑指Offer04
 * @className: 二维数组中的查找
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/24 20:16
 * @version: 1.0
 */

public class 二维数组中的查找 {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        System.out.println(findNumberIn2DArray(matrix,5));
    }
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
