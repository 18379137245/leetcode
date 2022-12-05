package algorithm12_01_31.day_12_04.leetcode_633;

/**
 * @projectName: leetcode
 * @package: algorithm12_01_31.day_12_04.leetcode_633
 * @className: 平方数之和
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/12/4 20:15
 * @version: 1.0
 */

public class 平方数之和 {
    public static void main(String[] args) {
        System.out.println(judgeSquareSum(18));
    }

    public static boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long) Math.sqrt(c);
        while (left <= right) {
            long sum = left * left + right * right;
            if (sum == c) {
                return true;
            } else if (sum > c) {
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}
