package LeetCode.TwoHundrendsTo3;

/**
 * @ClassName: No153
 * @Description: leetcode第153题, Find Minimum in Rotated Sorted Array
 * @Author: Achilles
 * @Date: 11/01/2020  20:05
 * @Version: 1.0
 **/

public class No153 {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;;
        while (low < high) {
            int mid = low + (high - low) >> 1;
            if (nums[mid] > nums[mid + 1]) return nums[mid + 1];
            else if (nums[mid] > nums[high]) low = mid;
            else high = mid;
        }
        return nums[low];
    }
}
