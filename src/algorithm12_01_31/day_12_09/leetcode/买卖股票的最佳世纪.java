package algorithm12_01_31.day_12_09.leetcode;

public class 买卖股票的最佳世纪 {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int minprices = prices[0];
        int maxprices = 0;
        for (int i = 0; i < n; i++) {
            minprices = Math.min(minprices,prices[i]);
            maxprices = Math.max(maxprices,prices[i]-minprices);
        }
        return maxprices;
    }
}
