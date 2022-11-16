package algorithm7_01_31.day_7_28.leetcode_344;

public class 反转字符串 {
    public static void main(String[] args) {
        char[] s = {'a', 'b', 'c', 'd', 'e', 'f'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        //s.length / 2
        //只需要遍历一半的次数
        for (int i = 0; i < s.length / 2; i++) {
            //把第一个元素交给第三方
            char temp = s[i];
            //把最后一个元素给第一个元素  形成了赋值
            //s.length - 1 - i  这个i代表的已经被替换的次数 所以要减掉
            //不减的话一直跟最后的反复赋值
            s[i] = s[s.length - 1 - i];
            //把第三方得到的元素与最后一个元素替换  形成了赋值
            s[s.length - 1 - i] = temp;
        }
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
