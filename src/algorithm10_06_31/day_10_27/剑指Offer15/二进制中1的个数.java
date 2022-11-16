package algorithm10_06_31.day_10_27.剑指Offer15;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_27.剑指Offer15
 * @className: 二进制中1的个数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/27 21:28
 * @version: 1.0
 */

public class 二进制中1的个数 {
    public static void main(String[] args) {
        System.out.println(hammingWeight(127));
    }

    public static int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
//        String s = Integer.toBinaryString(n);
//        int count = 0;
//        for (int i = 0; i < s.length(); i++){
//            if (s.charAt(i) == '1')
//                count++;
//        }
//        return count;
    }
}
