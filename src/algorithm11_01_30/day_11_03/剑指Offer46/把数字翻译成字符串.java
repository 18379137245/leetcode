package algorithm11_01_30.day_11_03.剑指Offer46;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_03.剑指Offer46
 * @className: 把数字翻译成字符串
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/3 20:46
 * @version: 1.0
 */

public class 把数字翻译成字符串 {
    public static void main(String[] args) {
        System.out.println(translateNum(12258));
    }

    public static int translateNum(int num) {
        char[] ch = String.valueOf(num).toCharArray();
        int len = ch.length;
        int[] dp = new int[len + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= len; i++) {
            int n = (ch[i - 2] - '0') * 10 + (ch[i - 1] - '0');
            if (n >= 10 && n <= 25) {
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[len];
    }
}


