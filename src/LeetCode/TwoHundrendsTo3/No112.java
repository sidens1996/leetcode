package LeetCode.TwoHundrendsTo3;

import DataStructure.TreeNode;

/**
 * @ClassName: No112
 * @Description: leetcode第112题，hasPathSum
 * @Author: Achilles
 * @Date: 05/01/2020  18:54
 * @Version: 1.0
 **/

public class No112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        } else if (root.val == sum && root.left == null && root.right == null) {
            return true;
        }else {
            return hasPathSum(root.left, sum - root.val)
                    || hasPathSum(root.right, sum - root.val);
        }
    }
}
