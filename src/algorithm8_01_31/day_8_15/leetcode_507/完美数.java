package algorithm8_01_31.day_8_15.leetcode_507;

import java.util.HashSet;
import java.util.TreeSet;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_15.leetcode_507
 * @className: 完美数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/15 20:00
 * @version: 1.0
 */

public class 完美数 {
    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(1));
    }

    public static boolean checkPerfectNumber(int num) {
        //先把1带上
        int res = 1;
        //开根号
        int limit = (int) Math.sqrt(num);
        for (int i = 2; i <= limit; i++) {
            //判断 对i取余 == 0
            //证明是i的倍数
            if (num % i == 0) {
                //把两个数加上
                res += i;
                res += num / i;
            }
        }
        //最后结果跟数值相等 并且 num不等于1
        return res == num && num != 1;
    }

    public static boolean checkPerfectNumber1(int num) {
        if (num == 1) return false;
        int sum = 0;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 1; i <= num / 2; i++) {
            if ((num % i) == 0) {
                set.add(i);
                set.add(num / i);
            }
        }
        for (Integer integer : set) {
            sum += integer;
            System.out.println(integer);
        }
        sum -= num;
        ;
        return sum == num;
    }
}
