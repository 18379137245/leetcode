package algorithm8_01_31.day_8_05.leetcode_434;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.leetcode_8_05.leetcode_434
 * @className: 字符串中单词数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/5 20:22
 * @version: 1.0
 */
public class 字符串中单词数 {
    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John"));
    }
    public static int countSegments(String s) {
        //定义一个计数变量
        int count = 0;
        //循环s.length次
        for (int i = 0; i < s.length(); i++) {
            //判断
            // (i == 0 || s.charAt(i - 1) == ' ') 满足一个就行 并且满足 s.charAt(i) != ' '
            // s.charAt(i - 1) == ' ') 代表前一个元素 是空格
            // s.charAt(i) != ' ' 代表当前的元素不是空格
            if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ') {
                //计数++
                count++;
            }
        }
        //返回数量
        return count;
    }
}
