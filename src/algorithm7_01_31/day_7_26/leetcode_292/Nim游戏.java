package algorithm7_01_31.day_7_26.leetcode_292;

public class Nim游戏 {
    public static void main(String[] args) {
        System.out.println(canWinNim(14));
    }
    public static boolean canWinNim(int n) {
        //n 余 4 不等于0 意味着 省下的不超过4就可以拿全部拿走
        return n % 4 != 0;
    }
}
