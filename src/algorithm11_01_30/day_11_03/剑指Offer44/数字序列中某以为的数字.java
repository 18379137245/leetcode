package algorithm11_01_30.day_11_03.剑指Offer44;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_03.剑指Offer44
 * @className: 数字序列中某以为的数字
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/3 19:20
 * @version: 1.0
 */

public class 数字序列中某以为的数字 {

    public static void main(String[] args) {
        System.out.println(findNthDigit(19));
    }

    public static int findNthDigit(int n) {
        int d = 1, count = 9;
        while (n > (long) d * count) {
            n -= d * count;
            d++;
            count *= 10;
        }
        int index = n - 1;
        int start = (int) Math.pow(10, d - 1);
        int num = start + index / d;
        int digitIndex = index % d;
        int pow = (int) (Math.pow(10, d - digitIndex - 1));
        int digit = (num / pow) % 10;
        return digit;

    }
}
