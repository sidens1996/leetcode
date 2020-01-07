package LeetCode.TwoHundrendsTo3;

import DataStructure.TreeNode;

/**
 * @ClassName: No129
 * @Description: leetcode第129题，Sum Root to Leaf Numbers
 * @Author: Achilles
 * @Date: 07/01/2020  21:04
 * @Version: 1.0
 **/

public class No129 {

    int sum = 0;

    public int sumNumbers(TreeNode root) {
        sum(0, root);
        return sum;
    }

    public void sum(int val, TreeNode root) {
        if (root == null) {
            return;
        }
        int k = (val * 10 + root.val);
        if (root.left == null && root.right == null) {
            sum += k;
        }
        sum(k, root.left);
        sum(k, root.right);
    }
}
