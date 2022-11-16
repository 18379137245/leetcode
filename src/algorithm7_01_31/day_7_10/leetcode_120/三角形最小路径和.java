package algorithm7_01_31.day_7_10.leetcode_120;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 三角形最小路径和 {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();//0
        list1.add(2);
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);
        Collections.addAll(triangle, list1, list2, list3, list4);
        System.out.println(triangle);
        System.out.println(minimumTotal(triangle));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        // dp[i][j] 表示从点 (i, j) 到底边的最小路径和。
        int[][] dp = new int[n + 1][n + 1];
        // 从三角形的最后一行开始递推。
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
//                System.out.println(dp[i][j]+" "+ dp[i + 1][j] + " " + ((dp[i + 1][j + 1]) + triangle.get(i).get(j)));
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
//                System.out.println(dp[i][j]+" "+ dp[i + 1][j] + " " + ((dp[i + 1][j + 1]) + triangle.get(i).get(j)));
            }
        }
        return dp[0][0];
    }

}
