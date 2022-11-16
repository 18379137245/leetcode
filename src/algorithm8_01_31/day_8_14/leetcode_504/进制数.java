package algorithm8_01_31.day_8_14.leetcode_504;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_14.leetcode_504
 * @className: 进制数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/14 18:35
 * @version: 1.0
 */

public class 进制数 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(-100));
    }

    public static String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean success = false;
        if (num < 0) {
            num = Math.abs(num);
            success = true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (num > 0) {
            int i = num % 7;
            stringBuilder.append(i);
            num /= 7;
        }
        if (success) {
            stringBuilder.append("-");
            return stringBuilder.reverse().toString();
        } else
            return stringBuilder.reverse().toString();
    }
}
