package algorithm7_01_31.day_7_14.leetcode_191;

public class 位1的个数 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(010111101101));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 31; i++) {
            count+= n & 1;
            n >>= 1;
        }
        return count;
    }
}
