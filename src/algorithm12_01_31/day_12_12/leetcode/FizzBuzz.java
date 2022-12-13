package algorithm12_01_31.day_12_12.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        List<String> strings = fizzBuzz(3);
        System.out.println(Arrays.toString(strings.toArray()));
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
