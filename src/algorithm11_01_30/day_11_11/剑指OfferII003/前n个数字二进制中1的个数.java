package algorithm11_01_30.day_11_11.剑指OfferII003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_11.剑指OfferII003
 * @className: 前n个数字二进制中1的个数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/11 19:04
 * @version: 1.0
 */

public class 前n个数字二进制中1的个数 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }

    public static int[] countBits(int n) {

        ArrayList<Integer> list = new ArrayList<>();
        int k = 0;
        for (int i = 0; i <= n; i++) {
            StringBuffer str = new StringBuffer();
            int count = 0;
            k = i;
            while (k > 0) {
                int t = k % 2;
                str.append(t);
                k /= 2;
            }
            String s = str.toString();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    count++;
                }
            }
            list.add(count);
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}
