package LeetCode.TwoHundrendsTo3;

import DataStructure.TreeNode;

/**
 * @ClassName: No04
 * @Description: leetcode第104题,maxDepth
 * @Author: Achilles
 * @Date: 04/01/2020  19:10
 * @Version: 1.0
 **/

public class No104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }
}
