package algorithm11_01_30.day_11_19.面试题0508;

import java.util.Arrays;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_19.面试题0508
 * @className: 绘制直线
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/19 19:04
 * @version: 1.0
 */

public class 绘制直线 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(drawLine(3, 96, 0, 95, 0)));
    }

    public static int[] drawLine(int length, int w, int x1, int x2, int y) {
        StringBuilder sb = new StringBuilder();
        // 计算字符串的哪些位置需要置为1。
        int start = y * w + x1, end = y * w + x2;
        for(int i = 0;i < 32 * length; ++i){
            if(sb.length() >= start && sb.length() <= end){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }

        int[] result = new int[length];
        // 以32位为单位截取字符串转化为整型。
        for(int i = 0;i < length; ++i){
            // 注意此处int类型无法处理32位的1。可以使用Integer.parseUnsignedInt()或者Long.parseLong()方法。
            result[i] = Integer.parseUnsignedInt(sb.substring(i * 32, i * 32 + 32), 2);
        }
        return result;
    }
}
