package LeetCode.TwoHundrendsTo3;

import java.util.HashMap;

/**
 * @ClassName: No167
 * @Description: leetcode第167题，Two Sum II - Input array is sorted
 * @Author: Achilles
 * @Date: 19/01/2020  20:34
 * @Version: 1.0
 **/

public class No167 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                result[0] = hashMap.get(nums[i]);
                result[1] = i;
                break;
            }
            hashMap.put(target - nums[i], i);
        }
        return result;
    }

    public int[] twoSum2(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        while (low < high) {
            if (numbers[low] + numbers[high] < target) low++;
            else if (numbers[low] + numbers[high] > target) high--;
            else return new int[]{low, high};
        }
        return new int[]{-1, -1};
    }
}
