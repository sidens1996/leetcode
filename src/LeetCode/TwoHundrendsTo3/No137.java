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
        int one = 0;
        int two = 0;
        for (int i = 0; i < nums.length; i++) {
            one = (~two) & (one ^ nums[i]);
            two = (~one) & (two ^ nums[i]);
        }
        return one;
    }

    public static void main(String[] args) {
        System.out.println(new No137().singleNumber(new int[]{1, 1, 1, 2}));
    }
}
