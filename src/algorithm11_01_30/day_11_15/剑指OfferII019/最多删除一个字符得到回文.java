package algorithm11_01_30.day_11_15.剑指OfferII019;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_15.剑指OfferII019
 * @className: 最多删除一个字符得到回文
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/15 20:07
 * @version: 1.0
 */

public class 最多删除一个字符得到回文 {

    public static void main(String[] args) {
        String s = "1bba1";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        int low = 0, high = s.length() - 1;
        while (low < high) {
            char c1 = s.charAt(low), c2 = s.charAt(high);
            if (c1 == c2) {
                ++low;
                --high;
            } else {
                return validPalindrome(s, low, high - 1) || validPalindrome(s, low + 1, high);
            }
        }
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
