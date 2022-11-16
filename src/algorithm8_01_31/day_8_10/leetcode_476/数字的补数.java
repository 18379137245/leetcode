package algorithm8_01_31.day_8_10.leetcode_476;

/**
 * @projectName: leetcode
 * @package: algorithm8_01_31.day_8_10.leetcode_476
 * @className: 数字的补数
 * @author: DingXingYun
 * @description: TODO
 * @date: 2022/8/10 18:42
 * @version: 1.0
 */
public class 数字的补数 {
    public static void main(String[] args) {
        System.out.println(findComplement(1));
        int ans = 1;
        System.out.println(ans <<= 1);
        System.out.println(ans <<= 1);
        System.out.println(ans <<= 1);
    }

    public static int findComplement(int num) {
//        思路很简单
//        输入为 5 是 101
//        输出为 2 是 010
//        上下两个加起来就是 111 即2的3次方-1
//        输入为 8 是 1000
//        输出为 7 是 0111
//        上下两个加起来就是 1111 即2的4次方-1
//        同理
//                就可以知道
//        找到一个比num大的 2的n次幂的数 本题为ans
//        然后结果就是ans - num - 1

        long ans = 1;
        while (ans <= num) {
            ans <<= 1;// 等价于 a *= 2;
        }
        return (int) ans - 1 - num;
    }
}
