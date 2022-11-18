package algorithm11_01_30.day_11_17.面试题05;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_17.面试题05
 * @className: 一次编辑
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/17 20:20
 * @version: 1.0
 */

public class 一次编辑 {
    public static void main(String[] args) {
        System.out.println(oneEditAway("pale", "palbc"));
    }

    public static boolean oneEditAway(String first, String second) {
        int lf = first.length(), ls = second.length();
        if (lf > ls)
            return oneEditAway(second, first);
        if (ls - lf > 1)
            return false;
        if (lf == ls) {
            int count = 0;
            for (int i = 0; i < lf; i++) {
                if (first.charAt(i) != second.charAt(i))
                    count += 1;
            }
            return count <= 1;
        }
        int i = 0, ofs = 0;
        while (i < lf) {
            if (first.charAt(i) != second.charAt(i + ofs)) {
                if (++ofs > 1)
                    return false;
            } else {
                i += 1;
            }
        }
        return true;
    }
}
