package LeetCode.OneTo100;

/**
 * @ClassName: No53
 * @Description: leetcode第53题，Maximum Subarray
 * @Author: Achilles
 * @Date: 03/01/2020  19:06
 * @Version: 1.0
 **/

public class No53 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int cur = nums[0];
        int max = cur;
        for (int i = 1; i < nums.length; i++) {
            cur = nums[i] > cur + nums[i] ? nums[i] : nums[i];
            max = max > cur ? max : cur;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(new No53().maxSubArray(nums));
    }
}
