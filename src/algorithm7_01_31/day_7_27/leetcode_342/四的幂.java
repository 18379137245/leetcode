package algorithm7_01_31.day_7_27.leetcode_342;

public class 四的幂 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour( 4));
    }
    public static boolean isPowerOfFour(int n) {
        //进来的数不等于0 并且n对4取余==0
        //不成立直接返回 n == 1 不成立false 成立 true
        while (n != 0 && n % 4 == 0) {
            //成立进来  除以 4  再次判断 n != 0 && n % 4 == 0
            n /= 4;
        }
        //返回
        return n == 1;
    }
}
