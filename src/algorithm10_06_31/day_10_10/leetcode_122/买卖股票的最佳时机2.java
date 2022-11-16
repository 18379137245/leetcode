package algorithm10_06_31.day_10_10.leetcode_122;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_10.leetcode_122
 * @className: 买卖股票的最佳时机2
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/10 20:04
 * @version: 1.0
 */

public class 买卖股票的最佳时机2 {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(maxProfit(nums));
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
