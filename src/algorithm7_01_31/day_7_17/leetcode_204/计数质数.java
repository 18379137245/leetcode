package algorithm7_01_31.day_7_17.leetcode_204;

public class 计数质数 {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }
    public static int countPrimes(int n) {
        //定义变量ans设置为0
        int ans = 0;
        //for循环传进来多少数值 从2 到 数值的循环
        for (int i = 2; i < n; ++i) {
            //变量 ans += 1 或者 0;
            //isPrime(i) 调用 isPrime方法
            //isPrime(i) ? 1 : 0    isPrime(i)是ture  就返回 1  否则返回 0;
            ans += isPrime(i) ? 1 : 0;
        }
        //返回调用者
        return ans;
    }

    public static boolean isPrime(int x) {
        //for循环传进来多少数值 从2 到 循环条件  数值的循环
        //(i * i <= x) 不成立就直接跳出 返回ture
        for (int i = 2; i * i <= x; ++i) {
            //数值 % i == 0 代表 数值 是一个偶数 返回false
            if (x % i == 0) {
                //能进来的都是偶数 返回false
                return false;
            }
        }
        //能到这的都是质数
        return true;
    }

//    public static int countPrimes(int n) {
////        if (n <= 2) {
////            return 0;
////        }
//        long start = System.currentTimeMillis();
//        int sum = 0, i = 0, j = 0;
//        for (i = 0; i < n; i++) {
//            for (j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    break;
//                }
//            }
//            if (i == j) {
//                sum++;
//            }
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);
//        return sum;
//    }
}
