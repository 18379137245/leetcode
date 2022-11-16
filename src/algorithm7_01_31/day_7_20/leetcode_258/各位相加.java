package algorithm7_01_31.day_7_20.leetcode_258;

public class 各位相加 {
    public static void main(String[] args) {

        System.out.println(addDigits1(10));
    }

    public static int addDigits1(int num) {
        while (num > 9) {
            int unit = num % 10;
            int tens = num / 10;
            num = tens + unit;
            if (num < 10) {
                return num;
            }
        }
        return num;
    }
    public static int addDigits2(int num) {
        if(num == 9){
            return num;
        }else {
            return num % 9;
        }
    }

    public static int addDigits3(int num) {
         return (num - 1) % 9 + 1;
    }
}
