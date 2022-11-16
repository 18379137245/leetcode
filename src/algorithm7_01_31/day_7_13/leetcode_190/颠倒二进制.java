package algorithm7_01_31.day_7_13.leetcode_190;

public class 颠倒二进制 {
    public static void main(String[] args) {
        System.out.println(reverseBits(211121112));
        //                                128 64 32 16 8 4 2
        //
    }

    private static int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            /**
             * n & 1 获取n末尾的一位
             * 1 & 1 返回 1
             * 0 & 1 返回 0
             * 然后放大 左移31 - i位，从最低位变成最高位！！！
             */
            ans = (ans << 1) + (n & 1);
            /**
             * 每次循环后 n向右移一位即缩小一倍！
             */
            n = n >> 1;
        }
        return ans;
//        return Integer.reverse(n);
    }

}
