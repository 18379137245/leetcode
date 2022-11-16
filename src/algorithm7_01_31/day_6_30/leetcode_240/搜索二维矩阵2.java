package algorithm7_01_31.day_6_30.leetcode_240;

import java.util.Scanner;

public class 搜索二维矩阵2 {
    public static void main(String[] args) {
//        int[][] matrix =   {{1,4,7,11,15},
//                            {2,5,8,12,19},
//                            {3,6,9,16,22},
//                            {10,13,14,17,24},
//                            {18,21,23,26,30}} ;
        int[][] matrix = {{-1,3}};
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        System.out.println(searchMatrix(matrix, target));
    }

    private static boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == target){
                    System.out.println(matrix[i][j]);
                    return true;
                }
            }
        }
        return false;
    }
//    public static boolean searchMatrix(int[][] matrix, int target) {
//        //从矩阵右上角开始搜索
//        int col = matrix[0].length - 1;//列
//        int row = 0;//行
//
//        while (col >= 0 && row <= matrix.length - 1) {
//            if (target == matrix[row][col]) {
//                //如果找到就直接返回
//                return true;
//            } else if (target < matrix[row][col]) {
//                //如果查找的值大了，下一步往左找
//                col--;
//            } else if (target > matrix[row][col]) {
//                //如果查找的值小了，下一步往下找
//                row++;
//            }
//        }
//        return false;
//    }
}
