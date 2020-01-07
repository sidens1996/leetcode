package LeetCode.TwoHundrendsTo3;

import DataStructure.TreeNode;
import com.sun.media.jfxmedia.events.PlayerStateListener;

/**
 * @ClassName: No114
 * @Description: leetcode第114题，flatten binary tree to linked list
 * @Author: Achilles
 * @Date: 06/01/2020  17:54
 * @Version: 1.0
 **/

public class No114 {

    TreeNode last = null;

    public void flatten(TreeNode root) {
        if (root != null) {
            flatten(root.right);
            flatten(root.left);
            root.right = last;
            root.left = null;
            last = root;
        }
    }
}
