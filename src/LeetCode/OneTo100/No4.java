package LeetCode.OneTo100;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: No4
 * @Description: leetcode第四题，Median of Two Sorted Arrays
 * @Author: Achilles
 * @Date: 01/01/2020  13:06
 * @Version: 1.0
 **/

public class No4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int min = Math.min(nums1.length, nums2.length);
        int i = 0;
        int j = 0;
        for (; i < min && j < min;){
            if (nums1[i] < nums2[j]){
                list.add(nums1[i++]);
            }else if (nums1[i] > nums2[j]){
                list.add(nums2[j++]);
            }else{
                list.add(nums1[i++]);
                list.add(nums2[j++]);
            }
        }
        while (i < nums1.length){//j = nums2.length
            if (j != nums2.length){
                if (nums1[i] < nums2[j]){
                    list.add(nums1[i++]);
                }else if (nums1[i] > nums2[j]){
                    list.add(nums2[j++]);
                }else{
                    list.add(nums1[i++]);
                    list.add(nums2[j++]);
                }
            }else{
                list.add(nums1[i++]);
            }
        }
        while (j < nums2.length){// i = numsq1.length
            if (i != nums1.length){
                if (nums1[i] < nums2[j]){
                    list.add(nums1[i++]);
                }else if (nums1[i] > nums2[j]){
                    list.add(nums2[j++]);
                }else{
                    list.add(nums1[i++]);
                    list.add(nums2[j++]);
                }
            }else{
                list.add(nums2[j++]);
            }
        }
        if (list.size() % 2 == 0){
            return ((list.get(list.size() / 2) + list.get((list.size() / 2) - 1)) / 2.0);
        }else{
            return list.get(list.size() /2);
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(new No4().findMedianSortedArrays(nums1, nums2));
    }
}
