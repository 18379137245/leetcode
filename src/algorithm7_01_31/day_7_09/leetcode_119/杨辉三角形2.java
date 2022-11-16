package algorithm7_01_31.day_7_09.leetcode_119;

import java.util.ArrayList;
import java.util.List;

public class 杨辉三角形2 {
    public static void main(String[] args) {

        List<Integer> generate = generate(3);
        System.out.println(generate);

    }

    public static List<Integer> generate(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
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
        return list.get(rowIndex);
    }
}
