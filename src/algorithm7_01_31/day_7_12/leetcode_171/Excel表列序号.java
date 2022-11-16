package algorithm7_01_31.day_7_12.leetcode_171;

public class Excel表列序号 {
    public static void main(String[] args) {

        System.out.println(convertToTitle("BAAA"));
    }

    public static int convertToTitle(String columnNumber) {

        int sum = 0;
        int multiple  = 1;
        //从最后一个元素开始 一次减一
        for (int i = columnNumber.length() - 1; i >= 0; i--) {
            //得到元素的值
            int k = columnNumber.charAt(i) - 'A' + 1;
            //初始值加上 元素值
            sum += k * multiple;//1  26  676 35152
            //走完一次翻26倍 A-Z;
            multiple *= 26;//26 // 676 17576
        }
        return sum;//返回最后相加的值
    }
}
