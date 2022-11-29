package algorithm11_01_30.day_11_28.leetcode_69;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_28.leetcode_69
 * @className: x的平方根
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/28 18:25
 * @version: 1.0
 */

public class x的平方根 {
    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }

    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans = 0;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if ((long)mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            }else  {
                right = mid - 1;
            }
        }
        return ans;
    }
}
