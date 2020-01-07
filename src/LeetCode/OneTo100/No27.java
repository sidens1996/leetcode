package LeetCode.OneTo100;

/**
 * @ClassName: No27
 * @Description: leetcode第27题，remove element
 * @Author: Achilles
 * @Date: 02/01/2020  14:59
 * @Version: 1.0
 **/

public class No27 {

    public int removeElement(int[] nums, int val) {
        //还是使用快慢指针解决
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++){
            if (nums[fast] != val){
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }

    public static void main(String[] args) {

    }
}
