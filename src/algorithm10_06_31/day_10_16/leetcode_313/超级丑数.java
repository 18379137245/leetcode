package algorithm10_06_31.day_10_16.leetcode_313;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_16.leetcode_313
 * @className: 超级丑数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/16 20:40
 * @version: 1.0
 */

public class 超级丑数 {
    public static void main(String[] args) {
        int n = 12; int[] primes = {2,7,13,19};
        System.out.println(nthSuperUglyNumber(12, primes));
    }

    public static int nthSuperUglyNumber(int n, int[] primes) {
        long[] dp = new long[n];
        dp[0] = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < primes.length; i++) {
            map.put(primes[i], 0);
        }
        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
            for (int j = 0; j < primes.length; j++) {
                Integer integer = map.get(primes[j]);
                System.out.println(integer);
                dp[i] = Math.min(dp[i], dp[map.get(primes[j])] * primes[j]);
            }
            for (int j = 0; j < primes.length; j++) {
                if (dp[i] % primes[j] == 0) {
                    map.put(primes[j], map.getOrDefault(primes[j], 0) + 1);
                }
            }
        }
        return (int)dp[n - 1];
    }
}
