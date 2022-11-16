package algorithm10_06_31.day_10_17.leetcode_696;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_17.leetcode_696
 * @className: 计算二进制子串
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/17 17:47
 * @version: 1.0
 */

public class 计算二进制子串 {

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
    }

    public static int countBinarySubstrings(String s) {
        int ptr = 0, n = s.length(), last = 0, ans = 0;
        while (ptr < n) {
            //当前索引位置元素
            char c = s.charAt(ptr);
            //清零
            int count = 0;
            while (ptr < n && s.charAt(ptr) == c) {
                //索引位置
                ++ptr;
                //连续相同的数才计数
                ++count;
            }
            //加最小值
            ans += Math.min(count, last);
            //赋值
            last = count;
        }
        //返回总数
        return ans;
    }
}
