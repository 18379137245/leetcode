package algorithm7_01_31.day_7_19.leetcode_231;

public class 二的幂 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo3(4));
    }
    /**
     * n & 1 获取n末尾的一位
     * 1 & 1 返回 1
     * 0 & 1 返回 0
     * 然后放大 左移31 - i位，从最低位变成最高位！！！
     * return n > 0 && (n & (n - 1)) == 0;
     */
    public static boolean isPowerOfTwo3(int n) {
        System.out.println((n - 1));
        System.out.println(n & 3);
        System.out.println(4 & 3);
        System.out.println(9&5);
//        10000  1111
        System.out.println(n & (n - 1));
        return n > 0 && (n & (n - 1)) == 0;
    }
    public static boolean isPowerOfTwo(int n) {
        //进来数值 小于直接false
        if (n < 1) return false;
        //能到这证明n >= 1 n == 1进不了循环 直接返回 ture
        while (n != 1) {
            //数值 n % 2 == 1 证明 n不是一个偶数
            if (n % 2 == 1) return false;
            //n /= 2 如果等于1 可以使while循环判断不成立 跳出循环返回true 否则继续 循环
            n = n / 2;
        }
        return true;
    }

    public static boolean isPowerOfTwo1(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 2 == 1) {
            return false;
        } else if (n > 3) {
            n /= 2;
        } else if (n / 2 == 1) {
            return true;
        }
        return isPowerOfTwo(n);
    }
}
