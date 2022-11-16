package algorithm9_01_30.day_9_24.leetcode_201;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_24.leetcode_201
 * @className: 数字范围按位与
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/24 20:34
 * @version: 1.0
 */

public class 数字范围按位与 {
    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(5, 7));
    }

    public static int rangeBitwiseAnd(int left, int right) {
        int count = 0;
        while (left < right) {
            left >>= 1;
            right >>= 1;
            count++;
        }
        return left << count;
    }
}
