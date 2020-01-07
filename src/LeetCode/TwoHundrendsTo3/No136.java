package LeetCode.TwoHundrendsTo3;

/**
 * @ClassName: No136
 * @Description: leetcode136题，Single Number
 * @Author: Achilles
 * @Date: 07/01/2020  22:17
 * @Version: 1.0
 **/

public class No136 {

    public int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new No136().singleNumber(new int[]{4, 1, 2, 1, 2}));
    }
}
