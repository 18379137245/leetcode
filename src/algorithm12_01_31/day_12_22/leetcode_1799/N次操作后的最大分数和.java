package algorithm12_01_31.day_12_22.leetcode_1799;

public class N次操作后的最大分数和 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 6, 8};
        System.out.println(maxScore(nums));
    }

    public static int maxScore(int[] nums) {
        int n = nums.length;

        int[][] gcdCache = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                gcdCache[i][j] = gcd(nums[i], nums[j]);
            }
        }
        int[] dp = new int[1 << n];
        int state = (1 << n) - 1;
        return help(nums, state, dp, 1, gcdCache);
    }

    // state >> i 是0，则代表第i位已删除
    // dp[state] = x
    public static int help(int[] nums, int state, int[] dp, int base, int[][] gcdCache) {
        if (state == 0) {
            return 0;
        }
        if (dp[state] != 0) {
            return dp[state];
        }
        int n = nums.length;
        // 枚举所有此时可以删除的情况
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (!canUse(state, i)) continue;
            for (int j = i + 1; j < n; j++) {
                if (!canUse(state, j)) continue;
                int ns = state ^ (1 << i) ^ 1 << j;
                ans = Math.max(ans, base * gcdCache[i][j] + help(nums, ns, dp, base + 1, gcdCache));
            }
        }

        dp[state] = ans;

        return ans;
    }

    public static boolean canUse(int state, int i) {
        return ((state >> i) & 1) != 0;
    }

    public static int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}
