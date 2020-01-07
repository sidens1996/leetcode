package LeetCode.OneTo100;

/**
 * @ClassName: No26
 * @Description: leetcode第26题，remove duplicates from sorted array
 * @Author: Achilles
 * @Date: 02/01/2020  14:26
 * @Version: 1.0
 **/

public class No26 {

    public int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++){
            if(nums[slow] != nums[fast]){
                slow++;
                if (fast != slow){
                    nums[slow] = nums[fast];
                }
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] aa = {1, 2};
        aa[1] = Integer.parseInt(null);
        System.out.println(aa.length);
    }
}
