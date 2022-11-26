package algorithm11_01_30.day_11_25.面试题1706;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_25.面试题1706
 * @className: 二出现的次数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/25 18:55
 * @version: 1.0
 */

public class 二出现的次数 {
    public static void main(String[] args) {
        System.out.println(numberOf2sInRange(25));
    }

    public static int numberOf2sInRange(int n) {
        int ans = 0;
        int count;
        int rest;
        for (int i = 1; i <= n; i *= 10) {
            count = (n / (i * 10)) * i;
            int max = Math.max((n % (i * 10)) - ((i * 2) - 1), 0);
            rest = Math.min(max, i);
            ans += (count + rest);
        }
        return ans;
    }
}
