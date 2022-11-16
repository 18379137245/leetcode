package algorithm8_01_31.day_8_31.leetcode_693;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_31.leetcode_693
 * @className: 交替位二进制数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/31 20:03
 * @version: 1.0
 */

public class 交替位二进制数 {

    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(1));
    }

    public static boolean hasAlternatingBits(int n) {
        StringBuffer str = new StringBuffer();
        while (n > 0) {
            int i = n % 2;
            str.append(i);
            n /= 2;
        }
        str.append(" ");
        String s = str.toString();
        System.out.println(s);
        boolean b = false;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 != s.length() && s.charAt(i) != s.charAt(i + 1)) {
                b = true;
            } else if (i + 1 == s.length()) {
                return b;
            } else {
                return false;
            }
        }
        return b;
    }

    public static boolean hasAlternatingBits1(int n) {
        int prev = 2;
        while (n != 0) {
            int cur = n % 2;
            if (cur == prev) {
                return false;
            }
            prev = cur;
            n /= 2;
        }
        return true;
    }
}
