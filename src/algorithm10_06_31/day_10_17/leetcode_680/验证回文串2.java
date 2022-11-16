package algorithm10_06_31.day_10_17.leetcode_680;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_17.leetcode_680
 * @className: 验证回文串2
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/17 19:03
 * @version: 1.0
 */

public class 验证回文串2 {
    public static void main(String[] args) {
        validPalindrome("abca");
    }

    public static boolean validPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while (low < high) {
            //左右指针
            char c1 = s.charAt(low), c2 = s.charAt(high);
            //成立
            if (c1 == c2) {
                //右移一位
                ++low;
                //左移一位
                --high;
            } else {
                //到这证明左右不一样
                //只要有一个为true 就返回true
                //都是false 返回false
                return validPalindrome(s, low, high - 1) || validPalindrome(s, low + 1, high);
            }
        }
        //到这证明就是一个回文数
        return true;
    }

    public static boolean validPalindrome(String s, int low, int high) {
        for (int i = low, j = high; i < j; ++i, --j) {
            char c1 = s.charAt(i), c2 = s.charAt(j);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }
}
