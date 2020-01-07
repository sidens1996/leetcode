package LeetCode.TwoHundrendsTo3;

import DataStructure.TreeNode;

/**
 * @ClassName: No110
 * @Description: leetcode第110题，isBalanced
 * @Author: Achilles
 * @Date: 05/01/2020  16:22
 * @Version: 1.0
 **/

public class No110 {
    public boolean isBalanced(TreeNode root) {
        if (root != null) {
            return Math.abs(depth(root.left) - depth(root.right)) <= 1
                    && isBalanced(root.left)
                    && isBalanced(root.right);
        }else{
            return true;
        }
    }

    public int depth(TreeNode root) {
        if (root != null) {
            return Math.max(depth(root.left), depth(root.right)) + 1;
        } else {
            return 0;
        }
    }
}
