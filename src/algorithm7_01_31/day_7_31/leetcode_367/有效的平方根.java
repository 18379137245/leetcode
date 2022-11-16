package algorithm7_01_31.day_7_31.leetcode_367;

public class 有效的平方根 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(3));
    }

    public static boolean isPerfectSquare(int num) {
        //定义左右两端的初始化值
        int left = 0, right = num;
        //循环条件左边小于等于右边
        while (left <= right) {
            //找到中间值
            int mid = (right - left) / 2 + left;
            //square是中间值的平方值 等于传进来的值就返回true
            long square = (long) mid * mid;
            //判断中间值的平方值 小于传进来的值 就给左边赋值中间值加1
            if (square < num) {
                left = mid + 1;
            } //判断中间值的平方值 大于传进来的值 就给右边赋值中间值加1
            else if (square > num) {
                right = mid - 1;
            }else {
                return true;
            }
        }
        //到这证明进来的值不是一个平方值
        return false;
    }
}
