package algorithm8_01_31.day_8_05.leetcode_415;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.leetcode_8_05.leetcode_415
 * @className: 字符串相加
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/4 19:55
 * @version: 1.0
 */
public class 字符串相加 {
    public static void main(String[] args) {
        System.out.println(addStrings("123", "123"));
    }
    public static String addStrings(String num1, String num2) {
        //定义两个变量 代表索引
        int i = num1.length() - 1, j = num2.length() - 1;
        //代表余数
        int add = 0;
        //定义一个字符串
        StringBuffer ans = new StringBuffer();
        //循环条件满足其中一个
        //i >= 0 || j >= 0 i >= 0 || j >= 0
        //
        while (i >= 0 || j >= 0 || add != 0) {
            //给变量 x 进行赋值 三元运算 成立 选第一个 不成立 选第二个
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            //给变量 result 进行赋值 x + y + add
            int result = x + y + add;
            //给字符串添加元素 进行拼接 result % 10 得到个位数
            ans.append(result % 10);
            //给 add 赋值 result / 10 得到10位  不满10得0
            add = result / 10;
            //最后一位用完了 减一
            i--;
            j--;
        }
        // ans.reverse() 将字符串反转 StringBuffer
        // toString() 转String类型字符串
        return ans.reverse().toString();
    }
}
