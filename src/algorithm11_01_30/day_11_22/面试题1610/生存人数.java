package algorithm11_01_30.day_11_22.面试题1610;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_22.面试题1610
 * @className: 生存人数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/22 19:22
 * @version: 1.0
 */

public class 生存人数 {
    public static void main(String[] args) {
        int[] birth = {1900, 1901, 1950,1902}, death = {1948, 1947, 2000,1980};
        System.out.println(maxAliveYear(birth, death));
    }

    public static int maxAliveYear(int[] birth, int[] death) {
        Arrays.sort(birth);
        Arrays.sort(death);
        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;
        map.put(birth[0], 1);
        int max = 1;
        for (int i = 1; i < birth.length; i++) {
            int count = map.getOrDefault(birth[i - 1], 0) + 1;
            while (birth[i] > death[index]) {
                index++;
                count--;
            }
            map.put(birth[i], count);
            max = Math.max(max, count);
        }
        for (int i : birth) {
            if (map.get(i) == max) return i;
        }
        return 1;
    }
}
