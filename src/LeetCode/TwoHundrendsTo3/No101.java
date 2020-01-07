package LeetCode.TwoHundrendsTo3;

import DataStructure.TreeNode;

/**
 * @ClassName: No101
 * @Description: leetcode第101题, Symmetric Tree
 * @Author: Achilles
 * @Date: 04/01/2020  18:23
 * @Version: 1.0
 **/

public class No101 {
    public boolean isSymmetricTree(TreeNode root) {
        if (root != null) {
            return isSymmetric(root.left, root.right);
        } else {
            return true;
        }
    }

    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left != null && right != null && left.val == right.val) {
            return isSymmetric(left.left, right.right)
                    && isSymmetric(left.right, right.left);
        } else {
            return false;
        }
    }
}
