package algorithm11_01_30.day_11_27.leetcode_367;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_27.leetcode_367
 * @className: 有效的完全平方数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/27 18:20
 * @version: 1.0
 */

public class 有效的完全平方数 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));
    }

    public static boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while (left <= right){
            int mid = (right - left) / 2 + left;
            if(mid * mid > num){
                right = mid - 1;
            }else if(mid * mid < num){
                left = mid + 1;
            }else {
                return true;
            }
        }
        return false;
    }
}
