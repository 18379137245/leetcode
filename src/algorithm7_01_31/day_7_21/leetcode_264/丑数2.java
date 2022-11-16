package algorithm7_01_31.day_7_21.leetcode_264;

import java.util.Arrays;

public class 丑数2 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(12));
    }
    public static int nthUglyNumber(int n) {
        //定义一个数组 n+1 防止数组越界
        int[] dp = new int[n + 1];

        //初始化 索引1 为 1 跳过 dp[0]
        dp[1] = 1;
        //定义 3个 变量 初始化 为 1
        int p2 = 1, p3 = 1, p5 = 1;
        //循环次数从2 开始 到输入数值数 n
        for (int i = 2; i <= n; i++) {
            // 挨个 给 三个变量 赋值 p2 p3 p4 都是 1 后面随着循环次数的增加 会 ++
            //所以第一次为 2 3 5
            int num2 = dp[p2] * 2, num3 = dp[p3] * 3, num5 = dp[p5] * 5;
            //dp[i] = 取上面 3 个数的最小值  给dp[i] 赋值
            dp[i] = Math.min(Math.min(num2, num3), num5);
            //判断 如果 这个最小值dp[i]的元素 等于 上面 的num2 p2++
            if (dp[i] == num2) {
                p2++;
            }
            //判断 如果 这个最小值dp[i]的元素 等于 上面 的num2 p3++
            if (dp[i] == num3) {
                p3++;
            }
            //判断 如果 这个最小值dp[i]的元素 等于 上面 的num2 p5++
            if (dp[i] == num5) {
                p5++;
            }
        }
        System.out.println(Arrays.toString(dp));
        //到这证明循环结束 返回 dp这个数组的最后一个元素
        return dp[n];
    }
}
