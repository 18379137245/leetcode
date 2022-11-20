package algorithm11_01_30.day_11_19.面试题0502;

/**
 * @projectName: leetcode
 * @package: algorithm11_01_30.day_11_19.面试题0502
 * @className: 二进制数转字符串
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/11/19 18:48
 * @version: 1.0
 */

public class 二进制数转字符串 {
    public static void main(String[] args) {
        System.out.println(printBin(0.625));
    }
    public static String printBin(double num) {
        StringBuffer ans = new StringBuffer("0.");

        while(ans.length() < 32 && num != 0){
            num *= 2;
            if(num >= 1){
                ans.append("1");
                num = num - 1;
            }else{
                ans.append("0");
            }
        }
        if(ans.length() >= 32 && num !=0) return "ERROR";
        return ans.toString();
    }
}
