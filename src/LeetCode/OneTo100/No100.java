package LeetCode.OneTo100;

import DataStructure.TreeNode;

/**
 * @ClassName: No100
 * @Description: leetcode第100题，Same Tree
 * @Author: Achilles
 * @Date: 04/01/2020  17:51
 * @Version: 1.0
 **/

public class No100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null && p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }
}
