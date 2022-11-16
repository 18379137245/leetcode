package algorithm9_01_30.day_9_21.leetcode_172;

import java.math.BigInteger;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_21.leetcode_172
 * @className: 阶乘后的零
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/21 19:31
 * @version: 1.0
 */

public class 阶乘后的零 {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(13));
    }

    public static int trailingZeroes(int n) {
        long num = factorial(n);
        String str = String.valueOf(num);
        int count = 0;
        for (int length = str.length() - 1; length > 0; length--) {
            if(str.charAt(length) == '0'){
                count++;
            }else {
                return count;
            }
        }
        return count;
    }

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
