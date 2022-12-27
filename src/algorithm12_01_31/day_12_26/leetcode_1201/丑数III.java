package algorithm12_01_31.day_12_26.leetcode_1201;

public class 丑数III {
    public static void main(String[] args) {
        int n = 3, a = 2, b = 3, c = 5;
        System.out.println(nthUglyNumber(n, a, b, c));
    }

    public static int nthUglyNumber(int n, int a, int b, int c) {
        int l = 1, r = Integer.MAX_VALUE;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (check(mid, n, a, b, c)) r = mid;
            else l = mid + 1;
        }
        return r;
    }

    static boolean check(int mid, int n, int a, int b, int c) {
        long ab = lcm(a, b), ac = lcm(a, c), bc = lcm(b, c), abc = lcm(lcm(a, b), c);
        long cnt = (long) mid / a + mid / b + mid / c - mid / ac - mid / bc - mid / ab + mid / abc;
        return cnt >= n;
    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }
}
