package algorithm8_01_31.day_8_07.leetcode_455;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_07.leetcode_455
 * @className: 分发饼干
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/6 20:40
 * @version: 1.0
 */
public class 分发饼干 {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        //排序
        Arrays.sort(g);
        Arrays.sort(s);
        //g的索引
        int i = 0;
        //s的索引
        int j = 0;
        while (i < g.length && j < s.length) {
            //只有满足条件，才能喂好孩子
            if (g[i] <= s[j]) {
                i++;
            }
            j++;
        }
        return i;
    }
}
