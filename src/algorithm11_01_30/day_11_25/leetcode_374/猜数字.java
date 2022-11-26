package algorithm11_01_30.day_11_25.leetcode_374;

import static algorithm7_01_31.day_7_31.leetcode_374.猜数字大小.guess;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_25.leetcode_374
 * @className: 猜数字
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/25 19:26
 * @version: 1.0
 */

public class 猜数字 {
    public static void main(String[] args) {
        System.out.println(guessNumber(10));
    }

    public static int guessNumber(int n) {
        //定义左右两端的值
        int left = 1, right = n;
        // 循环条件左边小于右边
        while (left < right) {
            //找出中间值
            int mid = left + (right - left) / 2;
            //guess(mid) 调用自带的方法
            //如果大于随机数返回 -1
            //如果大于随机数返回 1
            //等于随机数返回 0
            if (guess(mid) <= 0) {
                right = mid; // 答案在区间 [left, mid] 中
            } else {
                left = mid + 1; // 答案在区间 [mid+1, right] 中
            }
        }
        // 此时有 left == right，区间缩为一个点，即为答案
        return left;
    }
}
