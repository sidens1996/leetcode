package LeetCode.TwoHundrendsTo3;

import java.util.Arrays;
import java.util.Collections;

/**
 * @ClassName: No154
 * @Description: leetcode154题，Find Minimum in Rotated Sorted Array II
 * @Author: Achilles
 * @Date: 11/01/2020  20:32
 * @Version: 1.0
 **/

public class No154 {
    public int findMin(int[] nums) {
//        int low = 0, high = nums.length - 1;
//        while (low < high) {
//            int mid = low + ((high - low) >> 1);
//            if (nums[mid] > nums[mid + 1]) return nums[mid + 1];
//            else if (nums[mid] >= nums[high]) low = mid;
//            else high = mid;
//        }
//        return nums[low];
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) >> 1;
            if (nums[mid] > nums[high]) low = mid + 1;
            else if (nums[mid] < nums[high]) high = mid;
            else high--;
        }
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 3};
        System.out.println(new No154().findMin(nums));
    }
}
