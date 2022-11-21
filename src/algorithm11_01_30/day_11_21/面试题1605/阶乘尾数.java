package algorithm11_01_30.day_11_21.面试题1605;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_21.面试题1605
 * @className: 阶乘尾数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/21 19:20
 * @version: 1.0
 */

public class 阶乘尾数 {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(10));
    }

    public static int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }
}
