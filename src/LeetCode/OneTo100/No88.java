package LeetCode.OneTo100;

import java.util.Arrays;

/**
 * @ClassName: No88
 * @Description: leetcode第88题，merge sorted array
 * @Author: Achilles
 * @Date: 04/01/2020  14:46
 * @Version: 1.0
 **/

public class No88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        System.arraycopy(nums2, 0, nums1, m, n);
//        Arrays.sort(nums1);
        int end1 = m - 1;
        int end2 = n - 1;
        int end3 = m + n - 1;
        while (end1 >= 0 && end2 >= 0) {
            nums1[end3--] = nums1[end1] > nums2[end2] ? nums1[end1--] : nums2[end2--];
        }
        // 如果结束后还有元素没有比较完
        // 如果是nums1数组中还有没有比较完的数组，不用管，否则只用移入nums1数组即可
        System.arraycopy(nums2, 0, nums1, 0, end2 + 1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        new No88().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
