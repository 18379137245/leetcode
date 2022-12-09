package algorithm12_01_31.day_12_09.leetcode_1780;

public class 判断一个数字是否可以表示成三的幂的和 {
    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(12));
    }

    public static boolean checkPowersOfThree(int n) {
        while (n != 0) {
            if (n % 3 == 0 || n % 3 == 1) n = n / 3; // 满足三进制
            else return false; // 不满足三进制，返回false
        }
        return true;
    }
}
