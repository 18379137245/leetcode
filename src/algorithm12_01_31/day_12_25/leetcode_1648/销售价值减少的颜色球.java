package algorithm12_01_31.day_12_25.leetcode_1648;

import java.util.Arrays;

public class 销售价值减少的颜色球 {
    public static void main(String[] args) {
        int[] inventory = {2, 5};
        int orders = 4;
        System.out.println(maxProfit(inventory, orders));
    }

    static int mod = (int) 1e9 + 7;

    public static int maxProfit(int[] inventory, int orders) {
        long l = 0, r = Arrays.stream(inventory).max().getAsInt();
        long cut = 0;
        while (l <= r) {
            long mid = l + ((r - l) >> 1);
            long sum = 0;
            for (long num : inventory) {
                if (num > mid) {
                    long size = num - mid;
                    sum += size;
                }
            }
            if (sum >= orders) {
                cut = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        long sum = 0;
        cut += 1;
        long ans = 0;
        for (long num : inventory) {
            if (num > cut) {
                long size = num - cut;
                sum += size;
                ans += ((num + cut + 1) * size / 2) % mod;
                ans %= mod;
            }
        }
        ans += ((orders - sum) * cut) % mod;
        ans %= mod;
        return (int) ans;
    }

}
