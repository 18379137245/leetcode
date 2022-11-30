package algorithm11_01_30.day_11_30.leetcode_441;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_30.leetcode_441
 * @className: 排列硬币
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/30 18:46
 * @version: 1.0
 */

public class 排列硬币 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }

    public static int arrangeCoins(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = (right - left + 1) / 2 + left;
            if ((long) mid * (mid + 1) <= (long) 2 * n) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
