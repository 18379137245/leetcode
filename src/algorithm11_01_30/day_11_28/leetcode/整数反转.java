package algorithm11_01_30.day_11_28.leetcode;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_28.leetcode
 * @className: 整数反转
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/28 19:07
 * @version: 1.0
 */

public class 整数反转 {
    public static void main(String[] args) {
        int a = reverse(-120);
        System.out.println(a);
    }

    private static int reverse(int x) {
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
