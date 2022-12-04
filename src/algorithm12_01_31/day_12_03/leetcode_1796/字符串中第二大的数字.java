package algorithm12_01_31.day_12_03.leetcode_1796;

/**
 * @projectName: leetcode
 * @package: algorithm12_01_31.day_12_01.leetcode_1796
 * @className: 字符串中第二大的数字
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/12/3 20:54
 * @version: 1.0
 */

public class 字符串中第二大的数字 {
    public static void main(String[] args) {
        System.out.println(secondHighest("dfa12321afd"));
    }

    public static int secondHighest(String s) {
        int first = -1, second = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int num = c - '0';
                if (num > first) {
                    second = first;
                    first = num;
                } else if (num < first && num > second) {
                    second = num;
                }
            }
        }
        return second;
    }
}
