package LeetCode.OneTo100;

/**
 * @ClassName: No35
 * @Description: leetcode第35题，search insert position
 * @Author: Achilles
 * @Date: 02/01/2020  16:45
 * @Version: 1.0
 **/

public class No35 {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (low <= high){
            mid = (low + high) / 2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
}
