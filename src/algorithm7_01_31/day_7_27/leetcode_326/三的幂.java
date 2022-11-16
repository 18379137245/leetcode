package algorithm7_01_31.day_7_27.leetcode_326;

public class 三的幂 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree( 4));
    }

    public static boolean isPowerOfThree(int n) {
        //进来的数不等于0 并且n对3取余==0
        //不成立直接返回 n == 1 不成立false 成立 true
        while (n != 0 && n % 3 == 0) {
            //成立进来  除以 3  再次判断 n != 0 && n % 3 == 0
            n /= 3;
        }
        //返回
        return n == 1;
    }
}