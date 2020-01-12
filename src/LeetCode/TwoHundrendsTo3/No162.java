package LeetCode.TwoHundrendsTo3;

/**
 * @ClassName: No162
 * @Description: leetcode第162题，Find Peek Element
 * @Author: Achilles
 * @Date: 12/01/2020  13:13
 * @Version: 1.0
 **/

public class No162 {
    public int findPeakElement(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] > nums[mid + 1]) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}
