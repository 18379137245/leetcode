package algorithm9_01_30.day_9_03.leetcode_12;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName: leetcode
 * @package: algorithm9_01_30.day_9_03.leetcode_12
 * @className: 整数转罗马数字
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/9/3 20:09
 * @version: 1.0
 */

public class 整数转罗马数字 {
    public static void main(String[] args) {
        System.out.println(intToRoman(20));
    }

    public static String intToRoman(int num) {
        String[] key = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        Integer[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuffer str = new StringBuffer();
        while (num > 0){
            for (int i = 0; i < value.length; i++) {
                if(num >= value[i]){
                    str.append(key[i]);
                    num -= value[i];
                    break;
                }
            }
        }
        return str.toString();
    }
}
