package algorithm11_01_30.day_11_25.leetcode;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_25.leetcode
 * @className: 买卖股票的最佳时机
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/25 19:53
 * @version: 1.0
 */

public class 买卖股票的最佳时机 {
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int len = prices.length;
        if (len < 2) {
            return 0;
        }
        int res = 0;
        for (int i = 1; i < len; i++) {
            res += Math.max(prices[i] - prices[i - 1], 0);
        }
        return res;
    }
}
