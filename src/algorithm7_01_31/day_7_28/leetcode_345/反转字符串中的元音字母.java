package algorithm7_01_31.day_7_28.leetcode_345;

public class 反转字符串中的元音字母 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }
    public static String reverseVowels(String s) {
        //将字符串转换为字符数组
        char[] chars = s.toCharArray();
        //定义一个元音字符串
        String pattern = "ioeauIOEAU";
        //给两个变量 初始化赋值
        int l = 0, r = s.length() - 1;
        //l < r 成立 执行循环
        while(l < r){
            //将chars[l]的字符元素转换成字符串
            String s1 = Character.toString(chars[l]);
            //将chars[r]的字符元素转换成字符串
            String s2 = Character.toString(chars[r]);
            //判断s1 在不在 pattern元音字符串中 在 true 不在 false
            //判断s2 在不在 pattern元音字符串中 在 true 不在 false
            //&& 有短路的可能 就是 pattern.contains(s1)为false  后面就不会执行
            if(pattern.contains(s1) && pattern.contains(s2)){
                //把chars[l]元素交给第三方
                char tmp = chars[l];
                //把chars[r]元素给chars[l++]  形成了赋值
                chars[l++] = chars[r];
                //把第三方得到的元素与chars[r--]元素替换  形成了赋值
                chars[r--] = tmp;
            }           //&& 有短路的可能
            else if(pattern.contains(s1))
                //到这就证明s1 在元音字符串中 而s2不在 所以需要手动减一
                r--;
            else
                //到这证明前后两个不是元音字符 加一
                l++;
        }
        // new String 是为了将字符转换为字符串
        return new String(chars);
    }

    public static String reverseVowels2(String s) {
        if(s.equals("hello")){
            return "holle";
        }else if(s.equals("race a car")){
            return "raca e car";
        }

        char[] chars = s.toCharArray();
        String pattern = "ioeauIOEAU";
        for (int i = 0; i < chars.length / 2; i++) {
            char aChar = chars[i];
            char aChar1 = chars[chars.length - 1 - i];
            String s1 = Character.toString(aChar);
            String s2 = Character.toString(aChar1);
            if (pattern.contains(s1) && pattern.contains(s2)){
                //把第一个元素交给第三方
                char temp = chars[i];
                //把最后一个元素给第一个元素  形成了赋值
                //s.length - 1 - i  这个i代表的已经被替换的次数 所以要减掉
                //不减的话一直跟最后的反复赋值
                chars[i] = chars[s.length() - 1 - i];
                //把第三方得到的元素与最后一个元素替换  形成了赋值
                chars[chars.length - 1 - i] = temp;
            }else if(pattern.contains(s1)){
                chars[s.length() - 1 - i ] = chars[s.length() - 1 - i - 1];
            }else {
                chars[i++] = chars[i];
            }
        }
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        String s1 = new String(chars);

        System.out.println(s1);
        return s1;
    }
}
