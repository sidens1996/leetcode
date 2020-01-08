package LeetCode.TwoHundrendsTo3;

/**
 * @ClassName: No137
 * @Description: leetcode第137题，Single Number II
 * @Author: Achilles
 * @Date: 07/01/2020  22:25
 * @Version: 1.0
 **/

public class No137 {

    public int singleNumber(int[] nums) {
//        int one = 0;
//        int two = 0;
//        for (int i = 0; i < nums.length; i++) {
//            one = (~two) & (one ^ nums[i]);
//            two = (~one) & (two ^ nums[i]);
//        }
//        return one;
        // k = 3(11), p = 1(01), 则m = 2
        int x2 = 0, x1 = 0, mask = 0;
        for (int num : nums) {
            x2 ^= (x1 & num);
            x1 ^= num;
            mask = ~(x1 & x2);
            x2 &= mask;
            x1 &= mask;
        }
        return x1;
    }

    public static void main(String[] args) {
        System.out.println(new No137().singleNumber(new int[]{1, 1, 1, 2}));
    }
}
