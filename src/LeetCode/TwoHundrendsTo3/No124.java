package LeetCode.TwoHundrendsTo3;

import DataStructure.TreeNode;

/**
 * @ClassName: No124
 * @Description: leetcode第124题，Binary Tree Maximum Path Sum
 * @Author: Achilles
 * @Date: 07/01/2020  19:02
 * @Version: 1.0
 **/

public class No124 {

    int max = 0;

    public int maxPathSum(TreeNode root) {
        getMax(root);
        return max;
    }

    public int getMax(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = Math.max(getMax(root.left), 0);
        int rightMax = Math.max(getMax(root.right), 0);
        int path = root.val + leftMax + rightMax;
        max = Math.max(max, path);
        return root.val + Math.max(leftMax, rightMax);
    }
}
