package algorithm11_01_30.day_11_29.leetcode_1758;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_29.leetcode_1758
 * @className: 生成交替二进制字符串的最少操作数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/29 19:48
 * @version: 1.0
 */

public class 生成交替二进制字符串的最少操作数 {
    public static void main(String[] args) {
        System.out.println(minOperations("10110"));
    }

    public static int minOperations(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != (char) ('0' + i % 2)) {
                cnt++;
            }
        }
        return Math.min(cnt, s.length() - cnt);
    }
}
