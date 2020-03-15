package LeetCode.TwoHundrendsTo3;

/**
 * @ClassName: No169
 * @Description: Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @Author: Achilles
 * @Date: 15/03/2020  21:59
 * @Version: 1.0
 **/

public class No169 {
    public int majorityElement(int[] nums) {
        // 摩尔计数法
        int count = 1, res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                res = nums[i];
            }
            if (res == nums[i]) {
                count++;
            } else {
                count--;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
