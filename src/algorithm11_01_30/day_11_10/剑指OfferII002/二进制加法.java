package algorithm11_01_30.day_11_10.剑指OfferII002;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_10.剑指OfferII002
 * @className: 二进制加法
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/10 19:26
 * @version: 1.0
 */

public class 二进制加法 {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "101"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int carry = 0;
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        while (l1 >= 0 || l2 >= 0) {
            int x = l1 < 0 ? 0 : a.charAt(l1) - '0';
            int y = l2 < 0 ? 0 : b.charAt(l2) - '0';

            int sum = x + y + carry;
            res.append(sum % 2);
            carry = sum / 2;

            l1--;
            l2--;
        }
        if (carry != 0) res.append(carry);
        return res.reverse().toString();
    }
}
