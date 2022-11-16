package algorithm8_01_31.day_8_10.leetcode_482;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_10.leetcode_482
 * @className: 密钥格式化
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/10 19:51
 * @version: 1.0
 */
public class 密钥格式化 {
    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("---", 3));
    }

    public static String licenseKeyFormatting(String s, int k) {

        StringBuilder str = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            //判断元素 是否等于 '-'
            if(s.charAt(i) != '-'){
                //不等于 拼接字符串
                str.append(s.charAt(i));
                //计数
                count++;
                //判断 是否等于0
                if(count % k == 0){
                    //等于 拼接字符串
                    str.append("-");
                }
            }
        }
        //判断 字符串是否有元素 并且最后一个元素等于'-'
        if (str.length() > 0 && str.charAt(str.length() - 1) == '-') {
            //删除最后一个元素
            str.deleteCharAt(str.length() - 1);
        }
        return str.reverse().toString().toUpperCase();
    }
}
