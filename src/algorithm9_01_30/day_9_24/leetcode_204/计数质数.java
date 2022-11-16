package algorithm9_01_30.day_9_24.leetcode_204;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_24.leetcode_204
 * @className: 计数质数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/24 20:40
 * @version: 1.0
 */

public class 计数质数 {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            count += isPrime(i) ? 1 : 0;
        }
        return count;
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
