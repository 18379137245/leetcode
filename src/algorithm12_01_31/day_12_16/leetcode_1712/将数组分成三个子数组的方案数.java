package algorithm12_01_31.day_12_16.leetcode_1712;

public class 将数组分成三个子数组的方案数 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 5, 0};
        System.out.println(waysToSplit(nums));
    }

    public static final int MOD = (int) (1e9 + 7);

    public static int waysToSplit(int[] nums) {
        int n = nums.length;
        // 前缀和
        int[] p = new int[n + 1];
        for (int i = 0, t = 0; i < n; i++) {
            t += nums[i];
            p[i + 1] = t;
        }
        long res = 0;
        // 双指针，注意 k 的初始值需要比 j 小 1
        for (int i = 1, j = 2, k = 1; i < n - 1 && p[i] * 3 <= p[n]; i++) {
            int left = p[i];
            // 两个分割点必须保持前后顺序
            j = Math.max(i + 1, j);
            while (j < n - 1 && p[j] - p[i] < left) j++;
            while (k < n - 1 && p[k + 1] - p[i] <= p[n] - p[k + 1]) k++;
            // line 21 : 不能使用 if (k < j) break; 提前结束循环
            res += k - j + 1;
        }
        return (int) (res % MOD);
    }
}
