package algorithm9_01_30.day_9_09.leetcode_43;

import java.math.BigInteger;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_09.leetcode_43
 * @className: 字符串相乘
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/9 20:47
 * @version: 1.0
 */

public class 字符串相乘 {
    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
    }

    public static String multiply(String num1, String num2) {
        int n = num1.length(), m = num2.length();
        int[] res = new int[n + m];
        //从末尾开始计算
        for (int i = n - 1; i >= 0; i--) {
            //num1最后一位
            int a = num1.charAt(i) - '0';
            for (int j = m - 1; j >= 0; j--) {
                //num2最后一位
                int b = num2.charAt(j) - '0';
                //第一次 r = 18
                //第二次 r = 15
                int r = a * b;
                //第一次 r = [2 + 2 + 1] = 18 + 0
                //第二次 r = [2 + 1 + 1] = 18 + 15
                r += res[i + j + 1];
                //第一次res [2 + 2 + 1] = 8
                //第二次res [2 + 1 + 1] = 5
                res[i + j + 1] = r % 10;
                //第一次res[2 + 2] = 1
                //第二次res[2 + 1] = 1 + 1
                res[i + j] += r / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n + m; i++) {
            //长度为0并且第一个元素为0
            if (sb.length() == 0 && res[i] == 0) continue;
            //字符串拼接
            sb.append(res[i]);
        }
        //成立选第一个不成立选第二个
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
