package algorithm7_01_31.day_6_30.leetcode_136;

/**
 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

 */
public class 只出现一次的数字 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,2,2,2};
        System.out.println(singleNumber(nums));

    }
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

//    public static int singleNumber(int[] nums) {
//        Set<Integer> set = new HashSet();
//        for (int num :nums){
//            if(!set.add(num)){
//                //如果添加失败，说明这个值
//                //在集合Set中存在，我们要
//                //把他给移除掉
//                set.remove(num);
//            }
//        }
//        //最终集合Set中只有一个元素，我们直接返回
//        return (int)set.toArray()[0];
//    }
}
