package algorithm10_06_31.day_10_18.letcode_746;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_18.letcode_746
 * @className: 使用最小花费爬楼梯
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/18 18:29
 * @version: 1.0
 */

public class 使用最小花费爬楼梯 {

    public static void main(String[] args) {

        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        for (int i = 2; i < n; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[n - 1], cost[n - 2]);
    }


}
