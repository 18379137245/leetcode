package algorithm11_01_30.day_11_02.剑指Offer43;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_02.剑指Offer43
 * @className: 整数中1出现的次数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/2 20:39
 * @version: 1.0
 */

public class 整数中1出现的次数 {
    public static void main(String[] args) {
        System.out.println(20 % 10);
        System.out.println(countDigitOne(110));
    }

    public static int countDigitOne(int n) {
        // mulk 表示 10^k
        // 在下面的代码中，可以发现 k 并没有被直接使用到（都是使用 10^k）
        // 但为了让代码看起来更加直观，这里保留了 k
        long mulk = 1;
        int ans = 0;
        for (int k = 0; n >= mulk; ++k) {
            ans += (n / (mulk * 10)) * mulk + Math.min(Math.max(n % (mulk * 10) - mulk + 1, 0), mulk);
            mulk *= 10;
        }
        return ans;
    }

}
