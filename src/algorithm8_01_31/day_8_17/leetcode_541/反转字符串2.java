package algorithm8_01_31.day_8_17.leetcode_541;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_17.leetcode_541
 * @className: 反转字符串2
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/17 20:39
 * @version: 1.0
 */

public class 反转字符串2 {
    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg", 2));
    }

    public static String reverseStr(String s, int k) {
        //定义 StringBuilder字符串
        StringBuilder res = new StringBuilder();
        int index = 0; //索引
        int length = s.length();//总长度
        while (index < length) {
            //截取长度
            int end = Math.min(index + k, length);
            //截取 s字符串 索引到截取长度的字符串
            //变成新字符串
            StringBuilder temp = new StringBuilder(s.substring(index, end));
            //
            if ((index / k) % 2 == 0){
                //res + temp.reverse()
                //添加新字符串反转后的字符串
                res.append(temp.reverse());
            } else{
                //添加新字符串
                res.append(temp);
            }
            //更换索引
            index = end;
        }
        //返回字符串
        //toString();转字符串
        return res.toString();
    }
}
