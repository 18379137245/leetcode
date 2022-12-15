package algorithm12_01_31.day_12_14.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 杨辉三角形 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(generate(5).toArray()));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list1 = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list1.add(1);
                } else {
                    list1.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }
            }
            list.add(list1);
        }
        return list;
    }
}
