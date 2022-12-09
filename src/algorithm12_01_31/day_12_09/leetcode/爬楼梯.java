package algorithm12_01_31.day_12_09.leetcode;

public class 爬楼梯 {
    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
    public static int climbStairs(int n) {
        if(n <= 2){//当有0、1、2个台阶时，分别有0、1、2种方法
            return n;
        }
        int[] dp = new int[n]; //记录从1个台阶到n个台阶中，每个台阶所需要的方法。
        dp[0] = 1; //dp[0]是第一个台阶
        dp[1] = 2; //dp[1]是第二个台阶
        for(int i = 2; i < n; i++){//i=2时是第三个台阶，i=n-1时是第n个台阶。
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1]; //dp[n-1]是第n个台阶
    }
}
