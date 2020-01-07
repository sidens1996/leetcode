package LeetCode.TwoHundrendsTo3;

import DataStructure.TreeNode;

/**
 * @ClassName: No108
 * @Description: leetcode第108题，sortedArrayToBST
 * @Author: Achilles
 * @Date: 05/01/2020  13:41
 * @Version: 1.0
 **/

public class No108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left + right) >> 1;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, left, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, right);
        return root;
    }

    public static void main(String[] args) {
        new No108().sortedArrayToBST(new int[]{-10, -3, -0, 5, 9}).levelOrder();
    }
}
