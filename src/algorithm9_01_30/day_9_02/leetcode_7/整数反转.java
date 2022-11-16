package algorithm9_01_30.day_9_02.leetcode_7;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_02.leetcode_7
 * @className: 整数反转
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/2 19:55
 * @version: 1.0
 */

public class 整数反转 {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        sb.append(Math.abs(x));

        try {
            int result = Integer.parseInt(sb.reverse().toString());
            return x > 0 ? result : -result;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
