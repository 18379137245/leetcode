package algorithm10_06_31.day_10_10.leetcode_123;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_10.leetcode_122
 * @className: 买卖股票的最佳时机2
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/10 20:04
 * @version: 1.0
 */

public class 买卖股票的最佳时机3 {
    public static void main(String[] args) {
        int[] nums = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(maxProfit(nums));
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int buy1 = -prices[0], sell1 = 0;
        int buy2 = -prices[0], sell2 = 0;
        for (int i = 1; i < n; ++i) {
            buy1 = Math.max(buy1, -prices[i]);
            sell1 = Math.max(sell1, buy1 + prices[i]);
            buy2 = Math.max(buy2, sell1 - prices[i]);
            sell2 = Math.max(sell2, buy2 + prices[i]);
        }
        return sell2;
    }
}
