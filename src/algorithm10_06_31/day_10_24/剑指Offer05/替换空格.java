package algorithm10_06_31.day_10_24.剑指Offer05;

/**
 * @projectName: leetcode
 * @package: algorithm10_06_31.day_10_24.剑指Offer05
 * @className: 替换空格
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/10/24 20:24
 * @version: 1.0
 */

public class 替换空格 {
    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
    public static String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }
}
