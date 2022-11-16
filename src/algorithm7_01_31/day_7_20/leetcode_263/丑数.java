package algorithm7_01_31.day_7_20.leetcode_263;

public class 丑数 {
    public static void main(String[] args) {
        System.out.println(isUgly(10));
    }

    public static boolean isUgly(int n) {
        //判断 进来数值小于 0 直接返回false
        if (n < 0) {
            return false;
        }
        int[] arr = {2, 3, 5};
        //增强for 只遍历一次
        for (int i : arr) {
            // 数值 % i == 0 成立 进入 否则执行for
            while (n % i == 0){
                // 数值 = 数值 除 i
                n /= i;
            }
        }
        // 到这里 如果 n == 1 返回ture 否则返回 false
        return n == 1;
    }
}
