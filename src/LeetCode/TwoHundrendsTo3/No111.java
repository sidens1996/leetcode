package LeetCode.TwoHundrendsTo3;

import DataStructure.TreeNode;

/**
 * @ClassName: No111
 * @Description: leetcode第111题，minDepth
 * @Author: Achilles
 * @Date: 05/01/2020  17:03
 * @Version: 1.0
 **/

public class No111 {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null || root.right == null) {
            return Math.max(minDepth(root.left), minDepth(root.right)) + 1;
        } else {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        System.out.println(new No111().minDepth(root));
    }
}
