package algorithm9_01_30.day_9_29.leetcode_32;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_29.leetcode_32
 * @className: 最长有效括号
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/29 20:06
 * @version: 1.0
 */

public class 最长有效括号 {
    public static void main(String[] args) {
        System.out.println(longestValidParentheses(")()(()))"));
    }

    public static int longestValidParentheses(String s) {
        int max = 0;//存放最大的长度
        int len = s.length();//字符串长度
        int left = 0;//存放（数量
        int right = 0;//存放）数量
        for (int i = 0; i < len; i++) {//从左往右遍历
            if (s.charAt(i) == '(') {
                left++;
            } else
                right++;
            if (left == right) {//左右括号一组，统计长度最大值
                max = Math.max(max, 2 * left);
            } else if (right > left) {//
                right = 0;
                left = 0;//）更多就初始化
            }
        }
        right = 0;
        left = 0;//初始化左右括号数量
        //为了避免“（）（（）（）”情况的出现，还需要右边遍历一次
        for (int i = len - 1; i >= 0; i--) {//从右往左遍历
            if (s.charAt(i) == '(') {
                left++;
            } else
                right++;
            if (left == right) {
                max = Math.max(max, 2 * left);
            } else if (right < left) {
                right = 0;
                left = 0;
            }
        }
        return max;
    }
}
