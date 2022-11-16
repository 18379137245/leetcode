package algorithm7_01_31.day_7_11.leetcode_168;

public class Excel表列名称 {
    public static void main(String[] args) {

        System.out.println(convertToTitle(730));
    }

    public static String convertToTitle(int columnNumber) {
        //创建一个StringBuilder拼接字符
        StringBuilder sb = new StringBuilder();

        //循环判断数值成不成立
        while (columnNumber > 0) {
            //拿传进来的 （数值 - 1） % 26 + 1
            int a = (columnNumber - 1) % 26 + 1;//2
            //添加
            sb.append((char) (a - 1 + 'A'));//66 'B' 'A'
            //源值  = （源值 - a） / 26
            //源值 = 1;
            columnNumber = (columnNumber - a) / 26;

        }
        return sb.reverse().toString();//"AB"
    }
}
