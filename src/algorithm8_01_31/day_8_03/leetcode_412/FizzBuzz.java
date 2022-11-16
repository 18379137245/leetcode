package algorithm8_01_31.day_8_03.leetcode_412;

import java.util.ArrayList;
import java.util.List;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_03.leetcode_412
 * @className: FizzBuzz
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/3 20:34
 * @version: 1.0
 */
public class FizzBuzz {
    public static void main(String[] args) {
        List<String> list = fizzBuzz(3);
        list.forEach(System.out::println);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                list.add("FizzBuzz");
            } else if ((i + 1) % 3 == 0) {
                list.add("Fizz");
            } else if ((i + 1) % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add("" + (i + 1));
            }
        }
        return list;
    }
}
